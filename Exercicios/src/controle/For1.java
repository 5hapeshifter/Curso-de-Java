package controle;

public class For1 {

	public static void main(String[] args) {
		
//		int contador = 0;
//		while(contador <= 20) {
//			System.out.printf("i = %d\n", contador);
//			contador+=2;
//		}
//		ESTRUTURA IDEAL PARA VOCÊ TER UMA QUANTIDADE DETERMINADA DE REPETIÇÕES
		// primeira parte é a declaração da variável, a segunda parte é a expressão que vai retornar
		//e vai determinar o limite da repetição e a terceira é a forma de como a variável vai ser alterada
		for (int contador = 1; contador <= 10; contador++) {
			System.out.printf("i = %d\n", contador);
		}
		int n = 24;
		int n1 = n%3;
		System.out.println(n1);
		//Estrutura que não é a ideal de utilizar
		//int x = 2;
		//for (;x < 10;) {
		//System.out.println("x = " + x);
		//	x++;
		}
		//Laço infinito em for
		//for (;;)// ou tambem for (;true;)
		//	System.out.println("Fim!");
}
