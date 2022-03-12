package arrays;

public class Foreach {
	//para cada elemento ele faz um la�o de repeti��o sem precisar controlar isso a partir de uma vari�vel
	//forma mais f�cil de percorrer o array
	public static void main(String[] args) {
		
		double[] notas = { 9.9, 8.7, 7.2, 9.4};
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");//o "i" quer dizer que vc tem que acessar o indice para acessar o elemento naquela posi��o
		}
		System.out.println();
		
		
		double media = 0;
		for(double nota: notas) {//nota � a nova vari�vel declarada
			System.out.print(nota + " ");
			media += nota;
			
		}
		System.out.printf("\nMedia Final %.2f", media/notas.length);
	}

}
