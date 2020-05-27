package ejercicio2;

public class Atleta {

//	Para los Juegos Olímpicos de la Juventud nos pidieron un programa con el cual
//	podamos calcular quién fue el ganador de una carrera. Para eso ingresaremos un
//	atleta y los segundos que ha empleado (con decimales) para recorrer la distancia de
//	una especialidad determinada. debe tener en cuenta que puede haber más de un
//	ganador (sus tiempos empleados fueron los mismos).
	
	private String nombre;
	private double tiempoRecorrido;
	private Especialidad carreraRealizada;
	
	public Atleta (String nombre, double tiempoRecorrido, Especialidad carreraRealizada) {
		
		this.nombre = nombre;
		this.tiempoRecorrido = tiempoRecorrido;
		this.carreraRealizada = carreraRealizada;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTiempoRecorrido() {
		return tiempoRecorrido;
	}

	public void setTiempoRecorrido(double tiempoRecorrido) {
		this.tiempoRecorrido = tiempoRecorrido;
	}

	public Especialidad getCarreraRealizada() {
		return carreraRealizada;
	}

	public void setCarreraRealizada(Especialidad carreraRealizada) {
		this.carreraRealizada = carreraRealizada;
	}
	
}
