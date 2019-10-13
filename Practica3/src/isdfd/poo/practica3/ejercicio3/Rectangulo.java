package isdfd.poo.practica3.ejercicio3;

public class Rectangulo extends Figura {

	private double base;
	private double altura;
	
	public double calcularArea() {
		return this.getBase()*this.getAltura();
	}
	
	public Rectangulo(Punto punto, double base, double altura) {
		super(punto);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
}
