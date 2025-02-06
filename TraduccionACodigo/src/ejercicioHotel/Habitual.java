package ejercicioHotel;

public class Habitual extends Cliente{
	private double descuento;

	public Habitual(String nombre, String direccion, String telefono, double descuento) {
		super(nombre, direccion, telefono);
		this.descuento = descuento;
	}
	
	public Habitual() {
		this(null, null, null, 0);
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "Habitual [descuento=" + descuento + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono="
				+ telefono + "]";
	}

	
	
	
}
