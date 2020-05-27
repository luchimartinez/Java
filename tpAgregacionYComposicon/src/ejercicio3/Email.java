package ejercicio3;

public class Email {

	private String cuenta;
	private String dominio;
	
	public Email(String email) {
		
		String[] arrEmail = email.split("@");
		cuenta = arrEmail[0];
		dominio = arrEmail[1];
	}
	
	public String getValor() {
		return cuenta +"@"+ dominio;
	}
	
	
}
