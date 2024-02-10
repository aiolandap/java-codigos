package Classe;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Alessandra", 55);
		Comida c1 = new Comida("Feijão", 0.225);
		
		double pesoInicial = p1.peso;
		double comeu = p1.comer(c1);
		System.out.println(comeu);
		System.out.println(pesoInicial);
		System.out.println("engordou " + (comeu - pesoInicial));
	}
}
