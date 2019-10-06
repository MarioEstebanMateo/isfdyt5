package isdfd.poo.practica1.ejercicio7;

public enum Moneda {

	DOLAR(27.09f), YEN(0.24f), EURO(31.49F);
	
	private final float monto;
	
	Moneda(float monto){
		this.monto = monto;
	}
	
	public float monto() {
		return monto;
	}
	
}
