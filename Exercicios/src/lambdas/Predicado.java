package lambdas;

import java.util.function.Predicate;

//Interface para resultados booleanos

public class Predicado {

	public static void main(String[] args) {
		
	Produto produto = new Produto ("Notebook", 3893.89, 0.15);	
	Produto produto2 = new Produto ("Notebook", 3893.89, 0.85);	
	
	Predicate<Produto> isCaro = prod -> prod.preco >= 750;
	Predicate<Produto> isCaro2 = prod -> (1 - prod.desconto) >= 750; // produto com desconto
	
	System.out.println(isCaro.test(produto));
	System.out.println(isCaro2.test(produto2));
	
	}
}
