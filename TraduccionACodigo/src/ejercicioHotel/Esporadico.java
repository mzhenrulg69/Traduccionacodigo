package ejercicioHotel;

public class Esporadico extends Cliente {
	private String oferta;

	public Esporadico(String nombre, String direccion, String telefono, String oferta) {
		super(nombre, direccion, telefono);
		this.oferta = oferta;
	}
	
	public Esporadico() {
		this(null, null, null, null);
	}

	public String getOferta() {
		return oferta;
	}

	public void setOferta(String oferta) {
		this.oferta = oferta;
	}

	@Override
	public String toString() {
		return "Esporadico [oferta=" + oferta + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono="
				+ telefono + "]";
	}

	
}
