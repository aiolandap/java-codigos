package Colecoes;

import java.util.Queue;
import java.util.LinkedList;

public class Fila {
	public static void main(String[] args) {
		//Primeiro a entrar, primeiro a sair FIFO
		//.add() lança uma exceção caso a fila esteja cheia
		//.offer() retorna falso caso a fila esteja cheia
		Queue<String> fila = new LinkedList<>();
		//Offer e Add adicionam elementos na fila
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Guilherme");
		
		//Peek e Element obtém próximo elemento da fila (sem remover)
		System.out.println(fila.peek());//fila vazia retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element());//fila vazia retorna erro (exceção)
		System.out.println(fila.element());
		
		//Poll e Remove obtém o próximo elemento da fila e remove!
		System.out.println(fila.poll());//Retorna null
		System.out.println(fila.remove());//Lança uma exceção
		
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains();
		
	}
}
