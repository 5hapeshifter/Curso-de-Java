package controle;

import java.util.Scanner;

public class DesafioQWhile {

	public static void main(String[] args) {
	/* calcular média de uma turma com x alunos.
	 * usuário vai digitar uma nota válida de 0 a 10, e sempre que uma nota for adicionada,
	 * deverá ser somada a variável total(deve armazenar a soma de todas as notas).
	 * em outra variável contagem deve informar quantas notas válidas foram digitadas.
	 * no final devemos mostrar o TOTAL, QTD DE NOTAS DIGITADAS E A MÉDIA.
	 * para o usuário sair do programa ele precisará digitar - 1.
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
			System.out.println("Nota inválida!");
			}
		
		}
		
		//Calcular a média
		
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);
		
		entrada.close();
				
	}
}
