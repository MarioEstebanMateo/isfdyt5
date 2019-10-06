package isdfd.poo.practica3.ejercicio1;

public class ReproductorMultimedia implements VideoClip {

	public void play() {
		System.out.println("Reproduciendo video");
	}
	
	public void bucle() {
		System.out.println("Reproduciendo video en bucle");
	}
	
	public void stop() {
		System.out.println("Se detuvo el video");
	}
	
}
