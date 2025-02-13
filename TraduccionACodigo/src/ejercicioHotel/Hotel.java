package ejercicioHotel;

public class Hotel {
 private String nombre;
 private int numeroEstrellas;
 
 private Cliente [] clientes;
 private Reserva [] reservas;
 private Habitacion [] habitaciones;
 
 public Hotel(String nombre, int numeroEstrellas, Cliente [] clientes, Reserva [] reservas, Habitacion [] habitaciones) {
	this.nombre = nombre;
	this.numeroEstrellas = numeroEstrellas;
	this.clientes = clientes;
	this. reservas= reservas;
	this.habitaciones=habitaciones;
}
 
 public Hotel() {
	 this(null, 0, null, null,null);
 }
 
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getNumeroEstrellas() {
	return numeroEstrellas;
}

public void setNumeroEstrellas(int numeroEstrellas) {
	this.numeroEstrellas = numeroEstrellas;
}

@Override
public String toString() {
	return "Hotel [nombre=" + nombre + ", numeroEstrellas=" + numeroEstrellas + "]";
}

public void añadirHabitacion(Habitacion habitacion) {
	 
 }
 
 public void añadirCliente(Cliente cliente) {
	 
 }
 
 public void añadirReserva(String fecha, int dias, Cliente cliente, Habitacion habitacion) {
	 
 }
}
