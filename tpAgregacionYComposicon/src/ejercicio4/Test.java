package ejercicio4;

public class Test {

	public static void main(String[] args) {
		
/*		Crear la clase Vivienda que tendrá una Dirección (compuesta por: calle, altura, piso y
		departamento) y que además pueda contener personas (nombre, apellido y edad) y
		muebles (nombre, material y color). */
		
		Direccion dire1 = new Direccion("Montañeses", "1234", "4° C");
		Persona p1 = new Persona("Arturo", "Roman", 53);
		Persona p2 = new Persona("Monica", "Gaztambide", 35);
		Mueble m1 = new Mueble("Mesa", "madera", "marrón");
		Mueble m2 = new Mueble("Mesada", "mármol", "rojo");
		Mueble m3 = new Mueble("Perchero", "metal", "negro");
		Mueble m4 = new Mueble("Sillón", "cuero", "azul");
		
		Vivienda viv1 = new Vivienda(dire1);
		
		viv1.agregarPersona(p1);
		viv1.agregarPersona(p2);
		viv1.agregarMueble(m1);
		viv1.agregarMueble(m2);
		viv1.agregarMueble(m3);
		viv1.agregarMueble(m4);
		
		viv1.mostrarVivienda();

	}

}
