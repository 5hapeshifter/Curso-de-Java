package arrays;

import java.util.Scanner;

public class DesafioArray {
	
		public static void main(String[] args) {
/* Perguntar para o usuário quantas notas ele quer informar, depois que ele informar, o
 * programa deve criar um array com a quantidade informada e ele deve inserir as notas
 * informando o índice.
 * tem que ter dois laços for, 1º laço pra captar e armazenar as notas, o segundo laço
 * tem que percorrer o array somar e apresentar a  média no final.
 */
	Scanner entrada = new Scanner(System.in);
	System.out.println("Informe quantas notas você deseja inserir.");
	
	int qtdeNotas = entrada.nextInt();
	
	double[] notas = new double [qtdeNotas];
	
	for (int notaInserida = 0; notaInserida < notas.length; notaInserida++) {
		System.out.println("Informe a nota " + (notaInserida + 1) + ": ");
		notas[notaInserida] = entrada.nextDouble();
	}

	double total = 0;
	for (double notaTotal: notas) {
		total += notaTotal;
	}
	double media = total / notas.length;
	System.out.println("A média final é " + media + "!");	
	entrada.close();
			
	}
}
