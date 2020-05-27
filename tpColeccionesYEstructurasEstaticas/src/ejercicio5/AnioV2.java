package ejercicio5;

public class AnioV2 {

//	¿Cambiaría algo si en vez de usar un Array de Strings para los nombres de los meses
//	usáramos un enumerado?
//	Creá una nueva versión de la clase Anio llamada AnioV2 que use el enum
//	Mes (interno pero público) para enumerar a los doce meses del año, y modificá lo que
//	creas conveniente.
	
	
int[] diasDelMes;
	
	enum Meses {
		ENERO,
		FEBRERO,
		MARZO,
		ABRIL,
		MAYO,
		JUNIO,
		JULIO,
		AGOSTO,
		SEPTIEMBRE,
		OCTUBRE,
		NOVIEMBRE,
		DICIEMBRE
	}
	
	public AnioV2() {
		
		 int [] diaDelMes = new int [] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		 this.diasDelMes = diaDelMes;
	}
	
	public String getNombreDelMes(int numeroMes) {
		
		Meses mes[] = Meses.values();
	    return mes[numeroMes-1].toString();	
	}
	
	
}
