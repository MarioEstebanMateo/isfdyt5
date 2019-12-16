package isfdyt5.poo.proyectofinal;

import java.util.ArrayList;
import java.util.List;

public class CompraCompuesta extends Compra{

	private List<Articulo>articulos=new ArrayList<Articulo>();
	
	public double valor() {
		double t=0;
		for(Articulo a:articulos) {
			t+=a.precioTotal();
		}
		return t;
	}
	
	public void addArticulo(Articulo a) {
		articulos.add(a);
	}
	
	public void removeArticulo(Articulo a) {
		articulos.remove(a);
	}
	
	public void addAllArticulo(List<Articulo>a) {
		articulos.addAll(a);
	}
        
        public int cantArticulos(){
            return articulos.size();
        }
}