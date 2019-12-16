package isfdyt5.poo.proyectofinal;

import java.util.ArrayList;
import java.util.List;

public class Venta {
	
	private List <Helado> helados = new ArrayList<Helado>();

	public void addHelado(Helado h) {
		helados.add(h);
	}
	
	public void removeHelado(Helado h) {
		helados.remove(h);
	}
	
        public int cantHelados(){
            return helados.size();
        }
        
	public double totalHelado(Helado h) {
		return h.importe();
	}
	
	public double totalVenta() {
		double total = 0;
		for (Helado h: helados) {
			total += h.importe();
		}
		return total;
	}
	
}
