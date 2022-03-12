package arrays;

import java.util.Arrays;

public class ExercicioForeach {
//Refatorar por foreach
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double [4];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);//forma de pegar um elemento específico
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);//forma de pegar o último elemento
		//System.out.println(notasAlunoA[4]); ERRO
		
		double totalAlunoA = 0;//Para alterar o nome da variável em todos lugares, clicar com botão direito e ir em Refactor/Rename
		for(double totalNotasA: notasAlunoA) {// no comando .length estamos dizendo para o Java considerar todas as casas do Array
			totalAlunoA += totalNotasA;
		}
		System.out.println("Média Final A "+ totalAlunoA / notasAlunoA.length);
		
		double notaArmazenada = 5.9;
		double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };// forma de array em valores literais
		
		double totalAlunoB = 0;
		for (double totalNotasB : notasAlunoB) {
			totalAlunoB += totalNotasB;
			
		}
		System.out.println("Média Final B "+ totalAlunoB / notasAlunoB.length);
	}
}
