package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportadoSet2 {

	public static void main(String[] args) {
		
		//Set <String> listaAprovados = new HashSet<>();//o tipo entre os sinais "<>" determinar qual tipo de dado será permitido inserir
		//esse também não imprime de forma ordenada.
		SortedSet <String> listaAprovados = new TreeSet<>();//o comando treeSet garante a ordem de inserção
		//o TreeSet faz parte do SortedSet é uma forma de conjuntos que tem um critério de ordenação.
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for (String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set <Integer> nums = new HashSet<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		// nums.get(1); Não é possível acessar pelo índice
		
		for (int n: nums) {
			System.out.println(n);
		}
	}
}
