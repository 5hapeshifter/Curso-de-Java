package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog(
				"Informe o n�mero:");
		int numero = Integer.parseInt(valor);//transformando o valor em inteiro

		// usando qualquer n�mero por m�dulo 2 (%2), podemos descobrir se � par ou �mpar
		// ou seja, se o resultado for zero quer dizer que � par, se for 1 quer dizer que � �mpar
		//
		
		if(numero %2 == 0) {
			System.out.println("N�mero par");
		} else {
			System.out.println("N�mero �mpar");
		}
				
	}
}
