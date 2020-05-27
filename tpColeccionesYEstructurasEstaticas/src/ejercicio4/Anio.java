package ejercicio4;

public class Anio {

//	Creá la clase Anio, que tendrá un arreglo de Strings que contenga los nombres de
//	cada uno de los doce meses del año, y otro que contenga la cantidad de días de cada
//	uno (ignorá los años bisiestos) con los siguientes métodos:
//	 public String getNombreDelMes(int numeroMes)
//	Recibe el número de mes (entre 1 y 12) y devuelve el nombre del mes en
//	cuestión.
//	 public int diasTranscurridos(int numeroMes)
//	Recibe el número de mes y devuelve la cantidad de días transcurridos en el
//	año antes de comenzar el mes en cuestión.
//	En el programa principal mostrá cuántos días transcurrieron desde el comienzo del año
//	y qué día del año es el día de cumpleaños de cada integrante del grupo.
//	Para discutir en clase o a través del Aula Virtual: Si el método diasTranscurridos(..) es
//	usado una y otra vez, ¿hay alguna manera que evitar que el cálculo de los días
//	transcurridos se haga permanentemente? Si la hay, modificá la clase para mejorar su
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
