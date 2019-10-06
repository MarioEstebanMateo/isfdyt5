package isdfd.poo.practica2.ejercicio1;

public abstract class Reserva {
	
	private Cliente cliente;
	private String fecha;
	
	public abstract double total();
	
	public abstract int totalPlatos();

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
	