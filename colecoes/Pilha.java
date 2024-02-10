package Fundamentos.colecoes;

import java.util.Deque;
import java.util.ArrayDeque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for(String livro:livros) {
			System.out.println("O livro é: " + livro);
			//Ordem da pilha
			//Ultimo a entrar, primeiro a sair LIFO
		}
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		//System.out.println(livros.pop());
		//System.out.println(livros.remove());
	}
}

