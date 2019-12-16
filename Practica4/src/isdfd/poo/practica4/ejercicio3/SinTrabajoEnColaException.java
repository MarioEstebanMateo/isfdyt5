package isdfd.poo.practica4.ejercicio3;

public class SinTrabajoEnColaException extends Exception {

	private String nombre ;
	
	public SinTrabajoEnColaException ( String nom) {
	nombre = nom;
	}

	public String getMessage() {
	return "La cola " + nombre + " no tiene trabajos para procesar. " ;
	}
	
}
