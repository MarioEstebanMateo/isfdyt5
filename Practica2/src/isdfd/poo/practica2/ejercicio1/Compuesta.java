package isdfd.poo.practica2.ejercicio1;


import java.util.ArrayList;
import java.util.List;

public class Compuesta extends Reserva{

	private List <Plato> platos = new ArrayList <Plato>();
	
	public int totalPlatos() {
		return platos.size();
	}
	
	public double total() {
		double suma = 0;
		for (Plato s: platos) {
			suma+=s.getPrecio()-(s.getPrecio()*0.05);
		}
		return suma;
	}
	
	public void addAllPlato(List<Plato> l) {
		platos.addAll(l);
	}
	
	public void agregarPlato(Plato unPlato) {
		platos.add(unPlato);
	}
	
	public void removerPlato(Plato unPlato) {
		platos.remove(unPlato);
	}
}
