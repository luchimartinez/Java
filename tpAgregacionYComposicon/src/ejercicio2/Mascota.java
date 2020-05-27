package ejercicio2;

public class Mascota {

	private String nombre;
	private String tipo;
	
	public Mascota() {
		
	}
	
	public Mascota(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getTipo() {
		return tipo;
	}


	public String getValor() {
		return tipo + ", "+ nombre;
	}
	
}
