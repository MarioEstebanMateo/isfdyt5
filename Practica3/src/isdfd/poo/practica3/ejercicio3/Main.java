package isdfd.poo.practica3.ejercicio3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Punto pu1 = new Punto(0,0);
		
		Rectangulo re1 = new Rectangulo(pu1,10,10);
		re1.setPunto(pu1);
		re1.calcularArea();
		
		Cuadrado cu1 = new Cuadrado(pu1,10);
		cu1.setPunto(pu1);
		cu1.calcularArea();
		
		Circulo ci1 = new Circulo(pu1,10);
		ci1.setPunto(pu1);
		ci1.calcularArea();
		
		Triangulo tr1 = new Triangulo(pu1,10,10);
		tr1.setPunto(pu1);
		tr1.calcularArea();
		
		
		GraphEditor ge1 = new GraphEditor();
		ge1.addFigura(re1);
		ge1.mover(1, "North");
		System.out.println("Coordenadas Rectangulo ("+re1.getPunto().getCoordX()+","+re1.getPunto().getCoordY()+")");
		ge1.mover(1, "South");
		System.out.println("Coordenadas Rectangulo ("+re1.getPunto().getCoordX()+","+re1.getPunto().getCoordY()+")");
		ge1.mover(1, "West");
		System.out.println("Coordenadas Rectangulo ("+re1.getPunto().getCoordX()+","+re1.getPunto().getCoordY()+")");
		ge1.mover(1, "East");
		System.out.println("Coordenadas Rectangulo ("+re1.getPunto().getCoordX()+","+re1.getPunto().getCoordY()+")");
		
		
		
	}

}
