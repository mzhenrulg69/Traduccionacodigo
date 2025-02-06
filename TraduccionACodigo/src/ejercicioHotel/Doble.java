package ejercicioHotel;

public class Doble extends Habitacion {
	private boolean matrimonio;

	public boolean isMatrimonio() {
		return matrimonio;
	}

	public void setMatrimonio(boolean matrimonio) {
		this.matrimonio = matrimonio;
	}

	@Override
	public String toString() {
		return "Doble [matrimonio=" + matrimonio + ", precio=" + precio + ", numero=" + numero + ", foto=" + foto + "]";
	}
	
	
}
