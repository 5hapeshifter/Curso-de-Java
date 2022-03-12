package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print;
//		Consumer<Integer> println = System.out::print;

		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n"); // Stream.of � um m�todo est�tico, ou seja, executam
		langs.forEach(print);

		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);//usando a classe Arrays para criar uma stream
		Arrays.stream(maisLangs, 1,3).forEach(print);// pegamos os elementos pelo espa�o delimitado, entre 1 e 3, nesse caso, excluindo o �ltimo elemento, o 3.
		
		List<String> outrasLangs = Arrays.asList("\nC ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print); //forma de criar uma stream a partir de collection List
		outrasLangs.parallelStream().forEach(print);//executa a opera��o em paralelo, ou seja, n�o ordenada
		
//		Stream.generate(() -> "a").forEach(print);// aqui passamos um lambda que n�o recebe par�metro e 
												//	retorna algo, � um la�o potencialmente infinito sem ordena��o	
//		Stream.iterate(0, n -> n + 1).forEach(println); //aqui � um la�o potencialmente infinito ordenado
		
	}
}
