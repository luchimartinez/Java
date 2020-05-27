package ejercicio6;

public class Test {

	public static void main(String[] args) {
		
		Tienda t1 = new Tienda();
		Pedido p1 = new Pedido();
		Pedido p2 = new Pedido();
		Pedido p3 = new Pedido();
		Pedido p4 = new Pedido();
		
		Libro l1 = new Libro();
		Libro l2 = new Libro();
		Libro l3 = new Libro();
		Libro l4 = new Libro();
		
		Cliente cl1= new Cliente();
		Cliente cl2 = new Cliente();
		
		l1.setId("00");
		l1.setStock(10);

		l2.setId("01");
		l2.setStock(12);

		l3.setId("02");
		l3.setStock(15);
		
		l4.setId("03");
		l4.setStock(12);
		
		p1.setCantidad(2);
		p2.setCantidad(30);
		p3.setCantidad(8);
		p4.setCantidad(9);
		
		
		p1.setLibro(l1);
		p4.setLibro(l2);
		
		p2.setLibro(l3);
		p3.setLibro(l4);
		
		t1.agregarPendiente(p1);
		t1.agregarPendiente(p2);
		t1.agregarPendiente(p3);
		t1.agregarPendiente(p4);
		
		t1.agregarLibro(l1);
		t1.agregarLibro(l2);
		t1.agregarLibro(l3);
		t1.agregarLibro(l4);
		
  	    t1.procesarPedido();
  	   System.out.println(t1.getpCompletados().get(0).getCantidad());
	}
}
