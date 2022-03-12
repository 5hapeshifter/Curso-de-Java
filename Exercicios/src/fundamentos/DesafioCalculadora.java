package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		/*
		 * ler num1
		 * ler num2
		 * + - * /
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		//variáveis
		
		System.out.println("Valor 1ª variável: ");
		double var1 = entrada.nextDouble();
		
		System.out.println("Valor 2ª variável: ");
		double var2 = entrada.nextDouble();
		
		System.out.println("Informe a operacao: ");
		String oper = entrada.next();
			
		//Lógica
		
		double resultado = "+".equals(oper) ? var1 + var2 : 0;
				resultado = "-".equals(oper) ? var1 - var2 : resultado;
				resultado = "*".equals(oper) ? var1 * var2 : resultado;
				resultado = "/".equals(oper) ? var1 / var2 : resultado;
				resultado = "%".equals(oper) ? var1 % var2 : resultado; 
		
		
		System.out.printf("%.2f %s %.2f = %.2f", var1, oper, var2, resultado);
		
		//System.out.println("Resultado: " + (var1 + oper + var2)); minha resposta
		
		entrada.close();
		
		
	}
}
