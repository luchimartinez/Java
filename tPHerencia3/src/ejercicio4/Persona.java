package ejercicio4;

public abstract class Persona {

	private String nombre;
	private String horarioIngreso;
	private String horarioSalida;
	
	public Persona () {
		
	}
	
	public Persona(String nombre, String horarioIngreso, String horarioSalida) {
		this.nombre = nombre;
		this.horarioIngreso = horarioIngreso;
		this.horarioSalida = horarioSalida;
	}

	public String getNombre() {
		return nombre;
	}

	public String getHorarioIngreso() {
		return horarioIngreso;
	}

	public String getHorarioSalida() {
		return horarioSalida;
	}

}
