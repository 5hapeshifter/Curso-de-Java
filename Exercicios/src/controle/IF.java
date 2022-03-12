package controle;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		
		if(media <= 10 && media >= 7.0) 
			 // Qualquer coisa que venha depois do IF será executado de forma condicional
		{	// devemos abrir e fechar as chaves para que as condições sejam executadas
			// como bloco de código do IF.
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");	
		}
		
		if(media < 7 && media >= 5) {
			System.out.println("Recuperação");
		}
		
		boolean criterioReprovacaoAtingido = 
				media < 5 && media >= 0; 
		if(criterioReprovacaoAtingido) {
			System.out.println("Reprovado");
		}
		
		entrada.close();
		
		
	}
}
