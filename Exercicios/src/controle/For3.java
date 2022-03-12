package controle;

public class For3 {

	public static void main(String[] args) {
	
	//	dessa forma, podemos usar a variável i novamente fora do for,
	//	se o i estiver dentro dos parenteses ou dentro do bloco, não podemos usar ela fora da expressão.
	// INT I = 0;
	//	for (; i < 10; i++) {
	//		System.out.println(i);
	//	System.out.println("Saiu do for...");
	//	System.out.println(i);
		
		
//		for (int i = 0; i < 10; i++) {// dessa forma o i está disponível somente dentro do laço for
//			System.out.println(i);
//		}
		
//		int i = 0;
//		System.out.println("Saiu do for...");
//		System.out.println(i);
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) { //ctrl + shift + i verifica se o comando é verdadeiro
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}		
	}
}






