package ejercicio2;

public class Test {

	public static void main(String[] args) {
		
/*		Reutilizando las clases del ejercicio anterior, extender la clase Persona para que pueda
		tener de 0 a N Mascotas (contiene el nombre y el tipo de animal, ambos String). Debe tener
		los métodos necesarios para agregar nuevos datos o eliminar cada uno de los existentes
		(menos los datos de la persona). Determinar si corresponde utilizar composición y
		agregación.  */
		
		Persona p1 = new Persona("Messi", "Leonel");
		NumeroTelefonico cel1 = new NumeroTelefonico();
		NumeroTelefonico cel2 = new NumeroTelefonico();
		NumeroTelefonico fijo = new NumeroTelefonico();
		
		cel1.setCodigoPais(549);
		cel1.setCaracteristica(114111);
		cel1.setNroAbonado(2222);
		
		cel2.setCodigoPais(68);
		cel2.setCaracteristica(032444);
		cel2.setNroAbonado(5678);
		
		fijo.setCodigoPais(54);
		fijo.setCaracteristica(4411);
		fijo.setNroAbonado(5472);
		
		p1.agregarTelefono(cel1);
		p1.agregarTelefono(cel2);
		p1.agregarTelefono(fijo);
		
		p1.agregarEmail("email: lio@messi.com");
		p1.agregarMascota("Perro", "Pluto");
		p1.agregarMascota("Gato", "Felix");
		p1.agregarMascota("Canario", "Piolin");
		
		p1.mostrarTodo();

	}

}
