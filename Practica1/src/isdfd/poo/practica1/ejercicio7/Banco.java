package isdfd.poo.practica1.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nombre;
	private String ubicacion;
	private Cliente cliente;
	private List<Transaccion> transacciones = new ArrayList<Transaccion>();
	
	//a)
	public void agregarTransaccion(Transaccion unaTransaccion) {
		transacciones.add(unaTransaccion);
	}
	
	//b)
	public int cantidadTotalDeTransacciones() {
		return transacciones.size();
	}
	
	//c)
	public float impuestoACobrarDe(Transaccion unaTransaccion) {
		return unaTransaccion.impuestoEnPesos();
	}

	//d)
	
	public float impuestosACobrar() {
		float total = 0;
		for (Transaccion t: transacciones) {
			total+=t.impuestoEnPesos();
		}
		return total;
	}
	
	//e)
	
	public float montoTotalDeTransacciones() {
		float total = 0;
		for (Transaccion t: transacciones) {
			total+=t.getMonto()+t.impuestoEnPesos();
		}
		return total;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
