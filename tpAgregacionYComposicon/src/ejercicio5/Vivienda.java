package ejercicio5;

import java.util.ArrayList;

public class Vivienda {

	private Direccion direccion;
	private ArrayList<Persona> habitantes;
	private ArrayList<Mueble> mueblesDelHogar;
	private boolean estaVacio;

	public Vivienda() {
		habitantes = new ArrayList<Persona>();
		mueblesDelHogar = new ArrayList<Mueble>();
		estaVacio = true;
	}
	
	public Vivienda(Direccion direccion) {
		this.direccion = direccion;
		habitantes = new ArrayList<Persona>();
		mueblesDelHogar = new ArrayList<Mueble>();
		estaVacio = true;
	}
	
	public Direccion getDireccion() {
		return this.direccion;
	}
	
	public String mandarPisoYDepto() {
		return this.direccion.pisoYDepto();
	}
	
	public ArrayList<Persona> getHabitantes(){
		return this.habitantes;
	}
	
	public ArrayList<Mueble> getMueblesDelHogar(){
		return this.mueblesDelHogar;
	}
	
	public void setDireccion (Direccion direccion) {
		this.direccion = direccion;
	}
	
	public void setHabitantes(ArrayList<Persona> personas) {
		habitantes = personas;
	}
	
	public void setMueblesDelHogar(ArrayList<Mueble> muebles) {
		mueblesDelHogar = muebles;
	}
	
	public void agregarPersona(Persona p) {
		habitantes.add(p);
		
		if (estaVacio) {
			estaVacio = false;
		}
		
	}
	
	public boolean getEstaVacio() {
		return this.estaVacio;
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
	
	public void vaciarDepartamento() {
		
		habitantes = new ArrayList<Persona>();
		mueblesDelHogar = new ArrayList<Mueble>();
		estaVacio = true;
	}
}
