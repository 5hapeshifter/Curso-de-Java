package fundamentos;

public class Wrappers {

	/*Wrapper sao as versoes dos tipos primitivos voltadas a objetos conforme abaixo
	 * Primitivo - Wrapper
	 * byte - Byte
	 * short - Short
	 * int - Integer *
	 * long - Long
	 * float - Float
	 * double - Double
	 * boolean - Boolean
	 * char - Character *
	 */ 
	
	public static void main(String[] args) {

		// byte
		Byte b = 100;
		Short s = 1000;

		// Integer.parseInt(entrada.next());
		Integer i = 10000;// conversao para int primitivo
		Long l = 100000L;// para converter esse tipo para primitivo basta trocar o L maisculo por
							// minusculo.

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l/3);// para converter para num com ponto flutuante trocar o 3 por 3.0 (add x.0) 

		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		
		Boolean bo = Boolean.parseBoolean("true");// conversao de String para valor booleano com comando parse
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());// conversao de booleano para String com comando toString no Println
		
		Character c = '#'; // char
		System.out.println(c.toString());
		
		
	}
}
