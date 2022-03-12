package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		//para numeros inteiros declarar com "int"
		//para numero com casas decimais usar "double"
		
		double raio = 3.4;
		//para mudar uma constante para variavel, inserir "Final" antes da variavel
		//final double ou final int
		final double PI = 3.14159;

		//por convencao usamos o valor de constantes em maiusculas e de variaveis em minusculas.
		
		double area = PI * raio * raio;
		
		System.out.println(area);

		raio = 10;
		area = PI * raio* raio;
		System.out.println("Area = " + area + "m2");
	}


}
