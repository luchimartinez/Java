package ejercicio2;

import ejercicio1.SubContratado;

public class Vendedor extends SubContratado {

	private float porcentaje;
	
	public Vendedor(String nombre, int edad, float cantHoras, float precioHora, float porcentaje) {
		super(nombre, edad, cantHoras, precioHora);
		this.porcentaje = porcentaje;
	}
	
	public float getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public String toString() {
		return "Vendedor ["+super.getNombre()+ " gana: "+calcularPago()+"]";
	}
	
	public float calcularPago() {
		float total;
		total = super.getCantHoras() * super.getPrecioHora();
		
		total += (total * this.porcentaje)/100; 
		
		return total;
	}
	
	
}
