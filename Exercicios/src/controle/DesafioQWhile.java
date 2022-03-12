package controle;

import java.util.Scanner;

public class DesafioQWhile {

	public static void main(String[] args) {
	/* calcular m�dia de uma turma com x alunos.
	 * usu�rio vai digitar uma nota v�lida de 0 a 10, e sempre que uma nota for adicionada,
	 * dever� ser somada a vari�vel total(deve armazenar a soma de todas as notas).
	 * em outra vari�vel contagem deve informar quantas notas v�lidas foram digitadas.
	 * no final devemos mostrar o TOTAL, QTD DE NOTAS DIGITADAS E A M�DIA.
	 * para o usu�rio sair do programa ele precisar� digitar - 1.
	 */
	
		Scanner entrada = new Scanner(System.in);

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
	
		
		while (nota != -1) {
			System.out.print("Informe a nota ou -1 p/ sair: ");
			nota = entrada.nextDouble();
		
			
		if(nota <= 10 && nota >= 0) {	
			total += nota;
			quantidadeDeNotas++;
		} else if (nota != -1) {
			System.out.println("Nota inv�lida!");
			}
		
		}
		
		//Calcular a m�dia
		
		double media = total / quantidadeDeNotas;
		System.out.println("M�dia = " + media);
		
		entrada.close();
				
	}
}
