package isfdyt5.poo.proyectofinal;

public abstract class Compra {

	private Proveedor proveedor;
	
	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor p) {
		proveedor = p;
	}
	
	public abstract double valor();
}



