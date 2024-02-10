package EstruturasDeControle;

import java.util.Scanner;

public class DesafioWhile {
	//Fazer um programa que conta notas
	//Soma todas as notas válidas de 0 a 10;
	//Mostra a média das notas no fim do programa
	//Para sair do programa o sinal deve ser -1
	public static void main(String[] args) {
		//int sair = -1;
		int contador = 0;
		double nota = 0, notas = 0;
		Scanner entrada = new Scanner(System.in);
		double media = 0;
		
		
		while(nota != -1) {
			System.out.println("Digite uma nota: ");
			nota = entrada.nextDouble();
			if(nota >= 0 && nota <= 100) {
				notas = notas + nota;
				contador = contador + 1;
				media = notas/contador;
			}else if(nota != -1) {
				System.out.println("Digite uma nota válida entre 0 e 100!");
			}else{
				System.out.println("A média das notas é:" + media);
			}
			
		}
		entrada.close();
	}
	
}
