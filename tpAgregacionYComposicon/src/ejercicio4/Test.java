package ejercicio4;

public class Test {

	public static void main(String[] args) {
		
/*		Crear la clase Vivienda que tendr� una Direcci�n (compuesta por: calle, altura, piso y
		departamento) y que adem�s pueda contener personas (nombre, apellido y edad) y
		muebles (nombre, material y color). */
		
		Direccion dire1 = new Direccion("Monta�eses", "1234", "4� C");
		Persona p1 = new Persona("Arturo", "Roman", 53);
		Persona p2 = new Persona("Monica", "Gaztambide", 35);
		Mueble m1 = new Mueble("Mesa", "madera", "marr�n");
		Mueble m2 = new Mueble("Mesada", "m�rmol", "rojo");
		Mueble m3 = new Mueble("Perchero", "metal", "negro");
		Mueble m4 = new Mueble("Sill�n", "cuero", "azul");
		
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
