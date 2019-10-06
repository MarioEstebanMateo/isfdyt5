package isdfd.poo.practica1.ejercicio7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente c1 = new Cliente();
		c1.setNombre("Juan");
		
		Cliente c2 = new Cliente();
		c2.setNombre("Pedro");
		
		Cliente c3 = new Cliente();
		c3.setNombre("Maria");
		
		Internacional i1 = new Internacional();
		i1.setCliente(c1);
		i1.setMonto(100);
		i1.setMoneda(Moneda.DOLAR);
		
		Internacional i2 = new Internacional();
		i2.setCliente(c2);
		i2.setMonto(100);
		i2.setMoneda(Moneda.YEN);
		
		Internacional i3 = new Internacional();
		i3.setCliente(c3);
		i3.setMonto(100);
		i3.setMoneda(Moneda.EURO);
		
		Nacional n4 = new Nacional();
		n4.setCliente(c3);
		n4.setMonto(100);
		
		Banco b1 = new Banco();
		b1.setNombre("Banco Banquito");
		b1.setUbicacion("Pergamino");
		b1.setCliente(c1);
		b1.setCliente(c2);
		b1.setCliente(c3);
		
		//------------------------------------------------------------------------------------------
		
		b1.agregarTransaccion(i1);
		b1.agregarTransaccion(i2);
		b1.agregarTransaccion(i3);
		b1.agregarTransaccion(n4);
		
		System.out.println("Cantidad total de transacciones: " + b1.cantidadTotalDeTransacciones());
		
		System.out.println(b1.impuestoACobrarDe(i1));
		System.out.println(b1.impuestoACobrarDe(i2));
		System.out.println(b1.impuestoACobrarDe(i3));
		System.out.println(b1.impuestoACobrarDe(n4));
		
		System.out.println("El total de todos los impuestos a cobrar en pesos es: " + b1.impuestosACobrar());
		
		System.out.println("El monto total de todas las transacciones en pesos es: " + b1.montoTotalDeTransacciones());
		
	}

}
