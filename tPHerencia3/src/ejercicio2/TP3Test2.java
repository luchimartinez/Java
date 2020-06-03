package ejercicio2;

public class TP3Test2 {

	public static void main(String[] args) {
		
		/*A partir de las clases codificadas del ejercicio anterior:
		  Crear la clase Vendedor, la cual heredará de SubContratado. Deberá
		   tener un atributo float porcentaje, el método toString() y
		   calcularPago(). Cobrará de manera similar que cualquier otro
		   subcontratado, salvo que además del jornal cobrará un porcentaje
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
