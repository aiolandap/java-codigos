package Fundamentos.colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class conjuntoComportado {
	public static void main(String[] args) {
		//Set<String> lista = new<String> HashSet();
		SortedSet<String> lista = new TreeSet();
		lista.add("Alezinha");
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Pedro");
		for (String candidato: lista) {
			System.out.println(candidato);
		}
	}
}
