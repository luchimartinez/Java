package ejercicio4;

import java.io.ObjectInputStream.GetField;

public class Show {

	public static void main(String[] args) {
		
//		Mundo Marino tiene distintos tipos de animales: Orcas, Lobos marinos y delfines. De todos ellos se sabe su nombre,
//		peso, tamaño (en centímetros) y las habilidades que pueden realizar en el show (cada animal puede tener varias
//		habilidades, y a su vez dos animales de la misma especie pueden tener distintas habilidades).
//		 Las orcas comen calamares
//		 Los delfines comen pulpos
//		 Los lobos marinos comen cangrejos
//		Por cada habilidad se sabe cuantos kilos de alimento se debe entregar al animal, por lo tanto de cada alimento
//		se desea saber su stock.
//		En particular, de los delfines se sabe quien es el entrenador de cada uno de ellos y quien es el cuidador
//		responsable del animal. De ambas personas se sabe el nombre, el horario de ingreso a trabajar y el horario de
//		finalización. Del entrenador además se sabe cuantos años de experiencia tiene y del cuidador se sabe de cuantos
//		animales puede hacerse responsable al mismo tiempo.
//		Cada vez que se da de alta un animal nuevo, se debe tener en cuenta si el cuidador puede hacerse cargo del
//		mismo. Caso contrario se deberá contratar a un empleado nuevo.
//		Armar la clase Show que permita seleccionar los animales para el mismo y pedirle a cada uno realizar otra
//		habilidad de la lista que contengan. Previamente a darle la orden de realizar el truco, se le debe consultar al
//		cuidador si hay cantidad suficiente del alimento que necesita el animal luego de realizarlo. Si no hubiera, el truco
//		no se puede realizar. Una vez que el truco fue hecho, el alimentador sacará de su balde la cantidad de alimento
//		solicitada.
		
		
		
      MundoMarino m1 = new MundoMarino();
	 
	  // Creo los cuidadores 
      Persona c1= new Cuidador("Ale", "1000", "2200", 2);
      Persona c2= new Cuidador("Lucia", "1000", "2200", 3);
      Persona e1=	new Entrenador("Seba", "1000", "2200",	1);
      
      //Creo la variable que voy a usar para ejecutar los trucos
      boolean busqueda;
      // Hago un downcasting de los cuidadores
     Cuidador cuidAux;
     Cuidador cuidAux2;
     cuidAux = (Cuidador) c1;
     cuidAux2 = (Cuidador) c2;
     
     //Creo loa animales
     Animal orca1 = new Orca("willy", 600, 50); 
     Animal delfin1= new Delfin("Flipper",	500, 500, e1, cuidAux);
     Animal delfin2= new Delfin("Kuni",500, 500, e1, cuidAux);
     Animal lobito1 = new LoboMarino("bubu", 5000, 100);
     
     
     Delfin delf1;
     Delfin delf2;
     Orca orc1;
     LoboMarino lobo1;
   //Hago un downcasting de los animales
     delf1 = (Delfin) delfin1;
     delf2 = (Delfin) delfin2;
     orc1 = (Orca) orca1;
     lobo1 = (LoboMarino) lobito1;
     
     //Le asigno a cada cuidador el animal correspondiente
     cuidAux.agregarAnimal(delfin1);
     cuidAux.agregarAnimal(delfin2);
     cuidAux2.agregarAnimal(lobito1);
     cuidAux2.agregarAnimal(orca1);
     
     //Creo el stock inicial de alimento
     Alimento al1 = new Alimento(60, TipoAlimento.CALAMAR);
     Alimento al3 = new Alimento(20, TipoAlimento.CANGREJO);
     Alimento al2 = new Alimento(10, TipoAlimento.PULPO);
     
     //Le agrego las habilidades a los animales
     delf1.agregarHabilidades("truco1", 4);
     delf1.agregarHabilidades("truco2", 5);
     delf1.agregarHabilidades("truco3", 2);
     
     delf2.agregarHabilidades("truco1", 4);
     delf2.agregarHabilidades("truco2", 5);
     delf2.agregarHabilidades("truco3", 2);
     delf2.agregarHabilidades("truco4", 1);
     
     orc1.agregarHabilidades("truco1", 10);
     orc1.agregarHabilidades("truco2", 5);
     orc1.agregarHabilidades("truco3", 5);
     
     lobo1.agregarHabilidades("truco1", 15);
     
     //Le asigno a cada cuidador el stock inicial de alimentos
     cuidAux.agregarAlimento(al1, al2, al3);
     cuidAux2.agregarAlimento(al1, al2, al3);
     
     System.out.println("Stock inicial");
     for (int i=0; i< cuidAux.getComidaACargo().length; i++) {
    	 System.out.println(cuidAux.getComidaACargo()[i].getTipoComida() +": " + cuidAux.getComidaACargo()[i].getCantidad()+ " kgrs");
     }
     System.out.println("-----------------------------");
     System.out.println("Comienza el show!");
     
     //Realizo el chequeo de stock y la realizacion de trucos de cada animal
     busqueda = cuidAux.hayAlimento("Flipper", "truco1");
     delf1.realizarTruco(busqueda, "truco1", "pulpo");
     busqueda = cuidAux2.hayAlimento("willy", "truco1");
     orc1.realizarTruco(busqueda, "truco1", "calamar");
     busqueda = cuidAux.hayAlimento("Flipper", "truco2");
     delf1.realizarTruco(busqueda, "truco2", "pulpo");
     busqueda = cuidAux.hayAlimento("Flipper", "truco3");
     delf1.realizarTruco(busqueda, "truco3", "pulpo");
     busqueda = cuidAux2.hayAlimento("bubu", "truco1");
     lobo1.realizarTruco(busqueda, "truco1","cangrejo");
     busqueda = cuidAux.hayAlimento("Kuni", "truco1");
     delf2.realizarTruco(busqueda, "truco1", "pulpo");
     
     System.out.println("-----------------------------");
     System.out.println("Stock final");
     for (int i=0; i< cuidAux.getComidaACargo().length; i++) {
    	 System.out.println(cuidAux.getComidaACargo()[i].getTipoComida() +": " + cuidAux.getComidaACargo()[i].getCantidad()+ " kgrs");
     }
	}
}
