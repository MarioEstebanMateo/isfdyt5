package isfdyt5.poo.proyectofinal;

public class Proveedor {

	private String nombre;
	private int dni;
	private String domicilio;
	
	public Proveedor(String n,int d,String dom) {
		setNombre(n);
		setDni(d);
		setDomicilio(dom);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
}