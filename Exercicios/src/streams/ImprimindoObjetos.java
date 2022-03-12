package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
//		for (int i = 0; i < aprovados.size(); i++) { // for normal 
//			System.out.println(aprovados.get(i));
//		} 
		
		for(String nome: aprovados) { // for each
			System.out.println(nome);
		}
		
		System.out.println("\nUsando Iterator...");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("\nUsando Stream..."); // Laço interno
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
	}
}
