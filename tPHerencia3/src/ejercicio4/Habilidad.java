package ejercicio4;

public class Habilidad {
	
	private String nombre;
	private int cantidadAlimento;
	private TipoAlimento alimento;
	
	public Habilidad() {
		
	}

	public String getNombre() {
		return nombre;
	}
	
	public int getCantidadAlimento() {
		return cantidadAlimento;
	}

	public TipoAlimento getAlimento() {
		return alimento;
	}

	public void setCantidadAlimento(int cantidadAlimento) {
		this.cantidadAlimento = cantidadAlimento;
	}

	public void setAlimento(TipoAlimento alimento) {
		this.alimento = alimento;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
