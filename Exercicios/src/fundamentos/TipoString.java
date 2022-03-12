package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Ola pessoal".charAt(2));
		
		String s ="Boa tarde"; // em string conseguimos substituir o valor completamente, mas nao conseguimos alterar o valor original
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!"); // nesse caso o simbolo de + significa concatenar
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));//comando IgnoreCase ignora acentos e letras maiusculas e minusculas.
		
		var nome = "Pedro";// apos o Java inferir que a variavel que vc declarou e string, se vc digitar a variavel nome. o Java te mostrara todas opcoes disponiveis para string
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		//O comando "\n" significa que vc esta deternminando uma quebra de linha, ou seja, no texto que voce coloca la, iniciara na prox linha
		System.out.println("Nome: " + nome + 
				"\nSobrenome: " + sobrenome + 
				"\nIdade: " + idade + 
				"\nsalario: " + salario + "\n\n");
		
		String maisUmaFrase = "Nome: " + nome + 
			"\nSobrenome: " + sobrenome + 
			"\nIdade: " + idade + 
			"\nsalario: " + salario + "\n\n";
		
		System.out.println(maisUmaFrase);
		
		/*Comando printf serve para formatar o texto a ser exibido, onde podemos tambem substituir os valores %s para caracteres de texto
		 *%d para numeros inteiros e %f para numeros com ponto flutuante, pode se tambem adicionar ".x" para delimitar a quant de casas decimais
		 *sendo x o numero total de casas 
		 * 
		 */
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f", 
				nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f", 
				nome, sobrenome, idade, salario);
		
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6, 8));
		System.out.println("Frase qualquer".substring(6, 10));
		
		
		
		
	}
}
