package isfdyt5.poo.proyectofinal;

public class Descuento extends Cupon {

	@Override
	public double cargo(double monto) {
		return 	monto-(monto*1.1);
	}

}
