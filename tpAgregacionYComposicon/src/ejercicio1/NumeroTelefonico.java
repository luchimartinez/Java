package ejercicio1;

public class NumeroTelefonico {

	private TipoDeLinea tipo;
	private int codigoPais;
	private int caracteristica;
	private int nroAbonado;
	
	public NumeroTelefonico () {
		codigoPais = 0;
		caracteristica= 0;
		nroAbonado= 0 ;
	}
	
	public TipoDeLinea getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeLinea tipo) {
		this.tipo = tipo;
	}

	public int getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(int codigoPais) {
		this.codigoPais = codigoPais;
	}

	public int getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(int caracteristica) {
		this.caracteristica = caracteristica;
	}

	public int getNroAbonado() {
		return nroAbonado;
	}

	public void setNroAbonado(int nroAbonado) {
		this.nroAbonado = nroAbonado;
	}
	
	public String getValor () {
		return "(+" +codigoPais+") "+caracteristica+ "-"  + nroAbonado;
	}
	
	
}
