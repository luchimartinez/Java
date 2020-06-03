package ejercicio3;

public class Heladera extends Electrodomestico {
	
	private double capacidad;
	private boolean esFrost;
	
	public Heladera(String marca, String modelo, String nroSerie, String voltaje, boolean estado,
			double precio, double capacidad, boolean esFrost) {
		
		super(marca, modelo, nroSerie, voltaje, estado, precio);
		this.capacidad = capacidad;
		this.esFrost = esFrost;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public boolean isEsFrost() {
		return esFrost;
	}

	@Override
	public String toString() {
		
		String frost;
		if(this.esFrost) {
			frost ="si";
		}else {
			frost = "no";
		}
		
		return  getClass().getSimpleName()+"[" +super.getMarca()+" modelo:" +super.getModelo()+", esFrost=" + frost + " capacidad: " + capacidad+" litros" + " precio: $" +super.getPrecio() +"]";
	}
}
