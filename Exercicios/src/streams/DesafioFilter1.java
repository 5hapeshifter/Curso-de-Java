package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter1 {

	public static void main(String[] args) {
		
		ProdutosDesafio p1 = new ProdutosDesafio("Caneta", 2.00, 0.20, 0.00);
		ProdutosDesafio p2 = new ProdutosDesafio("Lápis", 1.00, 0.10, 0.00);
		ProdutosDesafio p3 = new ProdutosDesafio("Caderno", 30.00, 0, 0.40);
		ProdutosDesafio p4 = new ProdutosDesafio("Impressora", 250.00, 12.50, 0.20);
		ProdutosDesafio p5 = new ProdutosDesafio("Teclado", 100.00, 5.00, 0.30);
		ProdutosDesafio p6 = new ProdutosDesafio("HD", 300.00, 0, 0.35);
		
		List<ProdutosDesafio> produtos = Arrays.asList(p1, p2 ,p3, p4, p5, p6);
		
		Predicate<ProdutosDesafio> descontoAlto = p -> p.desconto >= 0.20;
		Predicate<ProdutosDesafio> freteGratis = f -> f.frete == 0;
		Predicate<ProdutosDesafio> precoAlto = p -> p.preco >= 100;
//		Function<ProdutosDesafio, Double> descontoApl = desc -> desc.preco * (1 - desc.desconto);
		Function<ProdutosDesafio, String> nomeProd = n -> "Produto: "+ n.nome + " | Preço: " + n.preco;
		
		produtos.stream()
			.filter(precoAlto)
			.filter(descontoAlto)
			.filter(freteGratis)
			.map(nomeProd)
			.forEach(System.out::println);
		
	}
}
