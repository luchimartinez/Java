package ejercicio4;

import java.util.ArrayList;

public abstract class Animal {

	private String nombre;
	private double peso;
	private double tamanio;
	private Cuidador cuidador;
	private ArrayList<Habilidad> habilidades;
	
	
	public Animal (String nombre, double peso, double tamanio) {
		this.nombre = nombre;
		this.peso = peso;
		this.tamanio = tamanio;
		habilidades = new ArrayList<Habilidad>();
	}

	
	public Cuidador getCuidador() {
		return cuidador;
	}
	//Acá me fijo si el cuidador puede recibir al animal o no
	public void setCuidador(Cuidador cuidador) {
		
		if (cuidador.getAnimalesACargo() >0) {
			this.cuidador = cuidador;
		} else {
			System.out.println("Este cuidador ya no puede tener mas animales a cargo");
		}
	}

	public String getNombre() {
		return nombre;
	}


	public double getPeso() {
		return peso;
	}


	public double getTamanio() {
		return tamanio;
	}

	//Acá agrego las habilidades que me pasan por parámetro 
	public void agregarHabilidad(Habilidad habilidad) {
		habilidades.add(habilidad);
	}
	

	public ArrayList<Habilidad> getHabilidades() {
		return habilidades;
	}

	//Recibo el nombre del truco y devuelvo cuanta comida pide ese truco
	public int buscarTruco (String nombreTruco) {
		int devolver = -1, i = 0;
		boolean encontrado = false;
		
		while (i<habilidades.size() && encontrado == false) {
			if (habilidades.get(i).getNombre().equals(nombreTruco)) {
				devolver = habilidades.get(i).getCantidadAlimento();
				encontrado= true;
			} else {
				i++;
			}
		}
		return devolver;
	}
	
	//Recibo si tiene permiso de realizar el truco, el nombre y el tipo de comida e imprimo el mensaje correspondiente
	public void realizarTruco(boolean permiso, String nombreTruco, String tipoComida) {
		String mensaje;
		int comida;
		
		comida = buscarTruco(nombreTruco);
		
		if(permiso) {
			mensaje = this.getClass().getSimpleName() +" "+this.getNombre() +" realizo "+ nombreTruco + " recibio "+ comida +" kg de " + tipoComida ;
		}else {
			mensaje = this.getClass().getSimpleName() +" "+this.getNombre() +" se le pidio realizar "+ nombreTruco + " pero no tiene suficiente alimento";
		}
		 
		System.out.println(mensaje);
	}
}
