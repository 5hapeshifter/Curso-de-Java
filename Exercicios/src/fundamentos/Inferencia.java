package fundamentos;

public class Inferencia {

	//Quando usarmos o comando "var" e atribuirmos um valor a ele como "5", nao poderemos colocar texto nessa variavel depois, pois
	//o java nao permite, ou seja, nao podemos mudar o tipo da variavel por causa da INFERENCIA.
	
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
	 	//se criarmos uma variavel de numeros inteiros, nao conseguiremos inserir numeros com casas decimais, pois o java INFERIU que a variavel do tipo "numero inteiro"	
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		c = "Outro texto";
		System.out.println(c);
	
		double d; //variavel foi declarada como numeros racionais 
		d = 123.65; // variavel foi inicializada
		System.out.println(d);// usada
	
		var e = 123.45;// com o comando var, nao podemos apenas declarar o nome da variavel, precisamos inserir valor ou texto para que o Java faca a inferencia e definir o tipo de variavel.
		e = 123;
		System.out.println(e);// usada
	}
}
