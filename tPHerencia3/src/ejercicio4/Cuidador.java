package ejercicio4;

import java.util.ArrayList;

public class Cuidador extends Persona{
	
	private int animalesACargo;
	private Alimento[] comidaACargo;
	private ArrayList<Animal> listaAnimales;
	
	public Cuidador(String nombre, String horarioIngreso, String horarioSalida, int animalesACargo) {
		super(nombre, horarioIngreso, horarioSalida);
		this.animalesACargo = animalesACargo;
		listaAnimales = new ArrayList<Animal>();
		comidaACargo = new Alimento[3];
	}

	public int getAnimalesACargo() {
		return animalesACargo;
	}
	
	//Recibe un animal, si tiene lugar lo agrega y resta un lugar y sino imprime mensaje
	public void agregarAnimal (Animal animalito) {
		
		if (animalesACargo > 0) {
			listaAnimales.add(animalito);
			animalesACargo--;
		} else {
			System.out.println("Este cuidador ya no puede cuidar mas animales");
		}
	}
	
	//Sumo los alimentos en el orden correspondiente al enum 
	public void agregarAlimento (Alimento alimento1, Alimento alimento2, Alimento alimento3) {
		comidaACargo[0] = alimento1;
		comidaACargo[1] = alimento2;
		comidaACargo[2] = alimento3;
	}
	
	public Alimento[] getComidaACargo() {
		return comidaACargo;
	}
	
	//Buca al animal en la lista de animales del cuidador, si lo encuentra se fija si tiene comida suficiente para realizar el truco y devuelve eso 
	public boolean hayAlimento(String nombre, String nombreTruco) {
		
		int i=0;
		boolean encontrado = false, hayComida= false;
		Animal animalAux = null;

		
		while (i<listaAnimales.size() && encontrado == false) {
			if(listaAnimales.get(i).getNombre().equals(nombre)) {
				encontrado = true;
				animalAux = listaAnimales.get(i);
			} else {
				i++;
			}
		}
		
		if (encontrado) {
			
			switch (animalAux.getClass().getSimpleName()) {
			
			case "Orca":
				hayComida = hayComida(animalAux, nombreTruco);
				break;
			case "Delfin":
				hayComida = hayComida(animalAux, nombreTruco);
				break;
			case "LoboMarino":
				hayComida = hayComida(animalAux, nombreTruco);
				break;
			}
		}
		return hayComida;
	}
	
	//Recibe el numero q corresponde al alimento en el enum, lo busca en el array y devuelve cuanta comida queda de ese alimento
	public int devolverStock (int ordinal) {
		
		return comidaACargo[ordinal].getCantidad();
	}
	
	//1.Recibe el animal y el nombre del truco, se fija primero si coincide el nombre que se le paso con el nombre en la lista de habilidades del animal
	//2.Si coincide se fija cuanto alimento requiere ese truco y si alcanza en el stock para ejecutarlo, si alcanza lo resta del total y avisa que se pude ejecutar
	private boolean hayComida(Animal animalAux, String nombreTruco) {
		
		boolean devolver= false, encontrado = false;
		int cuenta, i=0, ordinal;
		
		
		while (i<animalAux.getHabilidades().size() && encontrado ==false) {
			if(animalAux.getHabilidades().get(i).getNombre().equals(nombreTruco)) {
				ordinal = devolverOrdinalAnimal(animalAux);
 				if(animalAux.getHabilidades().get(i).getCantidadAlimento() <= devolverStock(ordinal)) {
					cuenta = (comidaACargo[ordinal].getCantidad()) - (animalAux.getHabilidades().get(i).getCantidadAlimento());
					comidaACargo[ordinal].setCantidad(cuenta);
					devolver = true;
					encontrado = true;
				} else if(animalAux.getHabilidades().get(i).getCantidadAlimento() > devolverStock(ordinal)){
					encontrado = true;
				} else {
					devolver = false;
				}
			} else {
				i++;
			}
		}
		return devolver;
	}
	
	//Recibe un animal, se fija el nombre de la clase y dependiendo el nombre devuelve el numero en la posicion del array de comida que le toca
	public int devolverOrdinalAnimal(Animal animal) {
		int devolver = -1;
		String tipoAnimal="";
		
		tipoAnimal = animal.getClass().getSimpleName();
		
		switch(tipoAnimal) {
		
		case "Orca":
			devolver = 0;
			break;
		case "Delfin":
			devolver = 1;
			break;
		case "LoboMarino":
			devolver = 2;
			break;
		}
		return devolver;
	}
}
