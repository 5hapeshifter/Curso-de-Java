package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		//métodos de adição add e push
		livros.add("O pequeno príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for(String livro: livros) {//o "for" será executado sempre conforme a ordem de saída da estrutura
			System.out.println(livro);
		}
		//métodos de remoção, poll, remove e pop
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		//System.out.println(livros.pop());
		//System.out.println(livros.remove());
		
//		outros comandos
//		livros.size(); // tamanho da fila
//		livros.clear(); // pra limpar a fila
//		livros.isEmpty(); // pra saber se a fila está ou não vazia
//		livros.contains();
		
	}
}
