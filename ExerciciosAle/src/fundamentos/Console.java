package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia\n\n");//print não tem quebra de linha
		
		System.out.println("Bom");
		System.out.println("dia!");//println tem quebra de linha
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 
				1,2,3,4,5,6);//printf não tem quebra de linha
		System.out.printf("Salário: %.1f%n", 1234.5678);
		
//		Scanner entrada = new Scanner(System.in);
		
//		System.out.print("Digite o seu nome:");
//		String nome = entrada.nextLine();
//		
//		System.out.print("Digite o seu sobrenome:");
//		String sobrenome = entrada.nextLine();
//		
//		System.out.print("Digite a sua idade:");
//		int idade = entrada.nextInt();
//		
//		System.out.println("\n\n Nome = " + nome + " " + sobrenome
//				+ " Idade: " + idade);
//		
//		entrada.close();
		
//		Scanner teclado = new Scanner(System.in);
//		System.out.println("Qual a sua idade?");
//	    int idade = teclado.nextInt();
//	    teclado.nextLine();
//	    System.out.println("Qual o seu nome?");
//	    String nome = teclado.nextLine();
//	    System.out.println("Qual o seu sobrenome?");
//	    String sobrenome = teclado.nextLine();
//	 
//	    teclado.close();
	}
}
