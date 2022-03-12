package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {

	private Utilitarios() {
		
	}
	
	public final static UnaryOperator<String> maiuscula = 
			n -> n.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = 
			n -> n.charAt(0) + "";
// Não podemos ter método final em interface pois ele não pode ser sobrescrito	
	public static String grito (String n) {
			return n + "!!! ";
	}
	
}
