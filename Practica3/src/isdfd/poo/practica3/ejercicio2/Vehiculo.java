package isdfd.poo.practica3.ejercicio2;

public class Vehiculo implements Frecuencia {

	private String patente;
	
	public int millas() {
		return 8000;
	}
		
	public String ultimoViaje() {
		return "01/09/2019";
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}
	
}
