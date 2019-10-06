package isdfd.poo.practica2.ejercicio2;

public class Partido {

	private Equipo local;
	private Equipo visitante;
	private Estadio estadio;
	private double valorEntrada;
	
	public double montoRecaudado() {
		return valorEntrada*estadio.getCapacidad();
	}
	
	public int totalEspectadores() {
		return estadio.getCapacidad();
	}
	
	public Equipo getLocal() {
		return local;
	}
	public void setLocal(Equipo local) {
		this.local = local;
	}
	public Equipo getVisitante() {
		return visitante;
	}
	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
	}
	public Estadio getEstadio() {
		return estadio;
	}
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	public double getValorEntrada() {
		return valorEntrada;
	}
	public void setValorEntrada(double valorEntrada) {
		this.valorEntrada = valorEntrada;
	}
	
	
	
	
}
