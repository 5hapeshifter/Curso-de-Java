package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos alunos? ");
		int qtdeAlunos = entrada.nextInt();

		System.out.println("Quantas notas por aluno? ");
		int qtdeNotas = entrada.nextInt();
		
		double [][] notasDaTurma = new double[qtdeAlunos] [qtdeNotas];
		
		double total = 0; 	
		for (int aluno = 0; aluno < notasDaTurma.length; aluno++) {//aluno representa cada elemento do array
			for (int notas = 0; notas < notasDaTurma[aluno].length; notas++) {//notas representa as notas dentro de cada elemento do array
				System.out.printf("informe a nota %d do aluno %d: ", notas + 1, aluno + 1);
				notasDaTurma[aluno][notas] = entrada.nextDouble();
				total += notasDaTurma[aluno][notas];
			}
		}

		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("Média da turma é " + media);
		
		for(double []notasDoAluno: notasDaTurma) {
		System.out.println(Arrays.toString(notasDoAluno));
		}
		entrada.close();
	}
}
