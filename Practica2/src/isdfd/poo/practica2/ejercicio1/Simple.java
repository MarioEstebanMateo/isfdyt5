package isdfd.poo.practica2.ejercicio1;

public class Simple extends Reserva{

	private Plato plato;
	
	public double total() {
		return plato.getPrecio()-(plato.getPrecio()*getCliente().descuento());
	}
	
	public int totalPlatos() {
		return 1;
	}
	
	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	
	
	

	
	
}
