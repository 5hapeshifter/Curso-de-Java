package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {

	private Utilitarios() {
		
	}
	
	public final static UnaryOperator<String> maiuscula = 
			n -> n.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = 
			n -> n.charAt(0) + "";
// N�o podemos ter m�todo final em interface pois ele n�o pode ser sobrescrito	
	public static String grito (String n) {
			return n + "!!! ";
	}
	
}
