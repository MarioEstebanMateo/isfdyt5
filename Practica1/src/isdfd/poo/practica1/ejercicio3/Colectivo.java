package isdfd.poo.practica1.ejercicio3;

public class Colectivo {

	private String patente;
	private int modelo;
	private int cantPasajeros;
	private float km;
	
	public Colectivo(String patente, int modelo) {
		super();
		this.patente = patente;
		this.modelo = modelo;
	}
	
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public int getCantPasajeros() {
		return cantPasajeros;
	}

	public void setCantPasajeros(int cantPasajeros) {
		this.cantPasajeros = cantPasajeros;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}
	
	public boolean realizarViaje(int cantPas, float cantKm) {
		if (cantPas>=cantPasajeros) {
			km+=cantKm;
			return true;
		}
		return false;
	}
	
}
