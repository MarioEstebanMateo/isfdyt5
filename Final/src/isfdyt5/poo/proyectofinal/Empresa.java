package isfdyt5.poo.proyectofinal;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String nombre;
	
	public void setNombre(String n) {
		nombre=n;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	// Empleados
	
	private List <Empleado> empleados = new ArrayList<Empleado>();

	public void addEmpleado (Empleado e) {
		empleados.add(e);
	}
	
	public void removeEmpleado (Empleado e) {
		empleados.remove(e);
	}
	
	public int cantidadEmpleados() {
		return empleados.size();
	}
	
	public double sueldoEmpleado(Empleado e) {
		return e.sueldo();
	}
	
	public double totalSueldosAPagar() {
		double total = 0;
		for (Empleado e: empleados) {
			total+=e.sueldo();
		}
		return total;
	}
	
	//-------------------------------------------------------------------------
	
	// Compras
	
	private List<Compra>compras=new ArrayList<Compra>();
	
	public void addCompra(Compra c) {
		compras.add(c);
	}
	
	public void removeCompra(Compra c) {
		compras.remove(c);
	}
	
	public Empresa(String n) {
		setNombre(n);
	}

	public double montoUnaCompra(Compra c) {
		return c.valor();
	}
	
	public double montoTotalCompras() {
		double t=0;
		for(Compra c:compras) {
			t+=c.valor();
		}
		return t;
	}
	
	//-----------------------------------------------------------------------------
	
	// Ventas
	
	private List <Venta> ventas = new ArrayList<Venta>();
	
	public void addVenta (Venta v) {
		ventas.add(v);
	}
	
	public void removeVenta (Venta v) {
		ventas.remove(v);
	}
	
	public int cantidadVentas() {
		return ventas.size();
	}
	
	public double totalVenta(Venta v) {
		return v.totalVenta();
	}
	
	public double totalVentas() {
		double total = 0;
		for (Venta v: ventas) {
			total+=v.totalVenta();
		}
		return total;
	}
	
}

