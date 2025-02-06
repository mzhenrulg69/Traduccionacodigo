package ejercicioHotel;

public class Suit extends Habitacion {
	private boolean bañera;
	private boolean sauna;
	private boolean mirador;
	
	public Suit(double precio, int numero, String foto, Hotel[] hotel, Reserva[] reservas) {
		super(precio, numero, foto, hotel, reservas);
	}

	public boolean isBañera() {
		return bañera;
	}

	public void setBañera(boolean bañera) {
		this.bañera = bañera;
	}

	public boolean isSauna() {
		return sauna;
	}

	public void setSauna(boolean sauna) {
		this.sauna = sauna;
	}

	public boolean isMirador() {
		return mirador;
	}

	public void setMirador(boolean mirador) {
		this.mirador = mirador;
	}

	@Override
	public String toString() {
		return "Suit [bañera=" + bañera + ", sauna=" + sauna + ", mirador=" + mirador + ", precio=" + precio
				+ ", numero=" + numero + ", foto=" + foto + "]";
	}

	
}
