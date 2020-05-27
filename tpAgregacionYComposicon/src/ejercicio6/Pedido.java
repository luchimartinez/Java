package ejercicio6;

public class Pedido {

	private String nroCompra;
	private String fechaCompra;
	private Libro libro;
	private  Cliente cliente;
	private int cantidad;
	
	
	public Pedido () {
	
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getNroCompra() {
		return nroCompra;
	}

	public void setNroCompra(String nroCompra) {
		this.nroCompra = nroCompra;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	
}
