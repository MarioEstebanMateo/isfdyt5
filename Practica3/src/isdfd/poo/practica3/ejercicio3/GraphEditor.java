package isdfd.poo.practica3.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class GraphEditor {

	private List <Figura> figuras = new ArrayList<Figura>();
	
	public void addFigura(Figura f) {
		figuras.add(f);
	}
	
	public void removeFigura(Figura f) {
		figuras.remove(f);
	}
	
	public void mover(int unPunto, String direccion) {
		for (Figura f: figuras) {
			f.mover(unPunto, direccion);
		}
	}
	
}
