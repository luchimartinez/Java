package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
//		Una casa de electrodomésticos ofrece a sus clientes la posibilidad de comprar Televisores, Lavarropas, Heladeras
//		y Licuadoras. De todos los productos se conoce la marca, el modelo, el número de serie, el voltaje, el estado
//		(encendido/apagado) y el precio. Al mismo tiempo, de los televisores se sabe la dimensión (en pulgadas) y si es
//		Smart o no. Del lavarropas sabemos la carga máxima (en kg) y si es automático o semi automático. De la heladera
//		sabemos la capacidad (en litros) y si es no frost. Por último, de la licuadora sabemos la potencia (en watts) y la
//		cantidad de velocidades.
	
//		Crear un programa que permita cargar una lista de artículos y luego ofrecer al usuario esos productos. Solo se
//		deberá mostrar el tipo de producto, la marca y el modelo. Una vez que el usuario elija, se deberá mostrar del
//		detalle completo y solicitarle al usuario que confirme la selección. Continuar ofreciéndole artículos hasta que
//		el usuario elija la opción “0”. En ese momento se deberá imprimir el ticket completo con la infromacion de
//		todos los artículos elegidos y el importe total de la venta.
//		
		int opcion = -1;
		double cont =0;
		boolean flag = false;
		boolean aux;
		String respuesta="";
		
		Electrodomestico h1 = new Heladera("Whirlpool", "modelo", "H2745", "lalala", false, 14999, 250, true);
		Electrodomestico tv1 = new Televisor("Philips", "modelo", "49PGFS", "lalala", false, 14370, 49, true);
		Electrodomestico lav1 = new Lavarropa("Drean", "CONCEPT", "5.05", "lololo", false, 6799, 6, "semi automático");
		
		
		ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList<Electrodomestico>();
		ArrayList<Electrodomestico> listaUsuario = new ArrayList<Electrodomestico>();
		
		listaElectrodomesticos.add(h1);
		listaElectrodomesticos.add(tv1);
		listaElectrodomesticos.add(lav1);
		
		
		do {
			System.out.println("Quiere ingresar productos a la lista? 1 Para si 0 para no");
			
			//Si lo que ingreso el usuario es un int lo guarda y cambia el valor del flag
			if (input.hasNextInt()) {
				opcion = input.nextInt();
				input.nextLine();
				flag = true;
			}else {
				System.out.println("Por favor ingrese un numero");
				flag = false;
			}
			
			//Si efectivamente se ingreso un numero y ese numero es 1
			if (flag && (opcion == 1)) {
				//Traigo los datos del primer electrodomestico y los muestro
				if (listaElectrodomesticos.size()>0) {
					System.out.println(listaElectrodomesticos.get(0).getClass().getSimpleName());
					System.out.println(listaElectrodomesticos.get(0).getMarca());
					System.out.println(listaElectrodomesticos.get(0).getModelo());
					System.out.println(listaElectrodomesticos.get(0).getNroSerie());
					System.out.println("Desea agregar el producto? SI/NO");
					respuesta= input.nextLine();
					aux = validarString(respuesta);
					
					//Chequeo q lo que se ingresa sea un string son las palabras indicadas
					while(!aux) {
						System.out.println("Palabra incorrecta, por favor ingrese SI o NO");
						respuesta= input.nextLine();
						aux = validarString(respuesta);
					}
					
					respuesta.toUpperCase();
					
					if(respuesta.equals("SI")) {
						listaUsuario.add(listaElectrodomesticos.get(0));
						//Despues de agregarlo remuevo asi pasa adelante el q sigue
						listaElectrodomesticos.remove(0);
					}else {
						//Si dice que no lo quiere lo remuevo de todas formas para mostrar el siguiente
						listaElectrodomesticos.remove(0);
					}
					
				}else {
					System.out.println("No hay más productos en la lista");
					opcion = 0;
				}
			}
			
		} while(opcion !=0);
		
		//Suma el total gastado y lo muestra
		System.out.println("Usted compro:");
		for(int i=0; i<listaUsuario.size(); i++) {
			System.out.println(listaUsuario.get(i).toString());
			cont+=listaUsuario.get(i).getPrecio();
		}
		
		System.out.println("El gasto total es de: $"+cont);
		
		input.close();
	}
	
	
	public static boolean validarString (String palabra){
		
		boolean devolver;
		String var;
		
		var =palabra.toUpperCase();
		if(var.equals("SI") || var.equals("NO")) {
			devolver = true;
		} else {
			devolver = false;
		}
		
		return devolver;		
	}
	
}
