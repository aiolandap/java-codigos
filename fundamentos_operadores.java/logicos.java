package Fundamentos.fundamentos_operadores;

public class Logicos {
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3>7;
		
		System.out.println("Resultado 1: " + (condicao1 && condicao2));//and
		System.out.println("Resultado 2: " + (condicao1 || condicao2));//or
		System.out.println("Resultado 3: " + (condicao1 ^ condicao2)); //xor
		System.out.println("Resultado 4: " + !condicao1);
		
		//Tabela verdade E
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		//Tabela verdade OU
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		//Tabela verdade OU Exclusivo
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		//Tabela verdade NOT
		System.out.println(!false);
		System.out.println(!true);
		
	}
}