package trabajoPesado;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.*;
import com.opencsv.bean.CsvToBeanBuilder;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.schedulers.Schedulers;
import model.*;


public class procesarCliente {
	
	private List<cliente> clientes = new ArrayList<>();
	private List<paciente> pacientes = new ArrayList<>();
	private List<razas> raza = new ArrayList<>();
	private List<hc> hcl = new ArrayList<>();
	private List<vacuna> laVacu = new ArrayList<>();
	private ArrayList<informe> informe = new ArrayList<>();
	private informe infoTemp = new informe();
	private FileWriter fw;
	private BufferedWriter bw;
	private SimpleDateFormat formateo = new SimpleDateFormat("dd-MM-yyyy");	
	
	
	
	public Observable<List<cliente>> obtenerCliente (File arc){
				
		Observable<List<cliente>> obs = new Observable<List<cliente>>() {

			@Override
			protected void subscribeActual(@NonNull Observer<? super @NonNull List<cliente>> ob) {
				ob.onNext(iniClientes(arc));
				ob.onComplete();			
			}
			
		}.subscribeOn(Schedulers.io());
			
		return obs;
	}
	
	public Observable<List<paciente>> obtenerPaciente (File arc){
		
		Observable<List<paciente>> obs = new Observable<List<paciente>>() {

			@Override
			protected void subscribeActual(@NonNull Observer<? super @NonNull List<paciente>> ob) {
				ob.onNext(iniPacientes(arc));
				ob.onComplete();			
			}
			
		}.subscribeOn(Schedulers.io());
			
		return obs;
	}
	
	public Observable<List<razas>> obtenerRazas (File arc){
		
		Observable<List<razas>> obs = new Observable<List<razas>>() {

			@Override
			protected void subscribeActual(@NonNull Observer<? super @NonNull List<razas>> ob) {
				ob.onNext(iniRaza(arc));
				ob.onComplete();			
			}
			
		}.subscribeOn(Schedulers.io());
			
		return obs;
	}
	
	public Observable<List<hc>> obtenerHC(File arc) {

		Observable<List<hc>> obs = new Observable<List<hc>>() {

			@Override
			protected void subscribeActual(@NonNull Observer<? super @NonNull List<hc>> ob) {
				ob.onNext(iniHC(arc));
				ob.onComplete();			
			}
			
		}.subscribeOn(Schedulers.io());
			
		return obs;
	}
	
	public Observable<List<vacuna>> obtenerLaVacu(File arc) {
		
		Observable<List<vacuna>> obs = new Observable<List<vacuna>>() {

			@Override
			protected void subscribeActual(@NonNull Observer<? super @NonNull List<vacuna>> ob) {
				ob.onNext(iniLaVacuu(arc));
				ob.onComplete();			
			}
			
		}.subscribeOn(Schedulers.io());
			
		return obs;
	}
	
	public Completable generarArchivos() {
	
		Completable comp = Completable.fromRunnable(()->{
			
			if (!(clientes.isEmpty())) {
				
				//Guardo clientes en informes
				for (cliente cli : clientes) {
					infoTemp.setCliente(cli);
					informe.add(infoTemp);
					infoTemp = new model.informe();
				}
				
				//Guardo pacientes en clientes
				for (informe info : informe) {
					
					for (int i = 0;i<pacientes.size();i++) {
						if (info.getCliente().getIDCLIENTE().equals(pacientes.get(i).getIDCLIENTE())) {
							info.setPacientes(pacientes.get(i));
						}
					}		
				}
				
				//Guardo HC en pacientes
				//1 - recorro toda la lista de informes
				for (informe info : informe) {
					//2 - por cada cliente, obtengo la cantidad de pacientes que tengo
					// y recorro la lista de hc en busqueda de hc correspondiente al paciente
					for(int i = 0; i<info.getPacientes().size();i++) {
						for (hc hcl : hcl) {
							if(info.getPaciente(i).getIDPACIENTE().equals(hcl.getIDPACIENTE())) {
								info.getPaciente(i).setHisClin(hcl);
							}
						}
					}	
				}
				
				//Guardo vacunas en pacientes
				// 1 recorro toda la lista de informes
				for (informe info : informe) {
					//2 - por cada cliente, obtengo la cantidad de pacientes que tengo
					// y recorro la lista de vacunas en busqueda de vacunas correspondiente al paciente
					for(int i = 0; i<info.getPacientes().size();i++) {
						for (vacuna vac : laVacu) {
							if(info.getPaciente(i).getIDPACIENTE().equals(vac.getIDPACIENTE())) {
								info.getPaciente(i).setVacuna(vac);
							}
						}
					}						
				}
				
				for (informe info : informe) {
					procesarArchivo(info);
				}
			}else System.out.println("Ta vacio che");
			
		}).subscribeOn(Schedulers.io());
		
		return comp;
	}
	
	private void procesarArchivo(model.informe info) {
		File archivo;
		
		try {
			if(info.getCliente().getRAZONSOCIAL().replaceAll("\\s","").equals("")) {
				
				archivo = new File("C:\\copia\\" + info.getCliente().getIDCLIENTE().trim()+".txt");
				archivo.createNewFile();
				fw = new FileWriter(archivo);
				bw = new BufferedWriter(fw);
				bw.write("CLIENTE:" );
				bw.write("\n");
				bw.write("IDUSUARIO: " + info.getCliente().getIDCLIENTE().trim());
				bw.write("\n");			
				
			}else {
				
				archivo = new File("C:\\copia\\" + limpiarCaracteresNombre(info.getCliente().getRAZONSOCIAL().trim()) + " - "+ info.getCliente().getIDCLIENTE() +".txt");
				archivo.createNewFile();
				fw = new FileWriter(archivo);
				bw = new BufferedWriter(fw);
				bw.write("CLIENTE:" + "\n");
				bw.write("\n");
				bw.write("NOMBRE: " + info.getCliente().getRAZONSOCIAL().trim());
				bw.write("\n");
				
			}
			
			if (!(info.getCliente().getDOMICILIO().replaceAll("\\s","").equals(""))) bw.write("DOMICILIO: " + info.getCliente().getDOMICILIO() + "\n");
			if (!(info.getCliente().getENTRE().replaceAll("\\s","").equals(""))) bw.write("ENTRE: " + info.getCliente().getENTRE() + "\n");
			if (!(info.getCliente().getTELEFONO().replaceAll("\\s","").equals(""))) bw.write("TELEFONO: " + info.getCliente().getTELEFONO() + "\n");
			if (!(info.getCliente().getFAX().replaceAll("\\s","").equals(""))) bw.write("FAX: " + info.getCliente().getFAX() + "\n");
			if (!(info.getCliente().getCELULAR().replaceAll("\\s","").equals(""))) bw.write("CELULAR: " + info.getCliente().getCELULAR() + "\n");
			if (!(info.getCliente().getEMAIL().replaceAll("\\s","").equals(""))) bw.write("EMAIL: " + info.getCliente().getEMAIL() + "\n");
			if (!(info.getCliente().getLOCALIDAD().replaceAll("\\s","").equals(""))) bw.write("LOCALIDAD: " + info.getCliente().getLOCALIDAD() + "\n");
			if (!(info.getCliente().getCPOSTAL().replaceAll("\\s","").equals(""))) bw.write("C.P: " + info.getCliente().getCPOSTAL() + "\n");
			if (!(info.getCliente().getPROVINCIA().replaceAll("\\s","").equals(""))) bw.write("PROVINCIA: " + info.getCliente().getPROVINCIA() + "\n");
			if (!(info.getCliente().getPAIS().replaceAll("\\s","").equals(""))) bw.write("PAIS: " + info.getCliente().getPAIS() + "\n");
			if (!(info.getCliente().getRESPIVA().replaceAll("\\s","").equals(""))) bw.write("RESP. IVA: " + info.getCliente().getRESPIVA() + "\n");
			if (!(info.getCliente().getCUIT().replaceAll("\\s","").equals(""))) bw.write("CUIT: " + info.getCliente().getCUIT() + "\n");
			if (!(info.getCliente().getDOCUMENTONRO().replaceAll("\\s","").equals(""))) bw.write("N. DNI: " + info.getCliente().getDOCUMENTONRO() + "\n");
			if (!(info.getCliente().getNACIMIENTO().replaceAll("\\s","").equals("0"))) bw.write("F. NACIMIENTO: " + fechaFormateada(info.getCliente().getNACIMIENTO()) + "\n");
			if (!(info.getCliente().getDATO1().replaceAll("\\s","").equals(""))) bw.write("DATO 1: " + info.getCliente().getDATO1() + "\n");
			if (!(info.getCliente().getDATO2().replaceAll("\\s","").equals(""))) bw.write("DATO 2: " + info.getCliente().getDATO2() + "\n");
			if (!(info.getCliente().getDATO3().replaceAll("\\s","").equals(""))) bw.write("DATO 3: " + info.getCliente().getDATO3() + "\n");
			if (!(info.getCliente().getDATO4().replaceAll("\\s","").equals(""))) bw.write("DATO 4: " + info.getCliente().getDATO4() + "\n");
			if (!(info.getCliente().getDATO5().replaceAll("\\s","").equals(""))) bw.write("DATO 5: " + info.getCliente().getDATO5() + "\n");
			if (!(info.getCliente().getDATO6().replaceAll("\\s","").equals(""))) bw.write("DATO 6: " + info.getCliente().getDATO6() + "\n");
			if (!(info.getCliente().getCOMENTARIO().replaceAll("\\s","").equals(""))) bw.write("COMENTARIO: " + info.getCliente().getCOMENTARIO() + "\n");
			
			
			for (paciente paci : info.getPacientes()) {
				
				bw.write("\n");
				bw.write("PACIENTE:" + "\n");
				bw.write("\n");
				
				if (!(paci.getNOMBRE().replaceAll("\\s","").equals(""))) bw.write("NOMBRE: " + paci.getNOMBRE() + "\n");
				else bw.write("ID PACIENTE: " + paci.getIDPACIENTE() + "\n");
				
				if (!(paci.getIDRAZA()).replaceAll("\\s","").equals("")) bw.write("RAZA: " + obetenerRaza(paci.getIDRAZA().toUpperCase()) + "\n");
				if (!(paci.getIDMICROCHIP().replaceAll("\\s","").equals(""))) bw.write("ID MICROCHIP: " + paci.getIDMICROCHIP() + "\n");
				if (!(paci.getCOLOR().replaceAll("\\s","").equals(""))) bw.write("COLOR: " + paci.getCOLOR() + "\n");
				if (!(paci.getSEXO().replaceAll("\\s","").equals(""))) bw.write("SEXO: " + paci.getSEXO() + "\n");
				if (!(paci.getREPRODUCTOR().replaceAll("\\s","").equals("0"))) bw.write("REPRODUCTOR: " + paci.getREPRODUCTOR() + "\n");
				if (!(paci.getNACIMIENTO().replaceAll("\\s","").equals("0"))) bw.write("NACIMIENTO: " + fechaFormateada(paci.getNACIMIENTO()) + "\n");
				if (!(paci.getINGRESO().replaceAll("\\s","").equals("0"))) bw.write("INGRESO: " + fechaFormateada(paci.getINGRESO()) + "\n");
				if (!(paci.getDECESO().replaceAll("\\s","").equals("0"))) bw.write("DECESO: " + fechaFormateada(paci.getDECESO()) + "\n");
				if (!(paci.getCAUSADECESO().replaceAll("\\s","").equals(""))) bw.write("CAUSA DECESO: " + paci.getCAUSADECESO() + "\n");
				if (!(paci.getDERIVADO().replaceAll("\\s","").equals(""))) bw.write("DERIVADO: " + paci.getDERIVADO() + "\n");
				if (!(paci.getFECHASERVICIO().replaceAll("\\s","").equals("0"))) bw.write("FECHA SERVICIO: " + fechaFormateada(paci.getFECHASERVICIO()) + "\n");
				if (!(paci.getTAMANO().replaceAll("\\s","").equals(""))) bw.write("TAMAÑO: " + paci.getTAMANO()+ "\n");
				if (!(paci.getPESOACTUAL().replaceAll("\\s","").equals("0.0"))) bw.write("PESO ACTUAL: " + paci.getPESOACTUAL() + "\n");
				if (!(paci.getNIVELACTIVIDAD().replaceAll("\\s","").equals(""))) bw.write("NIVEL ACTIVIDAD: " + paci.getNIVELACTIVIDAD() + "\n");
				if (!(paci.getDURACIONALIMENTO().replaceAll("\\s","").equals("0"))) bw.write("DURACION ALIMENTO: " + paci.getDURACIONALIMENTO() + "\n");
				if (!(paci.getDATO1().replaceAll("\\s","").equals(""))) bw.write("DATO 1: " + paci.getDATO1() + "\n");
				if (!(paci.getDATO2().replaceAll("\\s","").equals(""))) bw.write("DATO 2: " + paci.getDATO2() + "\n");
				if (!(paci.getDATO3().replaceAll("\\s","").equals(""))) bw.write("DATO 3: " + paci.getDATO3() + "\n");
				if (!(paci.getDATO4().replaceAll("\\s","").equals(""))) bw.write("DATO 4: " + paci.getDATO4() + "\n");
				if (!(paci.getDATO5().replaceAll("\\s","").equals(""))) bw.write("DATO 5: " + paci.getDATO5() + "\n");
				if (!(paci.getDATO6().replaceAll("\\s","").equals(""))) bw.write("DATO 6: " + paci.getDATO6() + "\n");
				if (!(paci.getCOMENTARIO().replaceAll("\\s","").equals(""))) bw.write("COMENTARIO: " + paci.getCOMENTARIO() + "\n");
				
				bw.write("\n");
				bw.write("HC:" + "\n");
				bw.write("\n");
				
				if(!(paci.getHistClinicas().isEmpty()))
					for (hc hiscli : paci.getHistClinicas()) {
						
						if (!(hiscli.getFECHAVISITA().replaceAll("\\s","").equals("0"))) bw.write("FECHA VISITA: " + fechaFormateada(hiscli.getFECHAVISITA()) + "\n");
						if (!(hiscli.getHORAVISITA().replaceAll("\\s","").equals(""))) bw.write("HORA VISITA: " + hiscli.getHORAVISITA() + "\n");
						if (!(hiscli.getPESO().replaceAll("\\s","").equals(""))) bw.write("PESO: " + hiscli.getPESO() + "\n");
						if (!(hiscli.getTEMPERATURA().replaceAll("\\s","").equals(""))) bw.write("TEMP.: " + hiscli.getTEMPERATURA().trim() + "° \n");
						if (!(hiscli.getIDATENDIO().replaceAll("\\s","").equals(""))) bw.write("ATENDIO: " + hiscli.getIDATENDIO() + "\n");
						if (!(hiscli.getAREALIZAR().replaceAll("\\s","").equals("0"))) bw.write("A REALIZAR: " + hiscli.getAREALIZAR() + "\n");
						if (!(hiscli.getDETALLE().replaceAll("\\s","").equals(""))) bw.write("DETALLE: " + hiscli.getDETALLE() + "\n");
						bw.write("\n");
					}
							
				if(!(paci.getVacunas().isEmpty()))
					
					bw.write("\n");
					bw.write("VACUNA:" + "\n");
					bw.write("\n");
					
					for (vacuna vac : paci.getVacunas()) {
						if (!(vac.getFECHAVISITA().replaceAll("\\s","").equals("0"))) bw.write("FECHA VISITA: " + fechaFormateada(vac.getFECHAVISITA()) + "\n");
						if (!(vac.getFECHAPROXIMA().replaceAll("\\s","").equals("0"))) bw.write("FECHA PROXIMA VISITA: " + fechaFormateada(vac.getFECHAPROXIMA()) + "\n");
						if (!(vac.getIDITEM().replaceAll("\\s","").equals(""))) bw.write("VACUNA: " + vac.getIDITEM() + "\n");
						if (!(vac.getIDRUBRO().replaceAll("\\s","").equals(""))) bw.write("RUBRO: " + vac.getIDRUBRO() + "\n");
						if (!(vac.getPRECIO().replaceAll("\\s","").equals("0.0"))) bw.write("PRECIO: $" + vac.getPRECIO() + "\n");
						if (!(vac.getCANTIDA().replaceAll("\\s","").equals("0"))) bw.write("CANTIDAD: " + vac.getCANTIDA() + "\n");
						if (!(vac.getTOTAL().replaceAll("\\s","").equals("0.0"))) bw.write("TOTAL: $" + vac.getTOTAL() + "\n");
						if (!(vac.getIDATENDIDO().replaceAll("\\s","").equals(""))) bw.write("ATENDIO: " + vac.getIDATENDIDO() + "\n");
						bw.write("\n");				
					}
			}
			
			bw.close();
		} catch (Exception e) {
			System.out.println("Salta "+ info.getCliente().getIDCLIENTE() + e.getMessage());
		}	
	}
	
	private String limpiarCaracteresNombre(String nombre) {
		nombre = nombre.replaceAll(">", "");
		nombre = nombre.replaceAll("<", "");
		nombre = nombre.replaceAll("/", "");
		nombre = nombre.replaceAll("\"", "");
		nombre = nombre.replaceAll(":", "");

		return nombre;
	}

	private String obetenerRaza(String idraza) {
		
		Optional<razas> result = raza.stream().filter(obj -> obj.getIDRAZA().toUpperCase().equals(idraza)).findFirst();
		
		if(result.isEmpty()) {
			return idraza;
		}else {
			return result.get().getNOMBRE();
		}				
	}

	private String fechaFormateada (String cantidad) {
		
		if(cantidad.contains("-")) return cantidad;
		
		if(cantidad.equals("")) {
			return "";
		}else {
			Calendar calendario = new GregorianCalendar(1800,Calendar.DECEMBER,28);
			
			calendario.add(Calendar.DAY_OF_YEAR, Integer.parseInt(cantidad));
			
			return formateo.format(calendario.getTime());
		}	
	}
	
	
	private List<vacuna> iniLaVacuu(File arc) {
		
		try {
    		
    		laVacu = new CsvToBeanBuilder<vacuna>(new FileReader(arc))
                    .withType(vacuna.class)
                    .build()
                    .parse();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
				
		return laVacu;		
	}
	
	private List<hc> iniHC(File arc) {
		try {
    		
    		hcl = new CsvToBeanBuilder<hc>(new FileReader(arc))
                    .withType(hc.class)
                    .build()
                    .parse();
			
		} catch (Exception e) {
			// TODO: handle exception
		}				
		return hcl;		
	}
	
	public List<cliente> iniClientes (File arc) {
		try {
    		
    		clientes = new CsvToBeanBuilder<cliente>(new FileReader(arc))
                    .withType(cliente.class)
                    .build()
                    .parse();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
				
		return clientes;	
	}
	
	public List<paciente> iniPacientes (File arc) {
		try {
    		
    		pacientes = new CsvToBeanBuilder<paciente>(new FileReader(arc))
                    .withType(paciente.class)
                    .build()
                    .parse();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return pacientes;	
	}

	public List<razas> iniRaza(File arc) {
		try {
    		
    		raza = new CsvToBeanBuilder<razas>(new FileReader(arc))
                    .withType(razas.class)
                    .build()
                    .parse();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return raza;
	}

}
