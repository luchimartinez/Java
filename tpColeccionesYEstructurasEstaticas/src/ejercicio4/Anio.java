package ejercicio4;

public class Anio {

//	Cre� la clase Anio, que tendr� un arreglo de Strings que contenga los nombres de
//	cada uno de los doce meses del a�o, y otro que contenga la cantidad de d�as de cada
//	uno (ignor� los a�os bisiestos) con los siguientes m�todos:
//	 public String getNombreDelMes(int numeroMes)
//	Recibe el n�mero de mes (entre 1 y 12) y devuelve el nombre del mes en
//	cuesti�n.
//	 public int diasTranscurridos(int numeroMes)
//	Recibe el n�mero de mes y devuelve la cantidad de d�as transcurridos en el
//	a�o antes de comenzar el mes en cuesti�n.
//	En el programa principal mostr� cu�ntos d�as transcurrieron desde el comienzo del a�o
//	y qu� d�a del a�o es el d�a de cumplea�os de cada integrante del grupo.
//	Para discutir en clase o a trav�s del Aula Virtual: Si el m�todo diasTranscurridos(..) es
//	usado una y otra vez, �hay alguna manera que evitar que el c�lculo de los d�as
//	transcurridos se haga permanentemente? Si la hay, modific� la clase para mejorar su
//	performance.
	
	String[] meses;
	int[] diasDelMes;
	
	public Anio() {
		
	 String[] meses = new String []{"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	 int [] diaDelMes = new int [] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	 this.meses = meses;
	 this.diasDelMes = diaDelMes;
	
		
	}
	
	public String getNombreDelMes(int numeroMes) {
			
		return meses[numeroMes-1];
		
	}
	
	public int diasTranscurridos(int numeroMes) {
		
		int acum = 0;
		
		for(int i=0; i<numeroMes-1; i++) {
			acum = acum+diasDelMes[i];
		}
		
		return acum;
	}
	
	public void calcularCumpleanio(int numeroMes, int numeroDia) {
        int dias = this.diasTranscurridos(numeroMes) + numeroDia;

        System.out.println("pasaran " + dias +" hasta tu cumpleanios");
    }
	
}
