package ejercicio1;

public class Test {

	public static void main(String[] args) {
	
//		Cre� una instancia de Grupo asign�ndole el n�mero, la letra o el nombre que le
//		hayan puesto.
		
		Grupo grupo1 = new Grupo("grupo1");
		
//		Agregale los miembros reales de tu grupo de trabajos pr�cticos. Agregale uno
//		m�s, ficticio. Cada vez que agregues un integrante el programa debe mostrar el
//		mensaje �[nombreIntegrante] fue asignado al grupo [nombreGrupo]�, donde
//		[nombreIntegrante] y [nombreGrupo] son, respectivamente, los nombres del
//		nuevo integrante y del grupo.
		
		grupo1.agregarIntegrante("Sebastian");
		grupo1.agregarIntegrante("Alejandro");
		grupo1.agregarIntegrante("Lucia");
		grupo1.agregarIntegrante("Juana");
		
//		Escrib� un m�todo del programa principal que compruebe si un integrante
//		determinado fue o no agregado al grupo. Probalo tanto con uno que exista
//		como con uno que no.
		
		System.out.println(grupo1.existeIntegrante("Roberto"));
		System.out.println(grupo1.existeIntegrante("Juana"));
		
		//Mostr� todos los datos del grupo.
		
		grupo1.mostrar();
		
//		Remov� al integrante ficticio para que el grupo quede con los integrantes
//		reales. Luego de removerlo de la lista, mostr� los datos del integrante
//		removido.
		
		System.out.println(grupo1.removerIntegrante("Juana"));
		
		//Volv� a remover el mismo integrante ficticio.
		
		System.out.println(grupo1.removerIntegrante("Juana"));
		
		//Mostr� de nuevo los datos del grupo, actualizados.
		
		grupo1.mostrar();
		
		//Vaci� el grupo y volv� a mostrarlo.
		
		grupo1.vaciar();
		grupo1.mostrar();
		


	}

}
