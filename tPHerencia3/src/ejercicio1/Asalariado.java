package ejercicio1;

public class Asalariado extends Empleado {

	private float sueldo;
	
	public Asalariado() {
		
	}
	
	public Asalariado(String nombre, int edad, float sueldo) {
		super(nombre, edad);
		this.setSueldo(sueldo);
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	//método heredado
	public float calcularSueldo() {
		return getSueldo();
	}

	@Override
	public String toString() {
		return "Asalariado ["+super.toString()+"sueldo=" + sueldo+ "]";
	}
}
