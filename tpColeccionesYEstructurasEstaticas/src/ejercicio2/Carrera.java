package ejercicio2;

import java.util.ArrayList;

public class Carrera {

	private ArrayList<Atleta> ganador;
	private ArrayList<Atleta> participantes;
	private Especialidad tipoCarrera;
	
	
	public Carrera (Especialidad tipoCarrera) {
		
		ArrayList<Atleta> participantes = new ArrayList<Atleta>();
		this.participantes = participantes;
		this.tipoCarrera = tipoCarrera;
		
	}
	
	public Especialidad getTipoCarrera() {
		return tipoCarrera;  
	}

	public void setTipoCarrera(Especialidad tipoCarrera) {
		this.tipoCarrera = tipoCarrera;
	}
	
	public ArrayList<Atleta> getParticipantes() {
		return participantes;
	}

	public ArrayList<Atleta> getGanador() {
		return ganador;
	}

	
	
	public void agregarParticipante(Atleta atleta ) {
		
		if (atleta.getCarreraRealizada().getNombre().equals(getTipoCarrera().getNombre())) {
			this.participantes.add(atleta);
		} else {
			System.out.println("No correspondo con el tipo de carrera");
		}		
	}

	
	private ArrayList<Atleta> seleccionarGanador(ArrayList<Atleta> participantes){
		
		//esto seria como el setGanador()
		
		double tiempoMinimo;		
		tiempoMinimo = verificarTiempoMinimo(participantes);
		
		for (int i=0; i < participantes.size(); i++) {
			if (participantes.get(i).getTiempoRecorrido() == tiempoMinimo) {
				ganador.add(participantes.get(i));
			}
		}
		
		return ganador;			
	}
	
	
	private double verificarTiempoMinimo (ArrayList<Atleta> participantes) {
		double acum = 1000000000000.0;
		
		for (int i = 0; i < participantes.size(); i++) {
			if (participantes.get(i).getTiempoRecorrido() <= acum) {
				acum = participantes.get(i).getTiempoRecorrido();
			}
		}
		
		return acum;
		
	}
	
	
	public void mostrarGanadores(){
		
		ArrayList<Atleta> ganador = new ArrayList<Atleta>();
		this.ganador = ganador;
		ganador = seleccionarGanador(getParticipantes());
		
		for (int i = 0; i<ganador.size(); i++) {
			System.out.println(""+ganador.get(i).getNombre());
		}
		
	}
	
}
