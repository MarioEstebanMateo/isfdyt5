package isdfd.poo.practica2.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Mundial {

	private String nombre;
	private List <Partido> partidos = new ArrayList<Partido>();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int cantPartidos() {
		return partidos.size();
	}
	
	//a)
		public void agregarPartido(Equipo local, Equipo visita, Estadio estadio, int valorEntrada) {
			Partido p = new Partido();
			p.setLocal(local);
			p.setVisitante(visita);
			p.setEstadio(estadio);
			p.setValorEntrada(valorEntrada);
			partidos.add(p);
		}
		
	//b
		public Estadio estadioConMayorCapacidad() {
			int mayorcap = 0;
			Estadio emayorcap = null;
			for (Partido p: partidos) {
				if (p.getEstadio().getCapacidad()>mayorcap) {
					mayorcap=p.getEstadio().getCapacidad();
					emayorcap=p.getEstadio();
				}
			}
			return emayorcap;
		}
	
	//c
		
		public int cantidadTotalEspectadores(){
			int cantTotal = 0;
			for (Partido p: partidos) {
				cantTotal += p.totalEspectadores();
			}
			return cantTotal;
		}
		
	//d
		
		public double montoRecaudado(Partido partido) {
			return partido.montoRecaudado();
		}
		
	//e
		
		public double montoTotalRecaudado() {
			int montoTotal = 0;
			for (Partido p: partidos) {
				montoTotal += p.montoRecaudado();
			}
			return montoTotal;
		}

		
}
