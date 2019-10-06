package isdfd.poo.practica3.ejercicio2;

public class Pasajero implements Frecuencia {

	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int millas() {
		return 1500;
	}
			
	public String ultimoViaje() {
		return "10/01/2019";
	}
	
}
