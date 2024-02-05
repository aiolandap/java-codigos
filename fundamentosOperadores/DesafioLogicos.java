package Fundamentos.fundamentos_operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		boolean terca = true;
		boolean quinta = true;
		
		//Trabalho na terça V ou F
		//Trabalho na quinta V ou F
		
		boolean sorvete = true;
		
		System.out.println("TV de 50 polegadas: " + ((trabalho1 && terca)&&
				(trabalho2 && quinta)) + " sorvete");
		System.out.println("TV de 30 polegadas: " + ((trabalho1 && !terca)||
				(trabalho2 && quinta)) + " sorvete");
		System.out.println("TV de 30 polegadas: " + ((trabalho1 && terca)||
				(trabalho2 && !quinta)) + " sorvete");
		System.out.println("TV de 50 ou 30 polegadas: " + ((trabalho1 && !terca)||
				(trabalho2 && !quinta))+ " ficou com fome e sem acuçar");
	}
}
