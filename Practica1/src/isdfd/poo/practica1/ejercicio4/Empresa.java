package isdfd.poo.practica1.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private List <Contenedor> contenedores = new ArrayList<Contenedor>();
	private String nombre;
	private String direccion;
	
	/* a) */
	public float pesoArticulo(Articulo unArticulo) {
		return unArticulo.getPeso();
	}
	
	/* b) */
	public float pesoContenedor(Contenedor unContenedor) {
		return unContenedor.pesoContenedor();
	}
	
	/* c) */
	public float pesoContenedores() {
		float peso = 0;
		for (Contenedor c: contenedores) {
			peso+=c.pesoContenedor();
		}
		return peso;
	}
	
	/* d) */
	public float valorDeLosArticulos(Contenedor unContenedor) {
		return unContenedor.valorArticulos();
	}
	
	/* e) */
	public float valorDeTodosLosArticulo() {
		float valor = 0;
		for (Contenedor c: contenedores) {
			valor+=c.valorArticulos();
		}
		return valor;
	}
		
	public void agregarContenedor(Contenedor c) {
		contenedores.add(c);
	}

	public Empresa(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
