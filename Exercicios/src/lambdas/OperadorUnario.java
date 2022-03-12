package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

// o tipo de parâmetro passado é retornado
	public static void main(String[] args) {

		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		
		System.out.println(resultado1);
// Compose faz a operação de traz pra frente, o inverso do andThen		
		int resultado2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(0);
		
		System.out.println(resultado2);
	}
}
