package isdfd.poo.practica1.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {

	private int identificacion;
	private String paisDestino;
	private float pesoMaximo;
	private Articulo articulo;
	private List <Articulo> cajas = new ArrayList<Articulo>();
	private List <Articulo> articulos = new ArrayList<Articulo>();
	
	public float pesoContenedor() {
		float peso = 0;
		for (Articulo c: cajas) {
			peso+=c.getPeso();
		}
		for (Articulo a: articulos) {
			peso+=a.getPeso();
		}
		return peso;
	}
	
	public float valorArticulos() {
		float valor = 0;
		for (Articulo c: cajas) {
			valor+=c.getValor();
		}
		for (Articulo a: articulos) {
			valor+=a.getValor();
		}
		return valor;
	}
	
	public void agregarArticuloACaja(Articulo a) {
		cajas.add(a);
	}
	
	public float valorCaja() {
		float valor = 0;
		for (Articulo a: cajas) {
			valor+=a.getValor();
		}
		return valor;
	}
	
	public Contenedor(int identificacion, String paisDestino, float pesoMaximo) {
		super();
		this.identificacion = identificacion;
		this.paisDestino = paisDestino;
		this.pesoMaximo = pesoMaximo;
	}
	
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public String getPaisDestino() {
		return paisDestino;
	}
	public void setPaisDestino(String paisDestino) {
		this.paisDestino = paisDestino;
	}
	public float getPesoMaximo() {
		return pesoMaximo;
	}
	public void setPesoMaximo(float pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
		articulos.add(articulo);
	}
	
	
		
}
