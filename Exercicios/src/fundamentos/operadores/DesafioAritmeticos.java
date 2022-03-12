package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3); //Em Java tem uma classe chamada Math e dentro dela tem uma funcionalidade chamada
		//power (pow) que significa potencia, ou seja podemos fazer potenciação com esse comando, 
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);
		
		//Resolucao do desafio
		
		double numA = Math.pow(6 *(3 + 2),2); //para usar o debug, devemos marcar a linha de inicio com dois clicks, na
		//na coluna ao lado da linha, clicar no simbolo do debug, e podemos executar linha por linha apertando F6 e acompanhar o resultado.
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double demB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / demB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado é " + resultado);
		
		
	}
	
}
