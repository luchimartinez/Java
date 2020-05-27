package ejercicio6;

public class Libro {

	private String título;
	private String editorial;
	private String id;
	private int stock;
	
	
	public Libro (){
		 
	 }

	 public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getTítulo() {
		return título;
	}

	public void setTítulo(String título) {
		this.título = título;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public  String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
