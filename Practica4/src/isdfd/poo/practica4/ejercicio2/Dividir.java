package isdfd.poo.practica4.ejercicio2;

public class Dividir {
	
	public int dividir (int a, int b) throws DividirException {
		if (b==0) {
			throw new DividirException();
		}
		return a/b;
	}
	
	public static void main(String[] args) throws DividirException {
	
	
	Dividir d = new Dividir();
		
	try {
	System.out.println(d.dividir(9, 3));
	
	System.out.println(d.dividir(9, 0));
	}
	
	catch (DividirException e)	{
		System.out.println("No se puede dividir por 0");
	}
	
	}
}

