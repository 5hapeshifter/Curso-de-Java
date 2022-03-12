package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		/*
		 * Estruturas:
		 * if (...express�o) senten�a; ou {}
		 * while (...express�o) senten�a; ou {}
		 * for (...;...;...;express�o) senten�a; ou {}
		 * do senten�a; ou {} while (...express�o); �nica estrutura que termina em ;,
		 * as demais tem ; associado a senten�a de c�digo.
		 */
		
		Scanner entrada = new Scanner(System.in);// ctrl + shift + O (�) pra buscar java.util.scanner
		
		String texto = "";
		// a diferen�a entre o doWhile e while � que o do while vai ser executado pelo menos uma vez,
		//enquanto o while pode nem ser executado se a primeira tentativa j� encerrar o c�digo.
		do {
			System.out.println("Voc� precisa falar as palavras m�gicas. ");
			System.out.println("Quer sair? ");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado");
		
		entrada.close();
		
	
		
	}
}
