package ejercicio3;

import java.util.ArrayList;

public class Hito {

	private String fecha;
	private String descripcion;
	private ArrayList<Persona> lPersonasConHitos;
	
	public Hito (String fecha, String descripcion) {
		this.fecha = fecha;
		this.descripcion = descripcion;
		lPersonasConHitos = new ArrayList<Persona>();
	}
	
	public String getFecha() {
		return this.fecha;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	
	public String getValor() {
		return fecha +": "+ descripcion;
	}
	
	public ArrayList<Persona> getArray(){
		return lPersonasConHitos;
	}
	
	public void agregarPersona(Persona p) {
		
		int i=0;
		boolean encontrado = false;
		
		while (i<lPersonasConHitos.size()&& encontrado ==false) {
			if(p.getNombreCompleto() == lPersonasConHitos.get(i).getNombreCompleto()) {
				encontrado = true;
			}else {
				i++;
			}
		}
		
		if (!encontrado) {
			lPersonasConHitos.add(p);
		}else {
			System.out.println("Agregado previamente");
		}
	}
	
	public void mostrarPersonasConHitos() {		
		Persona p;
		for (int i=0; i<lPersonasConHitos.size();i++) {
			p = lPersonasConHitos.get(i);
			System.out.println(p.getNombreCompleto());
		}
	}
	
}
