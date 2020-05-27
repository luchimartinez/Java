package ejercicio6;

public class Rubro {


	private String nombre;
	private double[] gastosPorMes;
	private static int TOTAL_MESES = 12;
	
	public Rubro() {
		
	}
	
	public Rubro(String nombre) {
		this.inicializarGastos(); 
		this.nombre = nombre;
		
	}

	private void inicializarGastos() {
		
		gastosPorMes =  new double[TOTAL_MESES];
		//this.gastosPorMes = gastosPorMes;
	}
	
	public void agregarGasto(Meses mes, double importe) {
		
		//Acumula el importe en la posición correspondiente al mes indicado.
		
		switch (mes) {
		case ENERO:
			this.gastosPorMes[0] += importe;
			break;
		case FEBRERO:
			this.gastosPorMes[1] += importe;
			break;
		case MARZO:
			this.gastosPorMes[2] += importe;
			break;
		case ABRIL:
			this.gastosPorMes[3] += importe;
			break;
		case MAYO:
			this.gastosPorMes[4] += importe;
			break;
		case JUNIO:
			this.gastosPorMes[5] += importe;
			break;
		case JULIO:
			this.gastosPorMes[6] += importe;
			break;
		case AGOSTO:
			this.gastosPorMes[7] += importe;
			break;
		case SEPTIEMBRE:
			this.gastosPorMes[8] += importe;
			break;
		case OCTUBRE:
			this.gastosPorMes[9] += importe;
			break;
		case NOVIEMBRE:
			this.gastosPorMes[10] += importe;
			break;
		case DICIEMBRE:
			this.gastosPorMes[11] += importe;
			break;
		default:
			System.out.println("Error");
			break;

		}
		
	}

	public String getNombre() {
		return nombre;
	}

	public double getTotalGastos(Meses mes) {
		
		double devolverGasto = -1;
		
		switch (mes) {
		case ENERO:
			devolverGasto = this.gastosPorMes[0]; 
			break;
		case FEBRERO:
			devolverGasto = this.gastosPorMes[1];
			break;
		case MARZO:
			devolverGasto = this.gastosPorMes[2];
			break;
		case ABRIL:
			devolverGasto = this.gastosPorMes[3];
			break;
		case MAYO:
			devolverGasto = this.gastosPorMes[4];
			break;
		case JUNIO:
			devolverGasto = this.gastosPorMes[5];
			break;
		case JULIO:
			devolverGasto =  this.gastosPorMes[6];
			break;
		case AGOSTO:
			devolverGasto = this.gastosPorMes[7];
			break;
		case SEPTIEMBRE:
			devolverGasto = this.gastosPorMes[8];
			break;
		case OCTUBRE:
			devolverGasto = this.gastosPorMes[9];
			break;
		case NOVIEMBRE:
			devolverGasto = this.gastosPorMes[10];
			break;
		case DICIEMBRE:
			devolverGasto = this.gastosPorMes[11];
			break;
		default:
			System.out.println("Error");
			break;

		}
		return devolverGasto;
	}
	
	
	public double sumaTotalGastos() {
		
		double sumaTotal = 0;
		
		for(int i=0; i<gastosPorMes.length;i++) {
			sumaTotal +=gastosPorMes[i];
		}
		
		return sumaTotal;
	}
	
	
}
