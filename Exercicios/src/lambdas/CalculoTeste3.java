package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		// Java n�o permite conversão direta de primitivo para wrapper de tipos diferentes
		// como por exemplo de int -> Double
		// Permite de double -> Double
		
		BinaryOperator<Double> calc = (x, y) -> {	return x + y;	};
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (x, y) -> x * y; // podemos notar o polimorfismo
		System.out.println(calc.apply(4.0, 4.0));
		
		BinaryOperator<Integer> calc2 = (x, y) -> {	return x + y;	};
		System.out.println(calc2.apply(2, 3));
		
		calc2 = (x, y) -> x * y; // podemos notar o polimorfismo
		System.out.println(calc2.apply(5, 4));
		
	}
}
