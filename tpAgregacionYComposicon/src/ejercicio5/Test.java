package ejercicio5;

public class Test {

	public static void main(String[] args) {
		
/*		Reutilizando la clase Vivienda del ejercicio anterior, crear la clase Edificio que contenga
		una colección de viviendas. A través del método realizarMudanza() , que recibirá el piso y
		departamento de origen, y el piso y departamento de destino, se deberá trasladar personas
		y muebles de una vivienda a la otra. Determinar en qué casos corresponde utilizar
		composición y en cuales corresponde utilizar agregación. Finalmente, el método
		mostrarTodo() mostrará por pantalla el detalle completo de todas sus viviendas. */
		
		Direccion dire1 = new Direccion("Montañeses", "1234", "4° C");
		Persona p1 = new Persona("Arturo", "Roman", 53);
		Persona p2 = new Persona("Monica", "Gaztambide", 35);
		Mueble m1 = new Mueble("Mesa", "madera", "marrón");
		Mueble m2 = new Mueble("Mesada", "mármol", "rojo");
		Mueble m3 = new Mueble("Perchero", "metal", "negro");
		Mueble m4 = new Mueble("Sillón", "cuero", "azul");
		
		Direccion dire2 = new Direccion("Montañeses", "1234", "5° B");
		Persona p3 = new Persona("Lucero", "Sonico", 25);
		Persona p4 = new Persona("Cometin", "Sonico", 17);
		Mueble m5 = new Mueble("Mesa", "madera", "violeta");
		Mueble m6 = new Mueble("Lampara", "lava", "rojo");
		
		
		
		Edificio edi1 = new Edificio();
		Vivienda viv1 = new Vivienda(dire1);
		Vivienda viv2 = new Vivienda(dire2);

		
		viv1.agregarPersona(p1);
		viv1.agregarPersona(p2);
		viv1.agregarMueble(m1);
		viv1.agregarMueble(m2);
		viv1.agregarMueble(m3);
		viv1.agregarMueble(m4);
		
		viv2.agregarPersona(p3);
		viv2.agregarPersona(p4);
		viv2.agregarMueble(m5);
		viv2.agregarMueble(m6);
		edi1.setDepartamentosHabitables(viv1);
		edi1.setDepartamentosHabitables(viv2);
		viv1.mostrarVivienda();
		viv2.mostrarVivienda();
		
		edi1.realizarMudanza("4° C", "5° B");
		
		viv1.mostrarVivienda();
		viv2.mostrarVivienda();
		
		System.out.println(viv1.getHabitantes().size());
		System.out.println(viv2.getHabitantes().size());
		System.out.println(edi1.getDepartamentosHabitables().size());
	}

}
