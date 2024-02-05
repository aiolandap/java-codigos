package Fundamentos.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int tamanhoNotas = 0;
		int qtdeAlunos = 0;
		
		System.out.println("Digite a quantidade de notas: ");
		tamanhoNotas = entrada.nextInt();
		
		System.out.println("Digite a quantidade de alunos: ");
		qtdeAlunos = entrada.nextInt();
		
		double[][] alunoNota = new double[qtdeAlunos][tamanhoNotas];
		
		for(int a = 0; a < qtdeAlunos; a++) {
			for (int n = 0; n < tamanhoNotas; n ++) {
				System.out.println("Digite a " + (n+1) + "º" + " nota do " + (a+1) + "º" + " aluno");
				alunoNota[a][n] = entrada.nextDouble();
			}
		}
		entrada.close();
		
		for(int a = 0; a < qtdeAlunos; a++) {
			//System.out.printf("Aluno %.2f", alunoNota[a]);
			for (int n = 0; n < tamanhoNotas; n ++) {
				
				System.out.printf("[%.2f] ", alunoNota[a][n]);
				
			}
			System.out.printf("\n");
		}
		
		//System.out.println(Arrays.toString(alunoNota));
	}
}

