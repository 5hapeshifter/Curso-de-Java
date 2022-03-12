package lambdas;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		/*
		 * 1. A partir do produto calcular o preço real(com desconto)
		 * 2. Imposto Municipal: >= 2500 (8.5%)/ < 2500 (Isento)
		 * 3. Frete: >= 3000 (100) / < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$1234,56. (Colocar R$)
		 */
		Produto p = new Produto("iPad", 3235.89, 0.13);
			
		UnaryOperator<Double> desc = n -> 1 - p.desconto;
		UnaryOperator<Double> precoDesc = n -> p.preco * n;
		UnaryOperator<Double> imp = n -> 1.085 * n;
		UnaryOperator<Double> freteAlto = n -> n + 100.00; 
		UnaryOperator<Double> freteBaixo = n -> n + 50.00;
		
		Double PrecoFinalMaior = desc
				.andThen(precoDesc)
				.andThen(imp)
				.andThen(freteAlto)
				.apply(p.preco);
		Double PrecoFinalMedio = desc
				.andThen(precoDesc)
				.andThen(imp)
				.andThen(freteBaixo)
				.apply(p.preco);
		Double PrecoFinalMenor = desc
				.andThen(precoDesc)
				.andThen(freteBaixo)
				.apply(p.preco);

		Consumer<Double> imprimirFormat = num -> System.out.printf("O preço final é R$%.2f", num);
				
		if(desc.andThen(precoDesc).apply(p.preco) >= 2500.00 && desc.andThen(precoDesc).apply(p.preco) < 3000.00) {
				imprimirFormat.accept(PrecoFinalMaior);
		} else if (desc.andThen(precoDesc).apply(p.preco) >= 3000) {
				imprimirFormat.accept(PrecoFinalMedio);
		} else {
				imprimirFormat.accept(PrecoFinalMenor);
		};
	
	}
	
}
