package ejercicio1;

public class SubContratado extends Empleado{
	
	private float cantHoras;
	private float precioHora;
	
	public SubContratado() {
		
	}
	
	public SubContratado (String nombre, int edad, float cantHoras, float precioHora) {
		super(nombre, edad);
		this.setCantHoras(cantHoras);
		this.setPrecioHora(precioHora);
	}
	
	public float getCantHoras() {
		return cantHoras;
	}
	
	public void setCantHoras(float cantHoras) {
		this.cantHoras = cantHoras;
	}
	
	public float getPrecioHora() {
		return precioHora;
	}
	
	public void setPrecioHora(float precioHora) {
		this.precioHora = precioHora;
	}

	@Override
	public String toString() {
		return "SubContratado ["+super.toString()+" cantHoras=" + cantHoras + ", precioHora=" + precioHora + " dando un total de: "+calcularPago()+"]";
	}
	
	//método heredado
	public float calcularPago() {
		float total;
		total = getCantHoras() * getPrecioHora();
		return total;
	}

}
