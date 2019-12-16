package isfdyt5.poo.proyectofinal;

import java.util.ArrayList;
import java.util.List;

public class Helado {

	private Cliente cliente;
	private Envase envase;
	private List <Gusto> gustos = new ArrayList<Gusto>();
        private int cantidad;
        
        public void setCantidad(int c){
            cantidad = c;
        }
        
        public int getCantidad(){
            return cantidad;
        }

	public void addGusto(Gusto g) {
		gustos.add(g);
	}
	
	public void removeGusto(Gusto g) {
		gustos.add(g);
	}
        
        public int totalGustos(){
            return gustos.size();
        }
        
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Envase getEnvase() {
		return envase;
	}

	public void setEnvase(Envase envase) {
		this.envase = envase;
	}

	public double importe() {
		return getCliente().aplicarCargos(envase.getTamanio()*cantidad);
	}
}
