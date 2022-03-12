package fundamentos.operadores;

public class Ternarios {
	
	public static void main(String[] args) {
		double media = 7.0;
		
		
		String resultadoFinal = media >= 7.0 ? "aprovado" : "em recuperação";
		/*
		 * String condicional, se for maior ou igual a 7 foi aprovado, senão vai para recuperação.
		 * 
		 */
		System.out.println("O aluno está " + resultadoFinal);
		
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		String resultado = temDesconto? "sim" : "não";
		
		System.out.println("Tem desconto? " + resultado);
		
	}
}
