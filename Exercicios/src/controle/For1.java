package controle;

public class For1 {

	public static void main(String[] args) {
		
//		int contador = 0;
//		while(contador <= 20) {
//			System.out.printf("i = %d\n", contador);
//			contador+=2;
//		}
//		ESTRUTURA IDEAL PARA VOC� TER UMA QUANTIDADE DETERMINADA DE REPETI��ES
		// primeira parte � a declara��o da vari�vel, a segunda parte � a express�o que vai retornar
		//e vai determinar o limite da repeti��o e a terceira � a forma de como a vari�vel vai ser alterada
		for (int contador = 1; contador <= 10; contador++) {
			System.out.printf("i = %d\n", contador);
		}
		int n = 24;
		int n1 = n%3;
		System.out.println(n1);
		//Estrutura que n�o � a ideal de utilizar
		//int x = 2;
		//for (;x < 10;) {
		//System.out.println("x = " + x);
		//	x++;
		}
		//La�o infinito em for
		//for (;;)// ou tambem for (;true;)
		//	System.out.println("Fim!");
}
