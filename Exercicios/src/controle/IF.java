package controle;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe a m�dia: ");
		double media = entrada.nextDouble();
		
		if(media <= 10 && media >= 7.0) 
			 // Qualquer coisa que venha depois do IF ser� executado de forma condicional
		{	// devemos abrir e fechar as chaves para que as condi��es sejam executadas
			// como bloco de c�digo do IF.
			System.out.println("Aprovado!");
			System.out.println("Parab�ns!");	
		}
		
		if(media < 7 && media >= 5) {
			System.out.println("Recupera��o");
		}
		
		boolean criterioReprovacaoAtingido = 
				media < 5 && media >= 0; 
		if(criterioReprovacaoAtingido) {
			System.out.println("Reprovado");
		}
		
		entrada.close();
		
		
	}
}
