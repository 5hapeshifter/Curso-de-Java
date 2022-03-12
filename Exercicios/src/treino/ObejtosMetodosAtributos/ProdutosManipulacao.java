package treino.ObejtosMetodosAtributos;

public class ProdutosManipulacao {

	public static void main(String[] args) {
		
	Produtos p1 = new Produtos();
	p1.nome = "caneta";
	p1.preco = 1.50;
	p1.qtde = 10;

	System.out.println(p1.venda());
	
	Produtos carro = new Produtos();
	carro.nome = "shelby";
	
	System.out.println(carro.acelerar());
	System.out.println(carro.acelerar());
	System.out.println(carro.acelerar());
	System.out.println(carro.acelerar());

	System.out.println(carro.frear());
	
//	Scanner entrada = new Scanner(System.in);
//	
//	System.out.println("Insira um número para verificação.");
//	int n = entrada.nextInt();
//	
//	for (int i = 1; i <= n; i++) {
//		int n3 = i % 3;
//		int n5 = i % 5;
//		if (n3 == 0 && n5 == 0) {
//			System.out.println("FizzBuzz");
//		} else if(n3 == 0 && n5 != 0) {
//			System.out.println("Fizz");
//		} else if(n3 != 0 && n5 == 0) {
//			System.out.println("Buzz");
//		} else {
//			System.out.println(i);
//		}
//		
//	}
//	entrada.close();
	
	
	
	}
}	
 