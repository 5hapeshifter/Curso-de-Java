package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
//		String valor = "";
//		//o sinal de exclama��o antes do valor representa uma nega��o ou diferente de "sair", ou seja, enquanto o usu�rio
//		//n�o digitar sair o programa continuar� sendo executado.
//		while(!valor.equalsIgnoreCase("sair")) {
//			System.out.print("Voc� diz: ");
//			valor = entrada.nextLine();
//			
//		}
		
		
		int verificador = 0;
		
		while (verificador != -5) {
			System.out.println("Insira mais um n�mero:");
			verificador = entrada.nextInt();
		}
		
			entrada.close();
		
	}
}
