package ejercicioHotel;

public class Reserva {
	private String fechaEntrada;
	private int numeroDias;
	private Habitacion habitacion;
	private Cliente cliente;

	public Reserva(String fechaEntrada, int numeroDias, Habitacion habitacion, Cliente cliente) {
		this.fechaEntrada = fechaEntrada;
		this.numeroDias = numeroDias;
		this.habitacion = habitacion;
		this.cliente = cliente;
	}
	
	public Reserva() {
		this(null, 0, null, null);
	}

	public String getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public int getNumeroDias() {
		return numeroDias;
	}

	public void setNumeroDias(int numeroDias) {
		this.numeroDias = numeroDias;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setHotel(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Reserva [fechaEntrada=" + fechaEntrada + ", numeroDias=" + numeroDias + ", habitacion=" + habitacion
				+ ", cliente=" + cliente + "]";
	}
	
	
}