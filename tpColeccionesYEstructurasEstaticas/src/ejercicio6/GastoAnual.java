package ejercicio6;

import java.util.ArrayList;

public class GastoAnual {

//	La clase GastosAnuales permite guardar los datos de los gastos comunes del año
//	separados por rubro y mes. Para eso tiene una colección de rubros, donde cada Rubro
//	tiene un nombre y guarda el importe de los gastos de cada uno de los meses del año.
//	
	private ArrayList<Rubro> rubros;

	public GastoAnual() {
	
		rubros = new ArrayList<Rubro>();
	}
	
	public void agregarGasto(Meses mes, String nombreRubro, double importe) {
		
//		Agrega el importe gastado al rubro que corresponda y en el mes indicado. Si el
//		rubro no se encuentra registrado en la colección se lo agregará, y cuando ya
//		exista se acumulará en este el valor del gasto. Pero debe controlarse que el
//		importe ingresado sea mayor que cero.
		
		
		Rubro elRubro = obtenerRubro(nombreRubro);
		
			 if(importe > 0) {
				elRubro.agregarGasto(mes, importe);
			 }
		
	}
		private Rubro buscarRubro(String nombreRubro) {
			
			int i = 0;
			Rubro elRubro = null;
			
			while(i<rubros.size() && elRubro == null) {
				if (rubros.get(i).getNombre().equals(nombreRubro)) {
					elRubro = rubros.get(i);
					
				} else {
					i++;
				}
			}
			return elRubro;
		}
		
		private Rubro obtenerRubro(String nombreRubro) {
			
			Rubro elRubro = buscarRubro(nombreRubro);
			
			if (elRubro == null) {
				Rubro nuevoRubro = new Rubro(nombreRubro);
				return nuevoRubro;	
			}
			return elRubro;		
		}
	
		
		private double[][] consolidadoDeGastos(){
//			
//			Genera un arreglo bidimensional consolidando en una sola estructura todos los
//			gastos del año. La matriz debe medir 12 (la cantidad de meses del año) por la 
//			cantidad de Rubros existentes, y cada celda debe contener el importe
//     		acumulado para el rubro en ese mes.			
			
			int nroFilas; 
			int nroColumnas;
		
			nroFilas = rubros.size();
			nroColumnas = 12;  //tiene q ser meses si o si asi puedo acceder despues el metodo getTotalGastos
			double [][] matrizGastos = new double [nroFilas][nroColumnas];
			
			for(int i=0; i<nroFilas; i++) {
				for(int j=0; j<nroColumnas; j++) {
//					gastoAcumulado(rubros.get(j).getNombre());
					matrizGastos[i][j] = rubros.get(i).getTotalGastos(convertirAMes(j));
				}
			}
			
			return matrizGastos;
		}
		
		
			public Meses convertirAMes (int mes) {
				
				Meses devolverMes = Meses.ABRIL;
				
				switch(mes) {
				
				case 0:
					devolverMes = Meses.ENERO;
					break;
				case 1:
					devolverMes = Meses.FEBRERO;
					break;
				case 2:
					devolverMes = Meses.MARZO;
					break;
				case 3:
					devolverMes = Meses.ABRIL;
					break;
				case 4:
					devolverMes = Meses.MAYO;
					break;
				case 5:
					devolverMes = Meses.JUNIO;
					break;
				case 6:
					devolverMes = Meses.JULIO;
					break;
				case 7:
					devolverMes = Meses.AGOSTO;
					break;
				case 8:
					devolverMes = Meses.SEPTIEMBRE;
					break;
				case 9:
					devolverMes = Meses.OCTUBRE;
					break;
				case 10:
					devolverMes = Meses.NOVIEMBRE;
					break;
				case 11:
					devolverMes = Meses.DICIEMBRE;
					break;	
				}
				
				return devolverMes;
				
			}
			
	
		
		
		public double gastoAcumulado(Meses mes) {
			
			//Devuelve el importe del gasto acumulado en el mes indicado.
			
			Rubro gastoAcumulado = new Rubro();
			
			return gastoAcumulado.getTotalGastos(mes);
			
		}
		
		
		public double gastoAcumulado(String nombreRubro) {
			
//			Devuelve el importe del gasto acumulado en el rubro indicado. Si el rubro no
//			existe deberá devolver -1.
			
			Rubro elRubro;
		
			elRubro = obtenerRubro(nombreRubro);
			
			if (elRubro == null) {
				return -1;
			} else {
				 return elRubro.sumaTotalGastos();
			}			
		}
		
		
		public String getNombreDelMes(int numeroMes) {
			
			Meses mes[] = Meses.values();
		    return mes[numeroMes-1].toString();	
		}
		
		public void informarConsumosPorMes() {
			
//			Muestra los consumos por mes (discriminado por cada rubro de gasto y
//			acumulado)
			
			//recorrer e imprimir matriz
			
			double [][] matrizGastos = consolidadoDeGastos();
		
			for (int i=0; i<matrizGastos[0].length; i++) {
				System.out.print(convertirAMes(i)+ "");
	        for (int k=0; k< matrizGastos.length; k++) {
	        	 System.out.println("[" + matrizGastos[k][i] + "]");
	        	
	        }
			}	
		}
		
		
		public void informarPromedioMensualPorRubro() {
			
			//Muestra los consumos promedio por mes en cada rubro.
			
			double acum =0, prom = 0, cont =0;
			double [][] matrizGastos = consolidadoDeGastos();
			
			for (int i =0; i<matrizGastos.length;i++) {
				for(int j =0; j<matrizGastos[0].length;j++) {
					acum += matrizGastos[i][j];
					cont++;
				}
				prom = acum / cont;
				System.out.println("Promedio de rubro "+ (i+1)+ prom);
			}
		}
		
		public void informarMesMayorConsumo() {
			
//			Calcula y muestra nombre e importe acumulado del mes con mayor consumo
//			total (puede ser uno o más de uno).
			
			double [] totalPorMes = calcularTotalPorMes();
			double mayorNumero = 0, num = 0;
			ArrayList<Meses> mayorConsumo = new ArrayList<Meses>();
			int i=0;
			boolean noEsIgual = true;
			
			ordenarArray(totalPorMes);
			mayorNumero = totalPorMes[0];
			
			while (i<totalPorMes.length && noEsIgual == false) {
				num = totalPorMes[i];
				if (num == mayorNumero) {
					mayorConsumo.add(convertirAMes(i));
					i++;
				} else {
					noEsIgual =true;
				}
			}
			System.out.println("El consumo mayor fue de : " + totalPorMes[0]+ " en el/los meses de: "+ mayorConsumo.toString() );	
		}
		
		private double[] calcularTotalPorMes() {
			
			double[] totalPorMes = new double[12];
			double [][] matrizGastos = consolidadoDeGastos();
			double acum = 0;
			
			for(int i=0; i<matrizGastos[0].length; i++) {
				for(int j=0; j<matrizGastos.length; j++) {
					acum += matrizGastos[i][j];
				}
				totalPorMes[i] = acum;
			}
			
			return totalPorMes;			
		}
		
		private void ordenarArray(double[] array) {
			
			double aux;
			
			for(int j=0; j<array.length-1; j++) {
				for(int i=0; i<array.length-1; i++) {
					if(array[i]< array[i+1]) {
						aux = array[i];
						array[i] = array[i+1];
						array[i+1] = aux;
					}
				}
			}
			
		}
	
}
