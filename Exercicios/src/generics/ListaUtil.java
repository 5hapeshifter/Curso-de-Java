package generics;

import java.util.List;

public class ListaUtil {

	public static Object getUltimo1(List<?> lista) {// o operador "?" significa qualquer coisa, � diferente de object
		return lista.get(lista.size() -1);
	}
	
	// M�TODO MUITO MAIS VERS�TIL
	public static <T> T getUltimo2(List<T> lista) {// quando declaramos que receberemos um uma lista do tipo "T", ou seja, qualquer tipo, automaticamente o m�todo retornar� o tipo recebido da lista, se a lista for String, retornar� String, se for Double, retornar� um Double
		return lista.get(lista.size() -1);
	}
	
	public static <A, B, C> C teste(A paramA, B paramB) {
		C teste = null;
		return teste;
		
	}
	
}
