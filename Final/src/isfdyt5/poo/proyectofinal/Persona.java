package isfdyt5.poo.proyectofinal;

public class Persona {

	private String nombre;
	private String domicilio;
	private String dni;
	
	public Persona(String nombre, String domicilio, String dni) {
		super();
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	
}
