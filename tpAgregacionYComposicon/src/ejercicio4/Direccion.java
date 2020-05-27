package ejercicio4;

public class Direccion {

	private String calle;
	private String altura;
	private String pisoYDepto;
	
	public Direccion(String calle, String altura, String pisoYDepto) {
		this.calle = calle;
		this.altura = altura;
		this.pisoYDepto = pisoYDepto;
	}
	
	public String getDireccion() {
		return calle + " " + altura + " " + pisoYDepto;
	}
	
}
