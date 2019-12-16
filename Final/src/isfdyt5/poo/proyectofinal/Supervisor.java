package isfdyt5.poo.proyectofinal;

public class Supervisor extends Empleado {

	public Supervisor(Persona empleado) {
		super(empleado);
		// TODO Auto-generated constructor stub
	}

	public double sueldo() {
		return super.getSueldoBasico() + super.getSueldoBasico()*0.30;
	}
	
}