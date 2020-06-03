package ejercicio4;

public class LoboMarino extends Animal{
	
	private TipoAlimento comida;
	
	public LoboMarino(String nombre, double peso, double tamanio) {
		super(nombre, peso, tamanio);
		comida = TipoAlimento.CANGREJO;
	}

	public TipoAlimento getComida() {
		return comida;
	}

	//Agrego las habilidades
	public void agregarHabilidades(String nombre, int cantidadAlimento) {
		
		Habilidad h1 = new Habilidad();
		h1.setNombre(nombre);
		h1.setCantidadAlimento(cantidadAlimento);
		h1.setAlimento(TipoAlimento.CANGREJO);
		agregarHabilidad(h1);
	}
}
