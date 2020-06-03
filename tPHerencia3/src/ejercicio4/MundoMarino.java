package ejercicio4;

import java.util.ArrayList;

public class MundoMarino {

	/*
	 * Esta clase la creamos mas que nada para completar una parte del ejercicio
	 * (que despues no se ejecuta)
	 */

	private ArrayList<Persona> trabajadoresExplotados;
	private ArrayList<Animal> animales;
	private Alimento[] listaAlimentos;

	public MundoMarino() {
		trabajadoresExplotados = new ArrayList<Persona>();
		animales = new ArrayList<Animal>();
		listaAlimentos = new Alimento[3];
	}

	public ArrayList<Persona> getTrabajadoresExplotados() {
		return trabajadoresExplotados;
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public Alimento[] getListaAlimentos() {
		return listaAlimentos;
	}

	public void setTrabajadoresExplotados(ArrayList<Persona> trabajadoresExplotados) {
		this.trabajadoresExplotados = trabajadoresExplotados;
	}

	public void setListaAlimentos(Alimento[] listaAlimentos) {
		this.listaAlimentos = listaAlimentos;
	}

	//1.Se fija la lista de cuidadores contratados hasta el momento
	//2.Chequea si tienen posibilidad de incorporar un nuevo animal
	//3. Si no hay ninguno se indica que hay que contratar uno nuevo
	public void agregarAnimal(Animal animalito) {

		int i = 0;
		boolean encontrado = false;
		Cuidador cuidAux = null;

		while (i < trabajadoresExplotados.size() && encontrado == false) {
			if (trabajadoresExplotados.get(i) instanceof Cuidador) {
				cuidAux = (Cuidador) trabajadoresExplotados.get(i);
				if( cuidAux.getAnimalesACargo() > 0) {
					cuidAux.agregarAnimal(animalito);
					encontrado = true;
				}
				
			}else {
				i++;
			}
		}
		if(!encontrado) {
			System.out.println("No hay cuidadores disponibles, hay que contratar uno nuevo");
		}
	}
}
