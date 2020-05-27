package ejercicio3;

public class Test {

	public static void main(String[] args) {
		
/*		Reutilizando las clases del ejercicio anterior, agregar la clase Hito (con fecha, descripción,
		personas involucradas) para poder agregar momentos importantes en la vida de la persona
		(puede tener 0 a N). Un mismo hito puede ser utilizado para más de una persona.  */
		
		Persona p1 = new Persona("Messi", "Leonel");
		Persona p2 = new Persona ("Maradona", "Diego");
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
		
		Hito h1 = new Hito("02/02/2019", "Copa del mundo");
		
		p1.agregarHito(h1);
		p2.agregarHito(h1);
		h1.agregarPersona(p1);
		h1.agregarPersona(p2);
	
		p1.mostrarTodo();
		
		System.out.println("---------");
		
		h1.mostrarPersonasConHitos();

	}
}
