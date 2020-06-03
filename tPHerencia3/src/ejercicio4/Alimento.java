package ejercicio4;

public class Alimento {   //stock

	private int cantidad;
	private TipoAlimento tipoComida;
	
	public Alimento(int cantidad, TipoAlimento tipo) {
		this.cantidad = cantidad;
		this.tipoComida = tipo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public TipoAlimento getTipoComida() {
		return tipoComida;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
	
}
