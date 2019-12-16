package isfdyt5.poo.proyectofinal;

public class Articulo {
	private double precio;
	private double cantidad;
	private String nombre;
	
	public Articulo(double p, double c,String n) {
		setPrecio(p);
		setCantidad(c);
		setNombre(n);
	}

	public double getPrecio() {
		return precio;
	}

	public void setNombre(String n) {
		this.nombre = n;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public double precioTotal() {
		return precio * cantidad;
	}
	
}