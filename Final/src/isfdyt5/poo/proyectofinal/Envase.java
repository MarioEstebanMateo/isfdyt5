package isfdyt5.poo.proyectofinal;

public enum Envase {
	
	CHICO(100), MEDIO(200), GRANDE(400);

	private int tamanio;

	private Envase(int tamanio) {
		this.tamanio = tamanio;
	}

	public int getTamanio() {
		return tamanio;
	}

	
}