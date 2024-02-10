package Fundamentos.classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(){
		
	}
	Produto(String nomeInicial){
		nome = nomeInicial;
	}//o construtor não tem retorno...Pode ter várias assinaturas
	
	double precoComDesconto() {//não precisa passar parâmetros pois o método está próximo do objeto
		return (preco*(1-desconto));
	}
	
}
