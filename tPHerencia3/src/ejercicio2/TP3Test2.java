package ejercicio2;

public class TP3Test2 {

	public static void main(String[] args) {
		
		/*A partir de las clases codificadas del ejercicio anterior:
		  Crear la clase Vendedor, la cual heredar� de SubContratado. Deber�
		   tener un atributo float porcentaje, el m�todo toString() y
		   calcularPago(). Cobrar� de manera similar que cualquier otro
		   subcontratado, salvo que adem�s del jornal cobrar� un porcentaje
		   extra aplicado al importe de las ventas realizadas en el mes.
		  (precioHora * cantHoras ) * 1.porcentaje
		   */
		
		
		Vendedor v1 = new Vendedor("Pedro", 25, 100, 200, 5);
		Vendedor v2 = new Vendedor ("Maria", 30, 100, 200, 10);
		
		v1.calcularPago();
		v2.calcularPago();
		
		System.out.println(v1.toString());
		System.out.println(v2.toString());

	}

}
