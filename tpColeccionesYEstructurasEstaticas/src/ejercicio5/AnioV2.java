package ejercicio5;

public class AnioV2 {

//	�Cambiar�a algo si en vez de usar un Array de Strings para los nombres de los meses
//	us�ramos un enumerado?
//	Cre� una nueva versi�n de la clase Anio llamada AnioV2 que use el enum
//	Mes (interno pero p�blico) para enumerar a los doce meses del a�o, y modific� lo que
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
