package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Pedro", 9.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Maria", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		//distinct pega o dado apenas uma vez, se existir mais de um
		alunos.stream().distinct().forEach(System.out::println);
		//implementamos o equals e hashcode para fazer a comparação por conteúdo e não por endereço de memória
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
			.distinct()
			.skip(2)//skip pula uma quantidade de determinados elementos
			.limit(2)//limit limita a quantidade de elementos selecionados
			.forEach(System.out::println);
		
		System.out.println("\ntakeWhile");
		alunos.stream()
			.distinct()
			.skip(2)
			.takeWhile(a -> a.nota >= 7) //seleciona os elementos enquanto a condição for preenchida
			.forEach(System.out::println);
		
	}
}
