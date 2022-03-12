package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList <>();
// a diferença entre offer e adicionar é que quando vc tem filas com restrição de tamanhos (cheias) como
// por exemplo 100, se o limite da fila for 100 o offer vai retornar true/false se não conseguir 
// incluir vai retornar false, o add vai retornar um erro, ambos adicionam elementos na fila
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
// Peek e element retornam o próximo elemento da fila sem remover, peek retorna null se a fila estiver 
// vazia e element retorna um erro.
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());


// 		Remove e poll obetém o próximo elemento da fila e remove, poll retorna nula e remove retorna um erro
//		quando a fila está vazia
		System.out.println(fila.poll());// retorna o primeiro elemento já removendo
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
//		outros comandos
//		fila.size(); // tamanho da fila
//		fila.clear(); // pra limpar a fila
//		fila.isEmpty(); // pra saber se a fila está ou não vazia
//		fila.contains();
		
	}
}
