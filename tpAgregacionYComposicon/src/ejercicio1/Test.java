package ejercicio1;

public class Test {

	public static void main(String[] args) {
	
/*		Crear la clase NumeroTelefonico , la cual tiene como atributos num�ricos caracter�stica ,
		numeroDeAbonado y codigoDePais , adem�s un atributo de tipo TIpoDeLinea que indicar� el
		tipo de l�nea (CELULAR, FIJO, FAX). Generar los constructores por defecto y parametrizado
		y los setters y getters que creas necesarios. Tiene tambi�n un m�todo llamado getValor()
		que devolver� un String en formato �(+PPP) CCCC-AAAA�, donde +PPP es un signo m�s (+)
		seguido por el c�digo del pa�s.
		Crear tambi�n la clase EMail cuyo constructor deber� recibir un �nico String con el formato
		�cuenta@dominio.del.mail�. Para llenar los atributos cuenta y dominio , ambos de tipo String,
		se deber� usar el m�todo split(separador) de la clase String, usando la arroba (�@�) como
		separador. El m�todo getValor() devolver� el String con la �reconstrucci�n� de la direcci�n,
		utilizando ambos atributos m�s la arroba.
		Por �ltimo, crear la clase Persona (su constructor recibe apellido y nombre ) podr� contener
		de 0 a N tel�fonos y de 0 a N emails. Su m�todo mostrarTodo() debe mostrar por pantalla el
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
