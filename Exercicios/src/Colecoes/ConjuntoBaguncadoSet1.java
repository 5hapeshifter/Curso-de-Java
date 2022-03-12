package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncadoSet1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		//usamos ctrl + 1 aqui para silenciar as ADVERT�NCIAS.
		conjunto.add(1.2);//mesmo n�o sendo poss�vel inserir tipo primitivo, o Java converte automaticamente para wrapper
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho � " + conjunto.size());
		
		conjunto.add("Teste");// ele ignora por j� estar inserido, mas se usar "t" min�sculo o Java aceita.
		conjunto.add('x');
		System.out.println("Tamanho � " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));// "remove" serve para remover algum item
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho � " + conjunto.size());
	
		System.out.println(conjunto.contains('x'));//contains serve para verificar se h� ou n�o um determinado item dentro do conjunto
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);//diferentemente do Array, ele j� imprime leg�vel
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); //adicionamos os elementoso conjunto nums ao conjunto nums, mas n�o h� ordem
		conjunto.retainAll(nums);//esse comando retem apenas os valores em intersec��o entre os conjuntos.
		System.out.println(conjunto);
		
		conjunto.clear();// comando para limpar o conte�do do conjunto
		System.out.println(conjunto);
	}
}
