package generics;

import java.util.List;

public class ListaUtil {

	public static Object getUltimo1(List<?> lista) {// o operador "?" significa qualquer coisa, é diferente de object
		return lista.get(lista.size() -1);
	}
	
	// MÉTODO MUITO MAIS VERSÁTIL
	public static <T> T getUltimo2(List<T> lista) {// quando declaramos que receberemos um uma lista do tipo "T", ou seja, qualquer tipo, automaticamente o método retornará o tipo recebido da lista, se a lista for String, retornará String, se for Double, retornará um Double
		return lista.get(lista.size() -1);
	}
	
	public static <A, B, C> C teste(A paramA, B paramB) {
		C teste = null;
		return teste;
		
	}
	
}
