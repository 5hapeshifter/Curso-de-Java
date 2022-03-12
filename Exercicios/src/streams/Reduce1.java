package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		//REDUCE � UMA FUN��O TERMINADORA, N�O PODEMOS ENCADEAR NADA DEPOIS DELE
		//Quando usarmos o Optional Integer, temos que usar a fun��o get para pegar os valores
		//Quando colocamos valor inicial conforme abaixo, n�o precisamos
		int total1 = nums.stream().reduce(soma).get();
		System.out.println(total1);
		
		//100 � o valor inicial, vai come�ar a partir dele e quando usamos o parallelStream
		//esse valor inicial ser� somado v�rias vezes. TOMAR CUIDADO
		Integer total2 = nums.parallelStream().reduce(100,soma);
		System.out.println(total2);
		//Aqui s� usar� o valor 100 uma vez pq � uma stream sequencial
		Integer total3 = nums.stream().reduce(100,soma);
		System.out.println(total3);
		//Resultado foi um Opcional<Integer>
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
		//Quando usamos o Optional podemos usar umas fun��es adicionais como ifPresent
		
		
//		Integer acum = 0;
//		for(Integer i = 0; i < nums.size(); i++) {
//			System.out.println(acum += nums.get(i));
//		}	
//			
	}
}
