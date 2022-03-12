package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
//		String valor = "";
//		//o sinal de exclamação antes do valor representa uma negação ou diferente de "sair", ou seja, enquanto o usuário
//		//não digitar sair o programa continuará sendo executado.
//		while(!valor.equalsIgnoreCase("sair")) {
//			System.out.print("Você diz: ");
//			valor = entrada.nextLine();
//			
//		}
		
		
		int verificador = 0;
		
		while (verificador != -5) {
			System.out.println("Insira mais um número:");
			verificador = entrada.nextInt();
		}
		
			entrada.close();
		
	}
}
