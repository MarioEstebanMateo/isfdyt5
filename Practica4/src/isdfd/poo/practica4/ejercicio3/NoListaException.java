package isdfd.poo.practica4.ejercicio3;

public class NoListaException extends Exception{

	private String nombre ;
	private long cantidadTrabajos ;
	
	public NoListaException ( String nom, long s) {
	nombre = nom;
	cantidadTrabajos = s;
	}
	
	public String getMessage() {
	return "La Cola de Trabajo: " + nombre + " no esta disponible. Cantidad de trabajos a procesar : " + cantidadTrabajos ;
	}
	
}
