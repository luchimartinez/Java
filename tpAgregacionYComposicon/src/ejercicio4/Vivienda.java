package ejercicio4;

import java.util.ArrayList;

public class Vivienda {

	private Direccion direccion;
	private ArrayList<Persona> habitantes;
	private ArrayList<Mueble> mueblesDelHogar;

	public Vivienda(Direccion direccion) {
		this.direccion = direccion;
		habitantes = new ArrayList<Persona>();
		mueblesDelHogar = new ArrayList<Mueble>();
	}
	
	public void agregarPersona(Persona p) {
		habitantes.add(p);
	}
	
	//este lo voy a hacer como agregacion aunq si es una vivienda q se alquila amueblada seria composicion
	public void agregarMueble(Mueble m) {
		mueblesDelHogar.add(m);
	}
	
	public void mostrarVivienda() {
		System.out.println("Vivienda: ");
		System.out.println(direccion.getDireccion());
		System.out.println("Personas: ");
		
		for(int i=0; i<habitantes.size();i++) {
			System.out.println(habitantes.get(i).toString());
		}
		System.out.println("Muebles: ");
		
		for(int i=0; i<mueblesDelHogar.size();i++) {
			System.out.println(mueblesDelHogar.get(i).toString());
		}
		
	}
}
