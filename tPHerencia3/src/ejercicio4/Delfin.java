package ejercicio4;

public class Delfin extends Animal{
	
	private Persona entrenador;
	private TipoAlimento comida;
	
	public Delfin(String nombre, double peso, double tamanio, Persona entrenador, Cuidador cuidador) {
		super(nombre, peso, tamanio);
		super.setCuidador(cuidador);
		this.entrenador = entrenador;
		comida = TipoAlimento.PULPO;
		
	}

	public Persona getEntrenador() {
		return entrenador;
	}

	public TipoAlimento getComida() {
		return comida;
	}
	
	public Cuidador getGuidador() {
		return this.getCuidador();
	}
	
	//Agrego las habilidades
	public void agregarHabilidades(String nombre, int cantidadAlimento) {
		Habilidad h1 = new Habilidad();
		h1.setNombre(nombre);
		h1.setCantidadAlimento(cantidadAlimento);
		h1.setAlimento(TipoAlimento.PULPO);
		agregarHabilidad(h1);
	}
	
	
}
