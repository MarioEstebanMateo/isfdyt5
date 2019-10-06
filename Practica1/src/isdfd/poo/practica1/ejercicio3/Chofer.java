package isdfd.poo.practica1.ejercicio3;

public class Chofer {

	private Colectivo colectivo;
	

	public Colectivo getColectivo() {
		return colectivo;
	}

	public void setColectivo(Colectivo colectivo) {
		this.colectivo = colectivo;
	}
	
	public int cantPas() {
		return colectivo.getCantPasajeros();
	}
	
	public boolean realizarViaje(int cantPas, float cantKm) {
		return colectivo.realizarViaje(cantPas, cantKm);
	}
	
	public float cantKm() {
		return colectivo.getKm();
	}
}
