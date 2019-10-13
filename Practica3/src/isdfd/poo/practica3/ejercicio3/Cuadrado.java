package isdfd.poo.practica3.ejercicio3;

public class Cuadrado extends Figura {

	public double lado;
	
	public double calcularArea() {
		return this.lado*this.lado;
	}

	public Cuadrado(Punto punto, double lado) {
		super(punto);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
	
}
