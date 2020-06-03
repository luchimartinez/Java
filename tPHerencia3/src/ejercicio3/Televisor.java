package ejercicio3;

public class Televisor extends Electrodomestico {

	private int dimensionPulgadas;
	private boolean esSmart;
	
	public Televisor(String marca, String modelo, String nroSerie, String voltaje, boolean estado,
			double precio, int dimensionPulgadas, boolean esSmart) {
		super(marca, modelo, nroSerie, voltaje, estado, precio);
		this.dimensionPulgadas = dimensionPulgadas;
		this.esSmart= esSmart;
	}

	public int getDimensionPulgadas() {
		return dimensionPulgadas;
	}

	public boolean isEsSmart() {
		return esSmart;
	}

	@Override
	public String toString() {
		
		String smart;
		if(this.esSmart) {
			smart ="si";
		}else {
			smart = "no";
		}
		
		return getClass().getSimpleName()+"["+super.getMarca()+" modelo:" +super.getModelo()+" dimensionPulgadas: " + dimensionPulgadas+" pulagadas"
				+ ", esSmart: " + smart + " precio: $" +super.getPrecio() + "]";
	}


	
	
}
