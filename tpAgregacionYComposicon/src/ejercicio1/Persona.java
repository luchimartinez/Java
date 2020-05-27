package ejercicio1;

import java.util.ArrayList;

public class Persona {

	private String apellido;
	private String nombre;
	private ArrayList<NumeroTelefonico> lTelefonos;
	private ArrayList<Email> lEmails;
	
	public Persona (String apellido, String nombre){
		this.apellido = apellido;
		this.nombre = nombre;
		lTelefonos = new ArrayList <NumeroTelefonico> ();
		lEmails = new ArrayList <Email> ();
	}
	//Composicion
	public void agregarEmail (String email){
		Email mail = new Email (email);
		lEmails.add(mail);
	}
	
	//Agregacion
	public void agregarTelefono (NumeroTelefonico numero){
		lTelefonos.add(numero);
	}
	
	
	public String getApellido() {
		return apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	public void mostrarTodo() {
	
		System.out.println(apellido + ", "+ nombre);
		System.out.println("Telefonos: ");
		System.out.println("Celular: "+lTelefonos.get(0).getValor());
		System.out.println("Celular: "+ lTelefonos.get(1).getValor());
		System.out.println("Fijo "+lTelefonos.get(2).getValor());
		System.out.println(lEmails.get(0).getValor());
		
	}
}
