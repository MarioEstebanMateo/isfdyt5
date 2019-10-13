package isdfd.poo.practica3.ejercicio3;

public abstract class Figura implements FiguraGeometrica{

	private Punto punto;

	public abstract double calcularArea();
	
	public Figura(Punto punto) {
		super();
		this.punto = punto;
	}

	public Punto getPunto() {
		return punto;
	}

	public void setPunto(Punto punto) {
		this.punto = punto;
	}
	
	public void mover(int unPunto, String direccion) {
		unPunto=Math.abs(unPunto);
		switch (direccion) {
		case "North":
			this.punto.setCoordY(unPunto+this.punto.getCoordY());
		break;
		case "South":
			this.punto.setCoordY(unPunto-this.punto.getCoordY());
		break;
		case "West":
			this.punto.setCoordX(unPunto-this.punto.getCoordX());
		break;
		case "East":
			this.punto.setCoordX(unPunto+this.punto.getCoordX());
		break;		
		}
		
	}
	
}
