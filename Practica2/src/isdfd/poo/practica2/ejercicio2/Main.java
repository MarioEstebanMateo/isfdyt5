package isdfd.poo.practica2.ejercicio2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Equipo e1 = new Equipo();
		e1.setNombre("Argentina");
		
		Equipo e2 = new Equipo();
		e2.setNombre("Brasil");
		
		Equipo e3 = new Equipo();
		e3.setNombre("Alemania");
		
		Equipo e4 = new Equipo();
		e4.setNombre("Italia");
		
		Equipo e5 = new Equipo();
		e4.setNombre("Holanda");
		
		Equipo e6 = new Equipo();
		e4.setNombre("España");
		
		Estadio es1 = new Estadio();
		es1.setNombre("El Monumental");
		es1.setCapacidad(50000);
		
		Estadio es2 = new Estadio();
		es2.setNombre("Camp Nou");
		es2.setCapacidad(60000);
		
		Estadio es3 = new Estadio();
		es3.setNombre("La Bombonera");
		es3.setCapacidad(40000);
		
		Partido p1 = new Partido();
		p1.setEstadio(es1);
		p1.setLocal(e1);
		p1.setVisitante(e2);
		p1.setValorEntrada(100);
		
		Partido p2 = new Partido();
		p2.setEstadio(es2);
		p2.setLocal(e3);
		p2.setVisitante(e4);
		p2.setValorEntrada(100);
		
		Mundial m1 = new Mundial();
		m1.setNombre("Argentina 2019");
		m1.agregarPartido(e5, e6, es3, 100);

		System.out.println("El Mundial "+m1.getNombre()+" tiene "+m1.cantPartidos()+" partidos");
		
		System.out.println("El estadio con mayor capacidad es el "+m1.estadioConMayorCapacidad().getNombre());
		
		System.out.println("La cantidad total de espectadores del mundial es "+m1.cantidadTotalEspectadores());
		
		System.out.println("El total recaudado del partido "+p1+" es "+m1.montoRecaudado(p1));
		
		System.out.println("El total recaudado del mundial "+m1.getNombre()+" es "+m1.montoTotalRecaudado());
	}

}
