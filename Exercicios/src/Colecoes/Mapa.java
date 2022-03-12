package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		//o comando put tanto adiciona quanto substitui o que já existe
		Map<Integer, String> usuarios = new HashMap <>();
		usuarios.put(1, "Roberto");
		usuarios.put(20, "Ricardo");//aqui substituímos Roberto por Ricardo
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());// retorna os valores só da coluna das chaves
		System.out.println(usuarios.values());// retorna os valores só da coluna valores
		System.out.println(usuarios.entrySet());// retorna os valores das duas colunas
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Rebeca"));

		System.out.println(usuarios.get(4));
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(4, "Gui"));
		
		for (int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		for (String valor: usuarios.values()) {
			System.out.println(valor);
		}
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ==> ");
			System.out.println(registro.getValue());
		}
	}
}
