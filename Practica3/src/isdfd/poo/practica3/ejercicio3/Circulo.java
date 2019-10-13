package isdfd.poo.practica3.ejercicio3;

public class Circulo extends Figura {

	private double radio;
	
	public double calcularArea() {
		return Math.PI*Math.pow(this.getRadio(), 2);
	}

	public Circulo(Punto punto, double radio) {
		super(punto);
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
	
}
