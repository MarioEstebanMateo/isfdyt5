package isdfd.poo.practica2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Comedor {


private List <Reserva> reservas = new ArrayList <Reserva>();
	
	//a)
	public void agregarReserva(Cliente cliente, Plato plato)
	{
		Simple s = new Simple();
		s.setCliente(cliente);
		s.setPlato(plato);
		reservas.add(s);
	}
	
	//b
	public void agregarReserva(Cliente cliente, List<Plato>platos) {
		Compuesta c = new Compuesta();
		c.setCliente(cliente);
		c.addAllPlato(platos);
		reservas.add(c);
	}
	
	//c
	public double valorReserva(Reserva unaReserva) {
		return unaReserva.total();
	}
	
	//d
	
	public int totalPlatosReservados() {
		int t = 0;
		for (Reserva r : reservas) {
			t+=r.totalPlatos();
		}
		return t;
	}
	
	//e
	
	public double totalValorReservas() {
		double total = 0;
		for (Reserva r: reservas) {
			total += r.total();
		}
		return total;
	}
	
	//f
	
	public Reserva reservaMasPlatos() {
		int mayor = 0;
		Reserva rmayor = null;
		for (Reserva r: reservas) {
			if (r.totalPlatos()>mayor) {
				mayor=r.totalPlatos();
				rmayor=r;
			}
		}
		return rmayor;
		
	}
	
}
