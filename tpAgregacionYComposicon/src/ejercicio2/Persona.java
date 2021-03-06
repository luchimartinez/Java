package ejercicio2;

import java.util.ArrayList;

public class Persona {

	private String apellido;
	private String nombre;
	private ArrayList<NumeroTelefonico> lTelefonos;
	private ArrayList<Email> lEmails;
	private ArrayList<Mascota> lMascotas;
	
	
	
	public Persona (String apellido, String nombre){
		this.apellido = apellido;
		this.nombre = nombre;
		lTelefonos = new ArrayList <NumeroTelefonico> ();
		lEmails = new ArrayList <Email> ();
		lMascotas = new ArrayList<Mascota>();
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
	
	//Composici�n xq rara vez cambian de due�o las mascotas y ademas en caso de desaparecer la persona no me interesa quedarme con esos datos
	public void agregarMascota(String tipo, String nombre) {
		Mascota mas = new Mascota(nombre, tipo);
		lMascotas.add(mas);
	}
	public void mostrarTodo() {
		
		System.out.println(apellido + ", "+ nombre);
		System.out.println("Telefonos: ");
		System.out.println("Celular: "+lTelefonos.get(0).getValor());
		System.out.println("Celular: "+ lTelefonos.get(1).getValor());
		System.out.println("Fijo "+lTelefonos.get(2).getValor());
		System.out.println(lEmails.get(0).getValor());
		System.out.println("Mascotas: ");
		
		Mascota a;
		for(int i =0; i<lMascotas.size(); i++) {
			a=lMascotas.get(i);
			System.out.println(a.getValor());
		}
		
	}
	
}
