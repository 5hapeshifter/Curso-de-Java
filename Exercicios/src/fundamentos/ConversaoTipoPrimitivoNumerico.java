package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1;//conversao implicita, apesar de termos digitado 1, ele demonstra 1.0
		System.out.println(a);

		float b = (float)1.1234567888;//conversao explicita (CAST), podemos tambem definir como float inserindo F apos o numero
		System.out.println(b);
		
		int c = 128;
		byte d = (byte)c;//Como o java nao analisa valores, mas sim tipos, ele nao faz a conversao do numero 4,
		//mesmo que pequeno de Byte para int, faz somente conversao explicita.
		System.out.println(d);
	
		double e = 1.99999;//o Java ignora as casas decimais
		int f = (int) e;
		System.out.println(f);
		
	
	}
}
