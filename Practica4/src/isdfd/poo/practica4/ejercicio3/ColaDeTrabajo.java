package isdfd.poo.practica4.ejercicio3;

import java.util.LinkedList;
import java.util.Queue;

public class ColaDeTrabajo implements Trabajo {

	private Queue <Trabajo> listatrabajos = new LinkedList<Trabajo>();
	private boolean lista;
	private String nombre;
	
	public void ejecutar() {
		
	}
	
	public ColaDeTrabajo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public ColaDeTrabajo(Queue<Trabajo> listatrabajos) {
		super();
		this.listatrabajos = listatrabajos;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean isLista() {
		return lista;
	}
	public void setLista(boolean lista) {
		this.lista = lista;
	}
	
	public void addTrabajo (Trabajo t) {
		listatrabajos.add(t);
	}
	
	public Trabajo sacar() throws NoListaException, SinTrabajoEnColaException {
		if (!lista) {
				throw new NoListaException(nombre,listatrabajos.size());
		}
		else {
			if (listatrabajos.size()!=0) {
				return listatrabajos.poll();
			}
			else {
				throw new SinTrabajoEnColaException(nombre);			
			}
		}
	}
}