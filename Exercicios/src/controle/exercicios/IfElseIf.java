package controle.exercicios;

import java.util.Scanner;


public class IfElseIf {

	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o tamanho do arquivo.");
		
		Long numEscolhido = entrada.nextLong();
		
		double kb = numEscolhido / 1024;
		double mb = numEscolhido / 1024000;
		double gb = numEscolhido / 1024000000;
		double tb = numEscolhido / 1024000000000L;
		double pb = numEscolhido / 1024000000000000L;
//		double eb = numEscolhido / 1024000000000000000L;
//		Long zb = numEscolhido / 1024000000000000000000L;
//		Long yb = numEscolhido / 1024000000000000000000000L;		
		
		
		if (numEscolhido < 0) {
			System.out.println("Número inválido! Digite um número maior que zero!");
		} else {
			if (numEscolhido > 0 && numEscolhido <= 1024) {
				System.out.println("O tamanho do arquivo equivale a: " + numEscolhido + " B");
			} else if(numEscolhido >1024 && numEscolhido <= 1024000) {
				System.out.println("O tamanho do arquivo equivale a: " + kb + " KB");
			} else if(numEscolhido > 1024000 && numEscolhido <= 1024000000) {
				System.out.println("O tamanho do arquivo equivale a: " + mb + " MB");
			} else if(numEscolhido > 1024000000 && numEscolhido <= 1024000000000L) {
				System.out.println("O tamanho do arquivo equivale a: " + gb + " GB");
			} else if(numEscolhido > 1024000000000L && numEscolhido <= 1024000000000000L) {
				System.out.println("O tamanho do arquivo equivale a: " + tb + " TB");
			} else if(numEscolhido > 1024000000000000L && numEscolhido <= 1024000000000000000L) {
				System.out.println("O tamanho do arquivo equivale a: " + pb + " PB");
			}  //else if(numEscolhido > 1024000000000000000L && numEscolhido <= 1024000000000000000000L) {
				//System.out.println("O tamanho do arquivo equivale a: " + pb + " PB");
		}
		
		System.out.println("Cálculo encerrado!");
		
		
		entrada.close();
		
				
	}
	
}
