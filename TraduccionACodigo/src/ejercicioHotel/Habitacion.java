package ejercicioHotel;

import java.util.Arrays;

public abstract class Habitacion {
	protected double precio;
	protected int numero;
	protected String foto;
	
	private Hotel [] hotel;
	private Reserva [] reservas;
	
	public Habitacion(double precio, int numero, String foto, Hotel[] hotel, Reserva[] reservas) {
		this.precio = precio;
		this.numero = numero;
		this.foto = foto;
		this.hotel = hotel;
		this.reservas = reservas;
	}
	
	public Habitacion() {
		this(0, 0, null, null, null);
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Hotel[] getHotel() {
		return hotel;
	}

	public void setHotel(Hotel[] hotel) {
		this.hotel = hotel;
	}

	public Reserva[] getReservas() {
		return reservas;
	}

	public void setReservas(Reserva[] reservas) {
		this.reservas = reservas;
	}

	@Override
	public String toString() {
		return "Habitacion [precio=" + precio + ", numero=" + numero + ", foto=" + foto + ", hotel="
				+ Arrays.toString(hotel) + ", reservas=" + Arrays.toString(reservas) + "]";
	}	
}
