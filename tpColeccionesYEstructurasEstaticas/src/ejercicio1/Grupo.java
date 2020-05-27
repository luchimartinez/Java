package ejercicio1;

import java.util.ArrayList;

public class Grupo {

	String nombreGrupo;
	ArrayList<String> integrantes;

	public Grupo(String nombre) {
		setNombre(nombre);
		ArrayList<String> integrantes = new ArrayList<String>();
		this.integrantes = integrantes;
	}

	public void setNombre(String nombre) {
		this.nombreGrupo = nombre;
	}

	public String getNombreGrupo() {
		return this.nombreGrupo;
	}

	public int getCantidadIntegrantes() {
		return this.integrantes.size();
	}
	
	
	public boolean existeIntegrante(String nombreIntegrante) {
		
		boolean encontrado = false;
		int iterador = 0;

		while (iterador < this.integrantes.size() && encontrado == false) {
			if (this.integrantes.get(iterador).equals(nombreIntegrante)) {
				encontrado = true;
			} else {
				iterador++;
			}
		}
		
		return encontrado;
		
	}
	
	public void agregarIntegrante(String nombreIntegrante) {

//		Agrega al grupo el nombre de un nuevo integrante, siempre y cuando éste no
//		haya sido cargado con anterioridad. Cuando ya exista, no debe volver a
//		agregarlo.
		
		boolean encontrado;
		
		encontrado = existeIntegrante(nombreIntegrante);

		if (encontrado == false) {
			this.integrantes.add(nombreIntegrante);
			System.out.println(nombreIntegrante+ " fue asignado al grupo " + getNombreGrupo());
		} else {
			System.out.println("Integrante ya creado");
		}
	}

	private int obtenerPosicionIntegrante(String nombreIntegrante) {

//		Devuelve la posición en el grupo del integrante cuyo nombre se ha recibido por
//		parámetro. En caso de no encontrarlo devolverá -1.
		
		int iterador = 0;
		boolean encontrado = false;
		int noEncontrado = -1;

		while (iterador <= this.integrantes.size() && encontrado == false) {
			if (this.integrantes.get(iterador).equals(nombreIntegrante)) {
				return iterador;
			} else {
				iterador++;
			}
		}

		return noEncontrado;

	}

	public String obtenerIntegrante(int posicion) {
		
//		Recibe un valor entero que representa la posición del integrante en la lista (entero igual o mayor que 1) y 
//		devuelve el integrante guardado en (posicion - 1) dentro de la colección de integrantes. 
//		Si el integrante no existe se debe devolver null.
		
		if (posicion >= 1 || posicion < this.integrantes.size() ) {
		
			if (this.integrantes.get(posicion)!= null) {
				return this.integrantes.get(posicion-1);
			} else {
				 return null;
			}
		
	} else {
		return "VALOR NO VALIDO";
	}
		
}

	public String buscarIntegrante(String nombre) {

//		Busca al integrante del grupo cuyo nombre coincida con el parámetro de
//		entrada. En caso de que haya coincidencia, lo devuelve; caso contrario, el
//		método devolverá null.

		int acum = 0;

		for (int i = 0; i < this.integrantes.size(); i++) {
			if (this.integrantes.get(i).equals(nombre)) {
				acum++;
			}
		}
		if (acum > 0) {
			return nombre + "*" + acum;
		} else {
			return null;
		}

	}

	public String removerIntegrante(String nombreIntegrante) {

//		Remueve de la colección de integrantes a aquel cuyo nombre coincide con el
//		nombre recibido como parámetro. Si lo encontró, luego de removerlo debe
//		devolverlo con return, y si no debe devolver null.

		
		  if(buscarIntegrante(nombreIntegrante) != null) {
	            this.integrantes.remove(obtenerPosicionIntegrante(nombreIntegrante));
	            return nombreIntegrante;
	        }else
	        return null;
	    }
		
		
	private void mostrarIntegrantes() {
		
//		Muestra por consola la cantidad de integrantes y los nombres de cada uno de
//		ellos.
		
		System.out.println("La cantidad de integrantes es de: "+ getCantidadIntegrantes());
		
		for (int i = 0; i < this.integrantes.size(); i++) {
			System.out.println(this.integrantes.get(i));
		}
		
	}
	
	
	public void mostrar() {
		
//		Muestra por consola el nombre del grupo, la cantidad de integrantes y el
//		nombre de cada uno de ellos.
		
		System.out.println(nombreGrupo);
		mostrarIntegrantes();
	}
	
	public void vaciar() {
		//Elimina todos los elementos de la lista de integrantes.
		
		this.integrantes.clear();
	}
	
	
}
