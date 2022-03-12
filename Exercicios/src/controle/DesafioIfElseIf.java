package controle;

import java.util.Scanner;

public class DesafioIfElseIf {
	/*
	 * dasafio dias da semana:
	 * criar um c�digo onde o usu�rio digita o dia da semana e sai o n�mero de ordem
	 * correspondente conforme tabela abaixo.
	 * Domingo - 1, Segunda 2 e assim por diante.
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o dia da semana: ");
		String dia = entrada.next();
		
		if(dia.equalsIgnoreCase("domingo")) {//if("domingo".equalsIgnoreCase(dia) tamb�m funciona
			System.out.println("1");
		} else if (dia.equalsIgnoreCase("segunda")) { //iqualsIgnoreCase para ignorar acentos, maiusculas e minusculas
			System.out.println("2");
		} else if (dia.equalsIgnoreCase("ter�a")// poderiamos usar tambem dia.toLowerCase para padronizar o campo
				|| dia.equalsIgnoreCase("terca")) {
			System.out.println("3");
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println("4");
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		} else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println("6");
		} else if (dia.equalsIgnoreCase("s�bado") 
				|| dia.equalsIgnoreCase("sabado")) {
			System.out.println("7");
		}else {	
			System.out.println("Inv�lido");
		}
		
		
		entrada.close();		
				
	}
}
