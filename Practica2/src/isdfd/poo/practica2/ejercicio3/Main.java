package isdfd.poo.practica2.ejercicio3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pieza p1 = new Pieza();
		p1.setNombre("pieza1");
		p1.setNumero(1);
		p1.setPrecioPieza(10);
		p1.setTiempoManoDeObraPieza(10);
		
		Pieza p2 = new Pieza();
		p2.setNombre("pieza2");
		p2.setNumero(2);
		p2.setPrecioPieza(20);
		p2.setTiempoManoDeObraPieza(20);
		
		Pieza p3 = new Pieza();
		p3.setNombre("pieza3");
		p3.setNumero(3);
		p3.setPrecioPieza(30);
		p3.setTiempoManoDeObraPieza(30);
		
		Kit k1 = new Kit();
		k1.setNumero(1);
		
		Kit k2 = new Kit();
		k2.setNumero(2);
	
		OrdenDeReparacion o1 = new OrdenDeReparacion();
		o1.addEncargue(p1);
		o1.addEncargue(k1);
		
		TallerMecanico t = new TallerMecanico();
		t.addOrden(o1);
		t.costoReparacion(o1);
		
		System.out.println("El costo de reparacion de la orden " + o1.getNumero() + " es " + o1.costo());
		
		System.out.println("El Total de reparaciones es: "+t.costoTotalReparaciones());
	}

}
