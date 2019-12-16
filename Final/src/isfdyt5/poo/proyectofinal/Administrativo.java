package isfdyt5.poo.proyectofinal;

public class Administrativo extends Empleado {

	public Administrativo(Persona empleado) {
		super(empleado);
		// TODO Auto-generated constructor stub
	}
	
	public double sueldo() {
		return super.getSueldoBasico() + super.getSueldoBasico()*0.15;
	}
	
}
