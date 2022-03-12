package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		//m�todos de adi��o add e push
		livros.add("O pequeno pr�ncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for(String livro: livros) {//o "for" ser� executado sempre conforme a ordem de sa�da da estrutura
			System.out.println(livro);
		}
		//m�todos de remo��o, poll, remove e pop
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
//		livros.isEmpty(); // pra saber se a fila est� ou n�o vazia
//		livros.contains();
		
	}
}
