package ejercicio1;

public class Test {

	public static void main(String[] args) {
	
/*		Crear la clase NumeroTelefonico , la cual tiene como atributos numéricos característica ,
		numeroDeAbonado y codigoDePais , además un atributo de tipo TIpoDeLinea que indicará el
		tipo de línea (CELULAR, FIJO, FAX). Generar los constructores por defecto y parametrizado
		y los setters y getters que creas necesarios. Tiene también un método llamado getValor()
		que devolverá un String en formato “(+PPP) CCCC-AAAA”, donde +PPP es un signo más (+)
		seguido por el código del país.
		Crear también la clase EMail cuyo constructor deberá recibir un único String con el formato
		“cuenta@dominio.del.mail”. Para llenar los atributos cuenta y dominio , ambos de tipo String,
		se deberá usar el método split(separador) de la clase String, usando la arroba (”@”) como
		separador. El método getValor() devolverá el String con la “reconstrucción” de la dirección,
		utilizando ambos atributos más la arroba.
		Por último, crear la clase Persona (su constructor recibe apellido y nombre ) podrá contener
		de 0 a N teléfonos y de 0 a N emails. Su método mostrarTodo() debe mostrar por pantalla el
		contenido completo de la persona.   */
		
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
		
		p1.mostrarTodo();

	}

}
