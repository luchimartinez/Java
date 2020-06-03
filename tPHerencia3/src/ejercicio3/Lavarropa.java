package ejercicio3;

public class Lavarropa extends Electrodomestico{
	
	private int cargaMaxima;
	private String esAutomatico;
	
	public Lavarropa(String marca, String modelo, String nroSerie, String voltaje, boolean estado,
					double precio, int cargaMaxima, String esAutomatico) {
		
		super(marca, modelo, nroSerie, voltaje, estado, precio);
		this.cargaMaxima = cargaMaxima;
		this.esAutomatico = esAutomatico;
	}

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public String isEsAutomatico() {
		return esAutomatico;
	}

	@Override
	public String toString() {
		
		return getClass().getSimpleName()+"[" +super.getMarca()+" modelo:" +super.getModelo()+" cargaMaxima: " + cargaMaxima +" kg" +", esAutomatico: " + esAutomatico + " precio: $" +super.getPrecio() + "]";
	}
}
