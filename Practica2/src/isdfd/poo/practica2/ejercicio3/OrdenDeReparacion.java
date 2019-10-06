package isdfd.poo.practica2.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class OrdenDeReparacion {
	
	private List<Encargue> encargues = new ArrayList<Encargue>();	
	private int numero;
	
	public double costo() {
		double valor = 0;
		for (Encargue e: encargues) {
			valor += e.costo();
		}
		return valor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void addEncargue(Encargue e) {
		encargues.add(e);
	}

}
