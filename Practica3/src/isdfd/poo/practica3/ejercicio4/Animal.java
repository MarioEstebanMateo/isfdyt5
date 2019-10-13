package isdfd.poo.practica3.ejercicio4;

public abstract class Animal implements Hablador {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Animal(String nombre) {
		this.nombre = nombre;
	}

	
	
}
