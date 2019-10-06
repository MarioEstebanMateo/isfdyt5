package isdfd.poo.practica2.ejercicio1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comedor c1 = new Comedor();
		
		Alumno a1 = new Alumno();
		
		Plato plato1 = new Plato();
		plato1.setPrecio(80);
		Plato plato2 = new Plato();
		plato2.setPrecio(90);
		Plato plato3 = new Plato();
		plato3.setPrecio(100);
		
		Simple s1 = new Simple();
		s1.setPlato(plato1);
		s1.setCliente(a1);
		
		c1.agregarReserva(a1, plato1);
		
		System.out.println(c1.totalValorReservas());
	}

}
