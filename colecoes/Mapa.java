package Fundamentos.colecoes;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap <Integer, String>();
		usuarios.put(1, "Roberto");
		usuarios.put(1, "Alezinha");
		
		usuarios.put(1, "João");
		usuarios.put(2, "Maria");
		usuarios.put(3, "Roberta");
		usuarios.put(4, "Alex");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(4));
		System.out.println(usuarios.containsValue("Maria"));
		
		System.out.println(usuarios.get(3));
		System.out.println(usuarios.remove(1));
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry <Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro.getKey());
			System.out.println(registro.getValue());
		}
	}
	
}

