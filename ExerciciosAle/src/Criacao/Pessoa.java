package Criacao;

import java.util.List;
import java.util.ArrayList;

public class Pessoa {
	Limite limite;
	String nome;
	//double peso;

	List<Pessoa> familia = new ArrayList<Pessoa>();
	
	Pessoa(){
		
	}
	
	int familiaLista(String nome) {
		this.familia.add(this);
		return familia.size();
	}
	
	int tamanhoFamilia() {
		return familia.size();
	}
	
	boolean comer() {
		//tem sexo
		return true;
	}
	
	void estruturaMental() {
		//tem sexo
		//tem triade
	}
	

	
	
}
