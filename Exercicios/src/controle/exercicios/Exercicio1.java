package controle.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
//		Segunda resposta		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número entre 0 e 10 para saber se é impar ou par: ");
		double num = entrada.nextDouble();
		
		if (num <= 10 && num >= 0) {
			if (num % 2 == 0) {
				System.out.println("Número Par");
			} else {
				System.out.println("Número ímpar");
			}
		} else {
			System.out.println("Número inválido");
		}
		
		
//		MINHA PRIMEIRA RESPOSTA	
//		if (num > 10 || num < 0) {
//			System.out.println("Número inválido!");
//		} else if (num % 2 == 0) {
//			System.out.println("número par");
//		} else	{
//			System.out.println("número ímpar");
//		}
		
		
//		RESPOSTA CERTA
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Digite um numero: ");
//		int numero = scanner.nextInt();
//
//		if (numero >= 0 && numero <= 10) {
//			if (numero % 2 == 0) {
//				System.out.println("O numero " + numero + " está entre 0 e 10 e é um par.");
//			} else {
//				System.out.println("O numero " + numero + " está entre 0 e 10 mas não é um par.");
//			}
//		} else {
//			System.out.println("O numero " + numero + " não está entre 0 e 10.");
//		}
//		scanner.close()
			
		entrada.close();
	}
}
