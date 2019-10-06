package isdfd.poo.practica1.ejercicio7;
	

public class Nacional extends Transaccion {

	@Override
	public float impuestoEnPesos() {
		return getMonto() * 0.08F;
	}
	
}
