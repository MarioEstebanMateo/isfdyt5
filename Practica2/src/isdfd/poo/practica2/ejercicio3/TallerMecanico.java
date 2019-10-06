package isdfd.poo.practica2.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class TallerMecanico {

	private List<OrdenDeReparacion> ordenes = new ArrayList<OrdenDeReparacion>();
	
	public void addOrden(OrdenDeReparacion e) {
		ordenes.add(e);
	}
	
	//a)
	public double costoReparacion(OrdenDeReparacion unaOrden) {
		return unaOrden.costo();
	}
	
	//b)
	public double costoTotalReparaciones() {
		double total = 0;
		for (OrdenDeReparacion o: ordenes) {
			total += o.costo();
		}
		return total;
	}
}
