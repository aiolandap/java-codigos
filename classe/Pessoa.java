package Fundamentos.classe;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	double comer(Comida comida) {
		if(comida != null) {
			
			this.peso = this.peso + comida.peso;
		}
		return this.peso;
	}
	
}
