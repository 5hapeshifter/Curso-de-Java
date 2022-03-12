package controle.exercicios;

import javax.swing.JOptionPane;

public class IfElseDois {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o número: ");
		int numero = Integer.parseInt(valor);
		
	
		if (numero % 2 == 0) {
			System.out.println("Número par!");
		} else {
			System.out.println("Número ímpar");
		}
	}
}
