package ejercicio4;

public class Entrenador extends Persona{
	
	private int aniosExperiencia;
	
	
	public Entrenador(String nombre, String horarioIngreso, String horarioSalida, int aniosExperiencia) {
		super(nombre, horarioIngreso, horarioSalida);
		this.aniosExperiencia = aniosExperiencia;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}
	
}
