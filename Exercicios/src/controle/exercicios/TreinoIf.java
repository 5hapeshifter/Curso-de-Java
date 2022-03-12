package controle.exercicios;

import java.util.Scanner;

public class TreinoIf {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		
		if(media <= 10 && media >= 7.0) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		}
		boolean criterioRecuperacao = media < 7 && media >= 4.5;
		if(criterioRecuperacao) {
			System.out.println("Recuperação!");
		}
		boolean criterioReprovacao = media < 4.5 && media >= 0;
		if(criterioReprovacao) {
			System.out.println("Reprovado!");
		}

		entrada.close();
	}
}
