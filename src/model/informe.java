package model;

import java.util.ArrayList;

public class informe {

	private cliente cliente;
	private ArrayList<paciente> pacientes = new ArrayList<>();
	
	
	public cliente getCliente() {
		return cliente;
	}
	public void setCliente(cliente cliente) {
		this.cliente = cliente;
	}
	public ArrayList<paciente> getPacientes() {
		return pacientes;
	}
	
	public void setPacientes(paciente pac) {
		pacientes.add(pac);
	}
	
	public paciente getPaciente (int indice) {
		return pacientes.get(indice);
	}
	
	@Override
	public String toString() {
		return "informe [cliente=" + cliente + ", pacientes=" + pacientes.toString() + "]";
	}
}
