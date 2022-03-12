package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
//		(F - 32) * 5/9= C Formula pra converter graus farenheit para Celsius
//		quando fizer uma operacao matematica com numeros inteiros o resultado sera em numero inteiro
//		para realizar calculo com casas decimais deve-se atribuir uma variavel double ou (.0) na sequencia do numero no Jshell
		
		double far = 86;
		final int AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		double celsius = (far - AJUSTE)* FATOR;
		System.out.println("O resultado e " + celsius + "°C");
		//o sinal de soma (+) serve para concatenar
		//Depois de as variaveis terem sido declaradas, podemos apenas cita-las e atribuir novos valores conforme abaixo.
		
		far = 150;
		celsius = (far - AJUSTE) * FATOR;			
		System.out.println("O resultado e " + celsius + "°C");
		
	}

}
