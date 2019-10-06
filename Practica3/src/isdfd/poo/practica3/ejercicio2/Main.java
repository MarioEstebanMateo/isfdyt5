package isdfd.poo.practica3.ejercicio2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pasajero p1 = new Pasajero();
		p1.setNombre("Juan");
		System.out.println("El pasajero "+p1.getNombre()+" tiene "+p1.millas()+" millas acumuladas");
		System.out.println("El pasajero "+p1.getNombre()+" realizo el ultimo viaje el "+p1.ultimoViaje());
		
		Vehiculo v1 = new Vehiculo();
		v1.setPatente("AC 235 BC");
		System.out.println("El vehiculo patente "+v1.getPatente()+" tiene "+v1.millas()+" millas acumuladas");
		System.out.println("El vehiculo patente "+v1.getPatente()+" realizo el ultimo viaje el "+v1.ultimoViaje());
		
	}

}
