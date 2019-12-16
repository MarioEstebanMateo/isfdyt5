package isfdyt5.poo.proyectofinal;

public abstract class Empleado {

	private Persona empleado;
	private double sueldoBasico;

	public Empleado(Persona empleado) {
		super();
		this.empleado = empleado;
	}

	public Persona getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Persona empleado) {
		this.empleado = empleado;
	}
	
	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public abstract double sueldo();
	
}