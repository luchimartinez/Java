package ejercicio1;

public class Tp3Test1 {

	public static void main(String[] args) {
		
		/*
		 Sup�ngase que una empresa tiene dos tipos de empleados:
		 Asalariado: cobra un importe fijo por mes.
		 Subcontratado: quien cobra por horas.
		 Hacer una funci�n llamada calcularPago(), la cual deber� calcular el
		 importe que hay que pagar cada mes a cada empleado, dependiendo de
		 su tipo.
		 Se puede pensar en una jerarqu�a de empleados.
		 Los principios de esta jerarqu�a son los siguientes:
		 Todos son Empleados.
		 Los Asalariados cobran por mes.
		 Los Subcontratados cobran por hora trabajada.
		 * */
		
		
		Asalariado a = new Asalariado("Jose", 30, 10000);
		SubContratado s = new SubContratado("Carlos", 23, 50, 100);
		
		System.out.println(a.calcularSueldo());
		System.out.println(s.calcularPago());
		
		System.out.println(a.toString());
		System.out.println(s.toString());
		
	
		

	}

}
