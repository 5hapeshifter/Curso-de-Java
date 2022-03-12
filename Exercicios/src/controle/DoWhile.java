package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		/*
		 * Estruturas:
		 * if (...expressão) sentença; ou {}
		 * while (...expressão) sentença; ou {}
		 * for (...;...;...;expressão) sentença; ou {}
		 * do sentença; ou {} while (...expressão); única estrutura que termina em ;,
		 * as demais tem ; associado a sentença de código.
		 */
		
		Scanner entrada = new Scanner(System.in);// ctrl + shift + O (ó) pra buscar java.util.scanner
		
		String texto = "";
		// a diferença entre o doWhile e while é que o do while vai ser executado pelo menos uma vez,
		//enquanto o while pode nem ser executado se a primeira tentativa já encerrar o código.
		do {
			System.out.println("Você precisa falar as palavras mágicas. ");
			System.out.println("Quer sair? ");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado");
		
		entrada.close();
		
	
		
	}
}
