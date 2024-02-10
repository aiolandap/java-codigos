package Classe;
//não precisa importar a classe Produto
import java.util.Scanner;

public class ProdutoTeste {
	public static void main(String[] args) {
		int a = 3;
		//Scanner entrada = new Scanner(System.in);
		Produto p1 = new Produto(); //instanciar um novo produto
		/*p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;*/
		p1.nome = "Camiseta Vermelha";
		p1.preco = 24.99;
		
		
		Produto p2 = new Produto();
		p2.nome = "Camiseta Azul";
		p2.preco = 50.00;
		
		//double precoFinal1 = p1.preco*(1-p1.desconto);
		double precoFinal1 = p1.precoComDesconto()+p2.precoComDesconto();
		System.out.printf("O preço final é: %f", precoFinal1);
	}
}
