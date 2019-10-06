package isdfd.poo.practica1.ejercicio7;

public class Internacional extends Transaccion {

	private Moneda moneda;
	
	@Override
	public float impuestoEnPesos() {
		return (getMonto() * moneda.monto()) * 0.1F;
	}
	
	public Moneda getMoneda() {
		return moneda;
	}
	
	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
	}
	
}
