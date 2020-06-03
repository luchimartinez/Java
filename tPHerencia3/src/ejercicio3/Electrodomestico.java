package ejercicio3;

public abstract class Electrodomestico {

	private String marca;
	private String modelo;
	private String nroSerie;
	private String voltaje;
	private boolean estado;  //encencido o apagado
	private double precio;
	
	
	public Electrodomestico(String marca, String modelo, String nroSerie, String voltaje, boolean estado,
							double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.nroSerie = nroSerie;
		this.voltaje = voltaje;
		this.estado = estado;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}


	public String getModelo() {
		return modelo;
	}


	public String getNroSerie() {
		return nroSerie;
	}


	public String getVoltaje() {
		return voltaje;
	}


	public boolean isEstado() {
		return estado;
	}


	public double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "Electrodomestico [marca=" + marca + ", modelo=" + modelo + ", nroSerie=" + nroSerie + ", voltaje="
				+ voltaje + ", estado=" + estado + ", precio=" + precio + "]";
	}

	
	
	
}
