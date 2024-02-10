package Fundamentos.desafioOrientacaoObjetos;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	List<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(String nome, double preco, int quantidade) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, quantidade));
	}
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.qtdeProduto * item.produto.preco;
			
		}
		return total;
	}
}
