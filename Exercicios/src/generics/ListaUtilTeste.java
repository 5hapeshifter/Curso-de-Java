package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		
		List<String> langs = Arrays.asList("JS", " PHP", "Java", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		String ultimaLinguagem1 = (String) ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLinguagem1);
		
		Integer ultimoNumero1 = (Integer) ListaUtil.getUltimo1(nums);
		System.out.println(ultimoNumero1);

		String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
		System.out.println(ultimaLinguagem2);
		
		Integer ultimoNumero2 = ListaUtil.<Integer>getUltimo2(nums);// aqui estamos esplicitando que receberemos um Integer, mesmo não sendo necessário
		// String ultimoNumero2 = ListaUtil.getUltimo2(nums); // Aqui vai dar erro, pq estamos declando um tipo da variável diferente do tipo da lista
		System.out.println(ultimoNumero2);
	}
}
