package isdfd.poo.practica1.ejercicio7;

public abstract class Transaccion {
	
	private float monto;
	private Cliente cliente;
	
	public abstract float impuestoEnPesos();
	
	public void setMonto(float monto){
		this.monto = monto;
	}
	
	public float getMonto() {
		return monto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
