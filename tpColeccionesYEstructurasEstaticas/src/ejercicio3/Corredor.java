package ejercicio3;

import ejercicio2.Especialidad;

public class Corredor {


	private String nombre;
	private double tiempoRecorrido;
	private Especialidad carreraRealizada;
	
	public Corredor (String nombre, double tiempoRecorrido, Especialidad carreraRealizada) {
		
		this.nombre = nombre;
		this.tiempoRecorrido = tiempoRecorrido;
		this.carreraRealizada = carreraRealizada;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTiempoRecorrido() {
		return tiempoRecorrido;
	}

	public void setTiempoRecorrido(double tiempoRecorrido) {
		this.tiempoRecorrido = tiempoRecorrido;
	}

	public Especialidad getCarreraRealizada() {
		return carreraRealizada;
	}

	public void setCarreraRealizada(Especialidad carreraRealizada) {
		this.carreraRealizada = carreraRealizada;
	}
	
	
}
