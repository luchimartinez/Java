package ejercicio5;

import java.util.ArrayList;

public class Edificio {

	private ArrayList<Vivienda> departamentosHabitables;
	
	public Edificio() {
		departamentosHabitables = new ArrayList<Vivienda>();
	}
	
	public void setDepartamentosHabitables (Vivienda vivienda) {
		departamentosHabitables.add(vivienda);
	}
	
	public ArrayList<Vivienda> getDepartamentosHabitables(){
		return departamentosHabitables;
	}
	
	public void realizarMudanza(String deptoOrigen, String deptoDestino) {
		
		Vivienda viviendaDestino = buscarVivienda(deptoDestino);
		Vivienda viviendaOrigen = buscarVivienda(deptoOrigen);
		Vivienda viviendaAuxiliar = new Vivienda();
		
		
		if (viviendaDestino.getEstaVacio()) {
			//cargo la auxiliar con los datos q quiero mudar
			viviendaAuxiliar.setHabitantes(viviendaOrigen.getHabitantes());
			viviendaAuxiliar.setMueblesDelHogar(viviendaOrigen.getMueblesDelHogar());
			
			//se los paso al destino
			viviendaDestino.setHabitantes(viviendaAuxiliar.getHabitantes());
			viviendaDestino.setMueblesDelHogar(viviendaAuxiliar.getMueblesDelHogar());	
			
			//borro los datos q habia en el origen
			viviendaOrigen.vaciarDepartamento();
			
		} else {
			// como hay dos cosas q mudar creo otra variable
			Vivienda viviendaAux2 = new Vivienda();
			
			//cargo 1 con los datos del destino
			viviendaAux2.setHabitantes(viviendaDestino.getHabitantes());
			viviendaAux2.setMueblesDelHogar(viviendaDestino.getMueblesDelHogar());
			
			//cargo la otra con los datos del origen
			viviendaAuxiliar.setHabitantes(viviendaOrigen.getHabitantes());
			viviendaAuxiliar.setMueblesDelHogar(viviendaOrigen.getMueblesDelHogar());
			
			//limpio lo que hay en el destino para despues cargarlo de vuelta
			viviendaDestino.vaciarDepartamento();
			
			//le paso los nuevos datos
			viviendaDestino.setHabitantes(viviendaAuxiliar.getHabitantes());
			viviendaDestino.setMueblesDelHogar(viviendaAuxiliar.getMueblesDelHogar());
			
			//limpio lo que hay en el origen para pasarle cosas de vuelta
			viviendaOrigen.vaciarDepartamento();
			
			// le paso los nuevos datos
			viviendaOrigen.setHabitantes(viviendaAux2.getHabitantes());
			viviendaOrigen.setHabitantes(viviendaAux2.getHabitantes());	
		}
		
		
//		departamentosHabitables.add(viviendaOrigen);
//		departamentosHabitables.add(viviendaDestino);
		
		System.out.println("SE HA REALIZADO LA MUDANZA DE VIVIENDA 1 A VIVIENDA 2");
	}
	
	
	private Vivienda buscarVivienda(String pisoYDepto) {
		
		Vivienda auxVivienda = null;
		int i=0;
		boolean encontrado = false;
		
		while(i<departamentosHabitables.size() && encontrado == false) {
			if(departamentosHabitables.get(i).mandarPisoYDepto().equals(pisoYDepto)) {
				encontrado = true;
				auxVivienda = departamentosHabitables.get(i);
			} else {
				i++;
			}
		}
		//asumo que siempre encuentra el piso y departamento xq es lo basico que tenes q saber cuando te mudas a otro depto de tu mismo edificio
		//que el departamento existe en cuestion
		return auxVivienda;
	}
}
