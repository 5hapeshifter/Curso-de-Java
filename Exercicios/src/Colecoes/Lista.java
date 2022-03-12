package Colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
	List<Usuario> lista = new ArrayList <>();
	
	Usuario u1 = new Usuario ("Ana");
	lista.add(u1);
	lista.add(new Usuario ("Carlos"));
	lista.add(new Usuario ("Lia"));
	lista.add(new Usuario ("Bia"));
	lista.add(new Usuario ("Manu"));
	lista.add(new Usuario ("Manu"));
	//IMPORTANT�SSIMO IMPLEMENTAR O EQUALS E HASCODE PARA OS COMANDOS ABAIXO SEREM EXECUTADOS CORRETAMENTE
	System.out.println(lista.get(3));// acessar pelo �ndice
	//formas de remover list
	System.out.println(">>>> " + lista.remove(1));//remo��o a partir do ID ele mostra o objeto que est� excluindo
	System.out.println(lista.remove(new Usuario ("Manu")));// mostra se a remo��o true/false
	System.out.println(lista.remove(new Usuario ("Manu")));
	System.out.println(lista.remove(new Usuario ("Manu")));
	
	System.out.println("Tem? " + lista.contains(new Usuario("Lia")));//resultado true/false
	
	for(Usuario u: lista) {
		System.out.println(u.nome);
		}
	}
}
