package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	/*
	 * Desafio usar o Scanner com next ou next line, criar 3 strings (Converter para numero)
	 * que podem receber 3 salario do funcionario, e calcular a media do funcionario.
	 * Diferenca entre next e nextline eh que o next pega o primeiro conjunto seja de palavra ou numero,
	 * ja o next line pega a linha toda. 
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);//entrada eh o nome atribuido ao Scanner
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		
				
		System.out.println("Digite seu antepenultimo salario: ");
		String Sal1 = entrada.nextLine().replace(",",".");// devemos sempre substituir o preenchimento
		//de separador dos sentavos de , por ., pois o Java tem o padrao americano de escrita.
		
		System.out.println("Digite seu penultimo salario: ");
		String Sal2 = entrada.next().replace(",",".");
				
		System.out.println("Digite seu ultimo salario: ");
		String Sal3 = entrada.next().replace(",",".");
		
		double Salario1 = Double.parseDouble(Sal1);
		double Salario2 = Double.parseDouble(Sal2);
		double Salario3 = Double.parseDouble(Sal3);
		
		
		System.out.println("Funcionario: " + nome);
	    //Poderiamos ter usado a formula double media = (Sal1+Sal2+Sal3)/3; e um printoutLN com media.
		System.out.println("Media Salarial: " + (Salario1+Salario2+Salario3)/3);
						
								
		entrada.close();
		
		
	}
}
