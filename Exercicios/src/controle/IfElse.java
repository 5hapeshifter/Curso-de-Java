package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog(
				"Informe o número:");
		int numero = Integer.parseInt(valor);//transformando o valor em inteiro

		// usando qualquer número por módulo 2 (%2), podemos descobrir se é par ou ímpar
		// ou seja, se o resultado for zero quer dizer que é par, se for 1 quer dizer que é ímpar
		//
		
		if(numero %2 == 0) {
			System.out.println("Número par");
		} else {
			System.out.println("Número ímpar");
		}
				
	}
}
