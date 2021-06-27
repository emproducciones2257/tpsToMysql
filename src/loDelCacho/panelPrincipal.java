package loDelCacho;

import java.awt.EventQueue;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Color;


public class panelPrincipal extends JFrame {

	private JPanel contentPane;
	private JButton btnClientes, btnPacientes, btnRazas, btnHC, btnVacunas, btnGenerar;
	private JLabel lblNewLabel, lblNewLabel_3, lblNewLabel_4, lblEstadoProceso;
	private FileNameExtensionFilter fileEx = new FileNameExtensionFilter("Clarion", "csv");
	private File archivo = new File("");
	private iniciar in = new iniciar();
	
	


	public JLabel getLblEstadoProceso() {
		return lblEstadoProceso;
	}

	public void setLblEstadoProceso(JLabel lblEstadoProceso) {
		this.lblEstadoProceso = lblEstadoProceso;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					panelPrincipal frame = new panelPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public panelPrincipal() {
		
		setTitle("Clarion TPS A TXT - EMProducciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("TextField.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Seleccionar clientes:");
		lblNewLabel.setBounds(10, 11, 132, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Paciente");
		lblNewLabel_1.setBounds(10, 48, 96, 14);
		contentPane.add(lblNewLabel_1);
		
		btnClientes = new JButton("Clientes");
		btnClientes.setBounds(183, 7, 116, 23);
		contentPane.add(btnClientes);
		btnClientes.addActionListener( ac ->{
			obtenerArchivo(btnClientes);
		});
					
		btnPacientes = new JButton("Pacientes");
		btnPacientes.setBounds(183, 44, 116, 23);
		contentPane.add(btnPacientes);
		btnPacientes.addActionListener( ac ->{
			obtenerArchivo(btnPacientes);
		});
				
		JLabel lblNewLabel_2 = new JLabel("Razas");
		lblNewLabel_2.setBounds(10, 81, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		btnRazas = new JButton("Razas");
		btnRazas.setBounds(183, 78, 116, 23);
		contentPane.add(btnRazas);
		btnRazas.addActionListener( ac ->{
			obtenerArchivo(btnRazas);
		});
		
		lblNewLabel_3 = new JLabel("H.C.");
		lblNewLabel_3.setBounds(10, 121, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		btnHC = new JButton("H.C.");
		btnHC.setBounds(183, 117, 116, 23);
		contentPane.add(btnHC);
		btnHC.addActionListener( ac ->{
			obtenerArchivo(btnHC);
		});
		
		lblNewLabel_4 = new JLabel("Vacunas");
		lblNewLabel_4.setBounds(10, 161, 80, 14);
		contentPane.add(lblNewLabel_4);
		
		btnVacunas = new JButton("Vacunas");
		btnVacunas.setBounds(183, 157, 116, 23);
		contentPane.add(btnVacunas);
		btnVacunas.addActionListener( ac ->{
			obtenerArchivo(btnVacunas);
		});
		
		btnGenerar = new JButton("Generar");
		btnGenerar.setBounds(10, 227, 324, 23);
		contentPane.add(btnGenerar);
		btnGenerar.addActionListener( ac ->{
			lblEstadoProceso.setText("GENERANDO ARCHIVOS");
			in.generarArchivos(this);
		});				
		
		lblEstadoProceso = new JLabel("CARGAR ARCHIVOS");
		lblEstadoProceso.setForeground(new Color(0, 128, 0));
		lblEstadoProceso.setBounds(10, 202, 324, 14);
		contentPane.add(lblEstadoProceso);
		
	}

	private void obtenerArchivo(JButton btn) {
		
		JFileChooser b = new JFileChooser();
		
		b.setFileFilter(fileEx);

		 int returnVal = b.showOpenDialog(null);
		 
		 if(returnVal == JFileChooser.APPROVE_OPTION) {
	            archivo = b.getSelectedFile().getAbsoluteFile();
	            
	            if(btn.getText().equals("Clientes")) {
	            	in.obtenerClientes(archivo, this);
	            	lblEstadoProceso.setText("PROCESANDO CLIENTES");
	            }
	            
	            if(btn.getText().equals("Pacientes")) {
	            	in.obtenerPacientes(archivo, this);
	            	lblEstadoProceso.setText("PROCESANDO PACIENTES");
	            }
	            
	            if(btn.getText().equals("Razas")) {
	            	in.obtenerRazas(archivo, this);
	            	lblEstadoProceso.setText("PROCESANDO RAZAS");
	            }
	            
	            if(btn.getText().equals("H.C.")) {
	            	in.obtenerHC(archivo, this);
	            	lblEstadoProceso.setText("PROCESANDO HIST. CLINICAS");
	            }
	            
	            if(btn.getText().equals("Vacunas")) {
	            	in.obtenerVacunas(archivo, this);
	            	lblEstadoProceso.setText("PROCESANDO VACUNAS");
	            }
	            	            				
	     }else {
	    	 lblEstadoProceso.setText("CARGA DE ARCHIVOS CANCELADA");
		}
	}
}
