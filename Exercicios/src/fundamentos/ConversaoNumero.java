package fundamentos;

public class ConversaoNumero {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length()); //conversao direto do tipo primitivo int, para wrapper Integer, desde que chame diretamente o tipo.		
		
		System.out.println(("" + num1).length()); //conversao de numero para string concatenando com string vazia
		System.out.println(("" + num2).length()); //conversao de numero para string concatenando com string vazia
		
	}
}
