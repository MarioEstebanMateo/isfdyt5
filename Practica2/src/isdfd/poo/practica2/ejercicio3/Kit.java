package isdfd.poo.practica2.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Kit extends Encargue {

	private List<Encargue> encargues = new ArrayList<Encargue>();
	private int numero;
	private double tiempoManoDeObraKit;
	
	public double costo() {
		double valor = 0;
		for (Encargue e: encargues) {
			valor += e.costo();
		}
		valor = valor - (valor*0.10);
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

	public double getTiempoManoDeObraKit() {
		return tiempoManoDeObraKit;
	}

	public void setTiempoManoDeObraKit(double tiempoManoDeObraKit) {
		this.tiempoManoDeObraKit = tiempoManoDeObraKit;
	}
	
}
