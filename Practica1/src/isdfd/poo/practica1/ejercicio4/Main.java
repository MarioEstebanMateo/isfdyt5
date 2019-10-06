package isdfd.poo.practica1.ejercicio4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Articulo a1  = new Articulo("fideos", "11/12/19", 10, 10);
		Articulo a2  = new Articulo("azucar", "11/12/19", 10, 10);
		Articulo a3  = new Articulo("yerba", "11/12/19", 10, 10);
		Articulo a4  = new Articulo("leche", "11/12/19", 10, 10);
		Articulo a5  = new Articulo("arroz", "11/12/19", 10, 10);
		
		Contenedor c1 = new Contenedor(001, "Argentina", 100);
		c1.agregarArticuloACaja(a1);
		c1.agregarArticuloACaja(a2);
		c1.agregarArticuloACaja(a3);
		c1.setArticulo(a4);
		c1.valorCaja();
		c1.valorArticulos();
		c1.pesoContenedor();
				
		Contenedor c2 = new Contenedor(002, "Uruguay", 100);
		c2.agregarArticuloACaja(a2);
		c2.agregarArticuloACaja(a3);
		c2.setArticulo(a4);
		c2.valorCaja();
		c2.valorArticulos();
		c2.pesoContenedor();
			
		Contenedor c3 = new Contenedor(003, "Paraguay", 100);
		c3.agregarArticuloACaja(a1);
		c3.agregarArticuloACaja(a2);
		c3.setArticulo(a3);
		c3.setArticulo(a5);
		c3.valorCaja();
		c3.valorArticulos();
		c3.pesoContenedor();
		
		
		Empresa e1 = new Empresa("Mercadito", "Pergamino");
		e1.agregarContenedor(c1);
		e1.agregarContenedor(c2);
		e1.agregarContenedor(c3);
		
		System.out.println("El Peso del articulo "+a1.getNombre()+" es: "+e1.pesoArticulo(a1)+" kgs");
		System.out.println("El Peso del contenedor "+c1.getIdentificacion()+" es: "+e1.pesoContenedor(c1) + " kgs");
		System.out.println("El Peso total de los contenedores de la empresa "+e1.getNombre()+" es: "+e1.pesoContenedores()+" kgs");
		System.out.println("El Valor de los articulos del contenedor "+c2.getIdentificacion()+" es: $"+e1.valorDeLosArticulos(c2));
		System.out.println("El Valor de todos los articulos de la empresa "+e1.getNombre()+" es: $"+e1.valorDeTodosLosArticulo());
		
	}

}
