package isdfd.poo.practica2.ejercicio1;

public abstract class Cliente {

	private String nombre;
	
	public abstract double descuento();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
