package model;

import java.util.ArrayList;

import com.opencsv.bean.CsvBindByPosition;

public class paciente {

	@CsvBindByPosition(position = 1)
	private String BAJOTRATAMIENTO;
	@CsvBindByPosition(position = 2)
	private String IDPACIENTE;
	@CsvBindByPosition(position = 3)
	private String IDCLIENTE;
	@CsvBindByPosition(position = 4)
	private String IDMICROCHIP;
	@CsvBindByPosition(position = 5)
	private String NOMBRE;
	@CsvBindByPosition(position = 6)
	private String IDRAZA;
	@CsvBindByPosition(position = 7)
	private String COLOR;
	@CsvBindByPosition(position = 8)
	private String SEXO;
	@CsvBindByPosition(position = 9)
	private String REPRODUCTOR;
	@CsvBindByPosition(position = 10)
	private String NACIMIENTO;
	@CsvBindByPosition(position = 11)
	private String INGRESO;
	@CsvBindByPosition(position = 12)
	private String DECESO;
	@CsvBindByPosition(position = 13)
	private String DERIVADO;
	@CsvBindByPosition(position = 14)
	private String CAUSADECESO;
	@CsvBindByPosition(position = 15)
	private String FECHASERVICIO;
	@CsvBindByPosition(position = 16)
	private String TAMANO;
	@CsvBindByPosition(position = 17)
	private String PESOACTUAL;
	@CsvBindByPosition(position = 18)
	private String NIVELACTIVIDAD;
	@CsvBindByPosition(position = 19)
	private String DURACIONALIMENTO;
	@CsvBindByPosition(position =20)
	private String DATO1;
	@CsvBindByPosition(position = 21)
	private String DATO2;
	@CsvBindByPosition(position = 22)
	private String DATO3;
	@CsvBindByPosition(position = 23)
	private String DATO4;
	@CsvBindByPosition(position = 24)
	private String DATO5;
	@CsvBindByPosition(position = 25)
	private String DATO6;
	@CsvBindByPosition(position = 26)
	private String IMAGEN;
	@CsvBindByPosition(position = 27)
	private String IMAGENTIPO;
	@CsvBindByPosition(position = 28)
	private String OSINCLUIDO;
	@CsvBindByPosition(position = 29)
	private String COMENTARIO;
	
	private ArrayList<hc> histClinicas;
	private ArrayList<vacuna> vacunas;
	
	public paciente() {
		histClinicas = new ArrayList<>();
		vacunas = new ArrayList<>();
	}

	public String getBAJOTRATAMIENTO() {
		return BAJOTRATAMIENTO;
	}
	public void setBAJOTRATAMIENTO(String bAJOTRATAMIENTO) {
		BAJOTRATAMIENTO = bAJOTRATAMIENTO;
	}
	public String getIDPACIENTE() {
		return IDPACIENTE;
	}
	public void setIDPACIENTE(String iDPACIENTE) {
		IDPACIENTE = iDPACIENTE;
	}
	public String getIDCLIENTE() {
		return IDCLIENTE;
	}
	public void setIDCLIENTE(String iDCLIENTE) {
		IDCLIENTE = iDCLIENTE;
	}
	public String getIDMICROCHIP() {
		return IDMICROCHIP;
	}
	public void setIDMICROCHIP(String iDMICROCHIP) {
		IDMICROCHIP = iDMICROCHIP;
	}
	public String getNOMBRE() {
		return NOMBRE;
	}
	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}
	public String getIDRAZA() {
		return IDRAZA;
	}
	public void setIDRAZA(String iDRAZA) {
		IDRAZA = iDRAZA;
	}
	public String getCOLOR() {
		return COLOR;
	}
	public void setCOLOR(String cOLOR) {
		COLOR = cOLOR;
	}
	public String getSEXO() {
		return SEXO;
	}
	public void setSEXO(String sEXO) {
		SEXO = sEXO;
	}
	public String getREPRODUCTOR() {
		return REPRODUCTOR;
	}
	public void setREPRODUCTOR(String rEPRODUCTOR) {
		REPRODUCTOR = rEPRODUCTOR;
	}
	public String getNACIMIENTO() {
		return NACIMIENTO;
	}
	public void setNACIMIENTO(String nACIMIENTO) {
		NACIMIENTO = nACIMIENTO;
	}
	public String getINGRESO() {
		return INGRESO;
	}
	public void setINGRESO(String iNGRESO) {
		INGRESO = iNGRESO;
	}
	public String getDECESO() {
		return DECESO;
	}
	public void setDECESO(String dECESO) {
		DECESO = dECESO;
	}
	public String getDERIVADO() {
		return DERIVADO;
	}
	public void setDERIVADO(String dERIVADO) {
		DERIVADO = dERIVADO;
	}
	public String getCAUSADECESO() {
		return CAUSADECESO;
	}
	public void setCAUSADECESO(String cAUSADECESO) {
		CAUSADECESO = cAUSADECESO;
	}
	public String getFECHASERVICIO() {
		return FECHASERVICIO;
	}
	public void setFECHASERVICIO(String fECHASERVICIO) {
		FECHASERVICIO = fECHASERVICIO;
	}
	public String getTAMANO() {
		return TAMANO;
	}
	public void setTAMANO(String tAMANO) {
		TAMANO = tAMANO;
	}
	public String getPESOACTUAL() {
		return PESOACTUAL;
	}
	public void setPESOACTUAL(String pESOACTUAL) {
		PESOACTUAL = pESOACTUAL;
	}
	public String getNIVELACTIVIDAD() {
		return NIVELACTIVIDAD;
	}
	public void setNIVELACTIVIDAD(String nIVELACTIVIDAD) {
		NIVELACTIVIDAD = nIVELACTIVIDAD;
	}
	public String getDURACIONALIMENTO() {
		return DURACIONALIMENTO;
	}
	public void setDURACIONALIMENTO(String dURACIONALIMENTO) {
		DURACIONALIMENTO = dURACIONALIMENTO;
	}
	public String getDATO1() {
		return DATO1;
	}
	public void setDATO1(String dATO1) {
		DATO1 = dATO1;
	}
	public String getDATO2() {
		return DATO2;
	}
	public void setDATO2(String dATO2) {
		DATO2 = dATO2;
	}
	public String getDATO3() {
		return DATO3;
	}
	public void setDATO3(String dATO3) {
		DATO3 = dATO3;
	}
	public String getDATO4() {
		return DATO4;
	}
	public void setDATO4(String dATO4) {
		DATO4 = dATO4;
	}
	public String getDATO5() {
		return DATO5;
	}
	public void setDATO5(String dATO5) {
		DATO5 = dATO5;
	}
	public String getDATO6() {
		return DATO6;
	}
	public void setDATO6(String dATO6) {
		DATO6 = dATO6;
	}
	public String getIMAGEN() {
		return IMAGEN;
	}
	public void setIMAGEN(String iMAGEN) {
		IMAGEN = iMAGEN;
	}
	public String getIMAGENTIPO() {
		return IMAGENTIPO;
	}
	public void setIMAGENTIPO(String iMAGENTIPO) {
		IMAGENTIPO = iMAGENTIPO;
	}
	public String getOSINCLUIDO() {
		return OSINCLUIDO;
	}
	public void setOSINCLUIDO(String oSINCLUIDO) {
		OSINCLUIDO = oSINCLUIDO;
	}
	public String getCOMENTARIO() {
		return COMENTARIO;
	}
	public void setCOMENTARIO(String cOMENTARIO) {
		COMENTARIO = cOMENTARIO;
	}
	
	public void setHisClin (hc e) {
		histClinicas.add(e);
	}
	
	public void setVacuna (vacuna vac) {
		vacunas.add(vac);
	}

	public ArrayList<hc> getHistClinicas() {
		return histClinicas;
	}

	public ArrayList<vacuna> getVacunas() {
		return vacunas;
	}

	@Override
	public String toString() {
		return "paciente [BAJOTRATAMIENTO=" + BAJOTRATAMIENTO + ", IDPACIENTE=" + IDPACIENTE + ", IDCLIENTE="
				+ IDCLIENTE + ", IDMICROCHIP=" + IDMICROCHIP + ", NOMBRE=" + NOMBRE + ", IDRAZA=" + IDRAZA + ", COLOR="
				+ COLOR + ", SEXO=" + SEXO + ", REPRODUCTOR=" + REPRODUCTOR + ", NACIMIENTO=" + NACIMIENTO
				+ ", INGRESO=" + INGRESO + ", DECESO=" + DECESO + ", DERIVADO=" + DERIVADO + ", CAUSADECESO="
				+ CAUSADECESO + ", FECHASERVICIO=" + FECHASERVICIO + ", TAMANO=" + TAMANO + ", PESOACTUAL=" + PESOACTUAL
				+ ", NIVELACTIVIDAD=" + NIVELACTIVIDAD + ", DURACIONALIMENTO=" + DURACIONALIMENTO + ", DATO1=" + DATO1
				+ ", DATO2=" + DATO2 + ", DATO3=" + DATO3 + ", DATO4=" + DATO4 + ", DATO5=" + DATO5 + ", DATO6=" + DATO6
				+ ", IMAGEN=" + IMAGEN + ", IMAGENTIPO=" + IMAGENTIPO + ", OSINCLUIDO=" + OSINCLUIDO + ", COMENTARIO="
				+ COMENTARIO + ", histClinicas=" + histClinicas.toString() + ", vacunas=" + vacunas.toString() + "]";
	}
	
	
}
