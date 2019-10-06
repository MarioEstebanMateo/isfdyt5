package isdfd.poo.practica1.ejercicio4;

public class Articulo {

	private String nombre;
	private String fechaVencimiento;
	private float valor;
	private float peso;
	
	public Articulo(String nombre, String fechaVencimiento, float valor, float peso) {
		super();
		this.nombre = nombre;
		this.fechaVencimiento = fechaVencimiento;
		this.valor = valor;
		this.peso = peso;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
}
