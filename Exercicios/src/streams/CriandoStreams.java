package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print;
//		Consumer<Integer> println = System.out::print;

		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n"); // Stream.of é um método estático, ou seja, executam
		langs.forEach(print);

		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);//usando a classe Arrays para criar uma stream
		Arrays.stream(maisLangs, 1,3).forEach(print);// pegamos os elementos pelo espaço delimitado, entre 1 e 3, nesse caso, excluindo o último elemento, o 3.
		
		List<String> outrasLangs = Arrays.asList("\nC ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print); //forma de criar uma stream a partir de collection List
		outrasLangs.parallelStream().forEach(print);//executa a operação em paralelo, ou seja, não ordenada
		
//		Stream.generate(() -> "a").forEach(print);// aqui passamos um lambda que não recebe parâmetro e 
												//	retorna algo, é um laço potencialmente infinito sem ordenação	
//		Stream.iterate(0, n -> n + 1).forEach(println); //aqui é um laço potencialmente infinito ordenado
		
	}
}
