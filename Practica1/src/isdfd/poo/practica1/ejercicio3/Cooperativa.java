package isdfd.poo.practica1.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Cooperativa {
	
	private List <Chofer> choferes = new ArrayList<Chofer>();
	
	public Chofer realizarViaje(int cantPasajeros, float cantKm) {
			for (Chofer c : choferes) {
				if (c.realizarViaje(cantPasajeros,cantKm)) {
					return c;
				}
			}
			return null;
	}
		
	public Colectivo mayorKilometro() {
			float mayor = 0;
			Colectivo cMayor = null;
			for (Chofer c: choferes) {
				if(c.cantKm()>mayor) {
					mayor = c.cantKm();
					cMayor = c.getColectivo();
				}
			}
			return cMayor;
	}
	
	public static void main(String[] args) {
		
	}

}
