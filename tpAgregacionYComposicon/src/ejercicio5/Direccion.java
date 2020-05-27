package ejercicio5;

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
	
	public String pisoYDepto() {
		return this.pisoYDepto;
	}
	
	public String getCalle() {
		return this.calle;
	}
	
	public String getAltura() {
		return this.altura;
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public void setAltura (String altura) {
		this.altura = altura;
	}
	
	public void setPisoYDepto (String pisoYDepto) {
		this.pisoYDepto = pisoYDepto;
	}
	
	
	
}
