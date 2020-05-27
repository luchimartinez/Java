package ejercicio1;

public class Test {

	public static void main(String[] args) {
	
//		Creá una instancia de Grupo asignándole el número, la letra o el nombre que le
//		hayan puesto.
		
		Grupo grupo1 = new Grupo("grupo1");
		
//		Agregale los miembros reales de tu grupo de trabajos prácticos. Agregale uno
//		más, ficticio. Cada vez que agregues un integrante el programa debe mostrar el
//		mensaje “[nombreIntegrante] fue asignado al grupo [nombreGrupo]”, donde
//		[nombreIntegrante] y [nombreGrupo] son, respectivamente, los nombres del
//		nuevo integrante y del grupo.
		
		grupo1.agregarIntegrante("Sebastian");
		grupo1.agregarIntegrante("Alejandro");
		grupo1.agregarIntegrante("Lucia");
		grupo1.agregarIntegrante("Juana");
		
//		Escribí un método del programa principal que compruebe si un integrante
//		determinado fue o no agregado al grupo. Probalo tanto con uno que exista
//		como con uno que no.
		
		System.out.println(grupo1.existeIntegrante("Roberto"));
		System.out.println(grupo1.existeIntegrante("Juana"));
		
		//Mostrá todos los datos del grupo.
		
		grupo1.mostrar();
		
//		Remové al integrante ficticio para que el grupo quede con los integrantes
//		reales. Luego de removerlo de la lista, mostrá los datos del integrante
//		removido.
		
		System.out.println(grupo1.removerIntegrante("Juana"));
		
		//Volvé a remover el mismo integrante ficticio.
		
		System.out.println(grupo1.removerIntegrante("Juana"));
		
		//Mostrá de nuevo los datos del grupo, actualizados.
		
		grupo1.mostrar();
		
		//Vaciá el grupo y volvé a mostrarlo.
		
		grupo1.vaciar();
		grupo1.mostrar();
		


	}

}
