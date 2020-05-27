package ejercicio3;

import java.util.ArrayList;

public class Carrera2 {

//	Modificá el ejercicio anterior para que en vez de indicar solamente quién fue el ganador
//	obtenga cuál fue la terna ganadora. Debe tener en cuenta que puede haber atletas que
//	“empaten” en cualquiera de las tres posiciones del podio.
	
	private ArrayList<Corredor> ganador;
	private ArrayList<Corredor> participantes;
	private Deporte tipoCarrera;
	
	
	public Carrera2 (Deporte tipoCarrera) {
		
		this.tipoCarrera = tipoCarrera;
		
	}
	
	public Deporte getTipoCarrera() {
		return tipoCarrera;
	}

	public void setTipoCarrera(Deporte tipoCarrera) {
		this.tipoCarrera = tipoCarrera;
	}
	
	public ArrayList<Corredor> getParticipantes() {
		return participantes;
	}

	public ArrayList<Corredor> getGanador() {
		return ganador;
	}

	public void agregarParticipante(Corredor atleta ) {
		
		ArrayList<Corredor> participantes = new ArrayList<Corredor>();
		this.participantes = participantes;
		
		if (atleta.getCarreraRealizada().getNombre().equals(getTipoCarrera().getNombre())) {
			this.participantes.add(atleta);
		} else {
			System.out.println("No correspondo con el tipo de carrera");
		}		
	}

	
	public void seleccionarGanador(ArrayList<Corredor> participantes){		
				
		double tiempoMinimo , tiempoSegundoLugar, tiempoTercerLugar;
		
		ArrayList<Corredor> ganador = new ArrayList<Corredor>();
		ArrayList<Corredor> segundoLugar = new ArrayList<Corredor>();
		ArrayList<Corredor> tercerLugar = new ArrayList<Corredor>();
		this.ganador = ganador;
		
		tiempoMinimo = verificarTiempoMinimo(participantes);
		tiempoSegundoLugar = verificarSiguienteLugar(participantes, tiempoMinimo);
		tiempoTercerLugar = verificarSiguienteLugar(participantes, tiempoMinimo);
		
		for (int i=0; i < participantes.size(); i++) {
			if (participantes.get(i).getTiempoRecorrido() == tiempoMinimo) {
				ganador.add(participantes.get(i));
			}else if(participantes.get(i).getTiempoRecorrido() == tiempoSegundoLugar){
				segundoLugar.add(participantes.get(i));
			}else if(participantes.get(i).getTiempoRecorrido() == tiempoTercerLugar) {
				tercerLugar.add(participantes.get(i));
			}
			
		}
		if(ganador.size() == 1){
			System.out.println("El primer lugar fue para: " + ganador.get(0).getNombre());
		}else {
			System.out.print("Los ganadores del primer lugar fueron: ");
			for (Corredor corredor : ganador) {
				System.out.print(corredor.getNombre() + " ");
			}
			System.out.println();
		}
		if(segundoLugar.size() == 1){
			System.out.println("El segundo lugar fue para: " + ganador.get(0).getNombre());
		}else {
			System.out.print("Los ganadores del segundo lugar fueron: ");
			for (Corredor corredor : segundoLugar) {
				System.out.print(corredor.getNombre() + " ");
			}
			System.out.println();
		}
		if(tercerLugar.size() == 1){
			System.out.println("El tercer lugar fue para: " + ganador.get(0).getNombre());
		}else {
			System.out.print("Los ganadores del tercer lugar fueron: ");
			for (Corredor corredor : tercerLugar) {
				System.out.print(corredor.getNombre() + " ");
			}
			System.out.println();
		}
	}
	
	
	private double verificarTiempoMinimo (ArrayList<Corredor> participantes) {
		double acum = 0;
		
		for (int i = 0; i < participantes.size(); i++) {
			if (participantes.get(i).getTiempoRecorrido() >= acum) {
				acum = participantes.get(i).getTiempoRecorrido();
			}
		}
		
		return acum;
		
	}
	
	private double verificarSiguienteLugar (ArrayList<Corredor> participantes, double primerLugar) {
		
		
		double valor2;
		
		
		valor2 = participantes.get(0).getTiempoRecorrido();
		
		for (int i = 0; i < participantes.size(); i++) {
			if (participantes.get(i).getTiempoRecorrido() <= valor2 && participantes.get(i).getTiempoRecorrido() > primerLugar) {
				valor2 = participantes.get(i).getTiempoRecorrido();
			}
				
		}
		return valor2;
		}
	
	
}
