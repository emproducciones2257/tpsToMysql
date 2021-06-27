package loDelCacho;

import java.awt.Color;
import java.io.File;

import io.reactivex.rxjava3.functions.Action;
import trabajoPesado.procesarCliente;

public class iniciar {

	
	procesarCliente proceso = new procesarCliente();
	
	public void obtenerClientes (File arc, panelPrincipal pnl) {	
		
		proceso.obtenerCliente(arc).
		subscribe(p-> {pnl.getLblEstadoProceso().setForeground(new Color(0, 128, 0));
					pnl.getLblEstadoProceso().setText("CLIENTES CARGADOS CORRECTAMENTE");}, 
				h-> {pnl.getLblEstadoProceso().setForeground(Color.red);
					pnl.getLblEstadoProceso().setText("CARGA DE CLIENTES ERRONEA");});
	}
	
	public void obtenerPacientes (File arc, panelPrincipal pnl) {
		
		proceso.obtenerPaciente(arc).
		subscribe(p-> {pnl.getLblEstadoProceso().setForeground(new Color(0, 128, 0));
				pnl.getLblEstadoProceso().setText("PACIENTES CARGADOS CORRECTAMENTE");}, 
				h-> {pnl.getLblEstadoProceso().setForeground(Color.red);
					pnl.getLblEstadoProceso().setText("CARGA DE PACIENTES ERRONEA");});
	}

	public void obtenerRazas(File arc, panelPrincipal pnl) {
		
		proceso.obtenerRazas(arc).
		subscribe(p-> {pnl.getLblEstadoProceso().setForeground(new Color(0, 128, 0));
				pnl.getLblEstadoProceso().setText("RAZAS CARGADAS CORRECTAMENTE");}, 
				h-> {pnl.getLblEstadoProceso().setForeground(Color.red);
					pnl.getLblEstadoProceso().setText("CARGA DE RAZAS ERRONEA");});
	}

	public void obtenerHC(File arc, panelPrincipal pnl) {
		
		proceso.obtenerHC(arc).
		subscribe(p-> {pnl.getLblEstadoProceso().setForeground(new Color(0, 128, 0));
				pnl.getLblEstadoProceso().setText("HIST. CLINICAS CARGADAS CORRECTAMENTE");}, 
				h-> {pnl.getLblEstadoProceso().setForeground(Color.red);
					pnl.getLblEstadoProceso().setText("CARGA DE HIST. CLINICAS ERRONEA");});
	}

	public void obtenerVacunas(File arc, panelPrincipal pnl) {
		
		proceso.obtenerLaVacu(arc).
		subscribe(p-> {pnl.getLblEstadoProceso().setForeground(new Color(0, 128, 0));
				pnl.getLblEstadoProceso().setText("VACUNAS CARGADAS CORRECTAMENTE");}, 
				h-> {pnl.getLblEstadoProceso().setForeground(Color.red);
					pnl.getLblEstadoProceso().setText("CARGA DE VACUNAS ERRONEA");});
	}

	public void generarArchivos(panelPrincipal pnl) {
		
		proceso.generarArchivos().subscribe(new Action() {
			
			@Override
			public void run() throws Throwable {

				pnl.getLblEstadoProceso().setText("ARCHIVOS CREADOS CORRECTAMENTE");
			}
		});		
	}
}
