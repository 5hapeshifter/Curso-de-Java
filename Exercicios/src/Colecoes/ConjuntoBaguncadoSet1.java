package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncadoSet1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		//usamos ctrl + 1 aqui para silenciar as ADVERTÊNCIAS.
		conjunto.add(1.2);//mesmo não sendo possível inserir tipo primitivo, o Java converte automaticamente para wrapper
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho é " + conjunto.size());
		
		conjunto.add("Teste");// ele ignora por já estar inserido, mas se usar "t" minúsculo o Java aceita.
		conjunto.add('x');
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));// "remove" serve para remover algum item
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho é " + conjunto.size());
	
		System.out.println(conjunto.contains('x'));//contains serve para verificar se há ou não um determinado item dentro do conjunto
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);//diferentemente do Array, ele já imprime legível
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); //adicionamos os elementoso conjunto nums ao conjunto nums, mas não há ordem
		conjunto.retainAll(nums);//esse comando retem apenas os valores em intersecção entre os conjuntos.
		System.out.println(conjunto);
		
		conjunto.clear();// comando para limpar o conteúdo do conjunto
		System.out.println(conjunto);
	}
}
