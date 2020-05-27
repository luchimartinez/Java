package ejercicio6;

import java.util.ArrayList;

public class Tienda {

	private ArrayList<Pedido> pPendientes;
	private ArrayList<Pedido> pCompletados;
	private ArrayList<Libro> ejemplares;
	
	
	public Tienda(){
    	pPendientes = new ArrayList<Pedido>();
    	pCompletados = new ArrayList<Pedido>();
    	ejemplares = new ArrayList<Libro>();
    }
      
    public ArrayList<Pedido> getpPendientes() {
		return pPendientes;
	}

	public void agregarPendiente(Pedido pedido) {
		pPendientes.add(pedido);
	}

	public ArrayList<Pedido> getpCompletados() {
		return pCompletados;
	}

	public void setpCompletados(ArrayList<Pedido> pCompletados) {
		this.pCompletados = pCompletados;
	}

	public ArrayList<Libro> getLibros() {
		return ejemplares;
	}

	public void agregarLibro(Libro libro) {
		ejemplares.add(libro);
	}
	
	public void procesarPedido (){
		
    	for (int i=0; i<pPendientes.size(); i++){
    		
    	   if(buscarLibro(pPendientes.get(i).getLibro().getId(), pPendientes.get(i).getCantidad())){
    		  int cuenta = (pPendientes.get(i).getLibro().getStock()) - (pPendientes.get(i).getCantidad());
    		  pPendientes.get(i).getLibro().setStock(cuenta);
    		   pCompletados.add(pPendientes.get(i));
    		   pPendientes.remove(i);
    		   i--;
    	   }
    	}	
	}
		
	private boolean buscarLibro (String id, int cant){
		
		int i=0;
		Libro aux=null;
		boolean encontrado= false;
		 while (i<ejemplares.size() && encontrado==false) {
			if( ejemplares.get(i).getId() .equals(id)){
				encontrado=true;
				aux=ejemplares.get(i);
			}
			  i++;
			}
		 if(encontrado){
			 if(aux.getStock()<cant){
				 encontrado = false;
			  }
		 }	 
		 return encontrado;
	}
}
