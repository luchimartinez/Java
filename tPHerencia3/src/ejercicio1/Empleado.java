package ejercicio1;

public class Empleado {

	protected String nombre;
	protected int edad;
	
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre, int edad) {	
		this.setNombre(nombre);
		this.setEdad(edad);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	public float calcularPago() {
		return 0.0f;
	}
}
