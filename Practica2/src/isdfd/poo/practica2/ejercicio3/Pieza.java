package isdfd.poo.practica2.ejercicio3;

public class Pieza extends Encargue {
	private int numero;
	private String nombre;
	private double precioPieza;
	private double tiempoManoDeObraPieza;
	
	public double costo() {
		return precioPieza;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioPieza() {
		return precioPieza;
	}
	public void setPrecioPieza(double precioPieza) {
		this.precioPieza = precioPieza;
	}
	public double getTiempoManoDeObraPieza() {
		return tiempoManoDeObraPieza;
	}
	public void setTiempoManoDeObraPieza(double tiempoManoDeObraPieza) {
		this.tiempoManoDeObraPieza = tiempoManoDeObraPieza;
	}
	
	
	
}
