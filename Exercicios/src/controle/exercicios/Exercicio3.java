package controle.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a 1� nota do aluno: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Informe a 2� nota do aluno: ");
		double nota2 = entrada.nextDouble();

		double notaFinal = (nota1 + nota2) / 2;
		
		//double media = (nota1 + nota2) / 2;

		//RESPOSTA DO PROFESSOR
		//if (media <= 10 && media >=7) {
//			System.out.println("Sua m�dia foi " + media + ", e voc� est� aprovado");
		//} else if (media < 7 && media >= 4) {
//			System.out.println("Sua m�dia foi " + media + ", e voc� est� de recupera��o");
		//} else if (media < 4 && media >=0) {
//			System.out.println("Sua m�dia foi " + media + ", e voc� est� reprovado");
		//} else {
//			System.out.println("Nota inv�lida!");
		//}

		
//		PRIMEIRA TENTATIVA		
		if (nota1 <=10.0 && nota1 >= 0.0) {
			System.out.println(notaFinal);
			
			if (nota2 >10.0 || nota2 < 0.0) {
				System.out.println("Nota inv�lida");			
			} else if (notaFinal <= 10 && notaFinal >= 7) {
				System.out.println("Sua m�dia � " + notaFinal + " Aprovado");
			} else if (notaFinal < 7 && notaFinal >=4) {
				System.out.println("Sua m�dia � " + notaFinal + " Recupera��o");
			} else {
				System.out.println("Sua m�dia � " + notaFinal + " Reprovado");
			}
		} else {
			System.out.println("Nota inv�lida");
		}
		entrada.close();
	}
}
