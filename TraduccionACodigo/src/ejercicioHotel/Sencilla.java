package ejercicioHotel;

public class Sencilla extends Habitacion {
	private boolean exterior;

	public Sencilla(double precio, int numero, String foto, Hotel[] hotel, Reserva[] reservas, boolean exterior) {
		super(precio, numero, foto, hotel, reservas);
		this.exterior = exterior;
	}
	
	public Sencilla() {
		this(0, 0, null, null, null, false);
	}

	public boolean isExterior() {
		return exterior;
	}

	public void setExterior(boolean exterior) {
		this.exterior = exterior;
	}

	@Override
	public String toString() {
		return "Sencilla [exterior=" + exterior + ", precio=" + precio + ", numero=" + numero + ", foto=" + foto + "]";
	}
	
	
}
