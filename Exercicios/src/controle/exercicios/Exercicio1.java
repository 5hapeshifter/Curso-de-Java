package controle.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
//		Segunda resposta		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero entre 0 e 10 para saber se � impar ou par: ");
		double num = entrada.nextDouble();
		
		if (num <= 10 && num >= 0) {
			if (num % 2 == 0) {
				System.out.println("N�mero Par");
			} else {
				System.out.println("N�mero �mpar");
			}
		} else {
			System.out.println("N�mero inv�lido");
		}
		
		
//		MINHA PRIMEIRA RESPOSTA	
//		if (num > 10 || num < 0) {
//			System.out.println("N�mero inv�lido!");
//		} else if (num % 2 == 0) {
//			System.out.println("n�mero par");
//		} else	{
//			System.out.println("n�mero �mpar");
//		}
		
		
//		RESPOSTA CERTA
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Digite um numero: ");
//		int numero = scanner.nextInt();
//
//		if (numero >= 0 && numero <= 10) {
//			if (numero % 2 == 0) {
//				System.out.println("O numero " + numero + " est� entre 0 e 10 e � um par.");
//			} else {
//				System.out.println("O numero " + numero + " est� entre 0 e 10 mas n�o � um par.");
//			}
//		} else {
//			System.out.println("O numero " + numero + " n�o est� entre 0 e 10.");
//		}
//		scanner.close()
			
		entrada.close();
	}
}
