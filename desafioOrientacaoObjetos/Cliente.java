package Fundamentos.desafioOrientacaoObjetos;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
	String nome;
	
	List<Compra> compras = new ArrayList<Compra>();
	
	Cliente(String nome){
		this.nome = nome;
		
	}
	
	double obterValorTotal() {
		double total = 0;
		for (Compra compra: compras) {
			total += compra.obterValorTotal();
		}
		return total;
	}
}
