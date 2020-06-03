package ejercicio3;

public class Licuadora extends Electrodomestico{
	
	private double potencia;
	private int cantVelocidades;
	
	public Licuadora(String marca, String modelo, String nroSerie, String voltaje, boolean estado,
					double precio, double potencia, int cantVelocidades) {
		
		super(marca, modelo, nroSerie, voltaje, estado, precio);
		this.cantVelocidades = cantVelocidades;
		this.potencia = potencia;
	}

	public double getPotencia() {
		return potencia;
	}

	public int getCantVelocidades() {
		return cantVelocidades;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName()+"["+super.toString()+" potencia: " + potencia + ", cantVelocidades: " + cantVelocidades + " precio: $" +super.getPrecio() + "]";
	}

	
	
}
