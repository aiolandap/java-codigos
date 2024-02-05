package Fundamentos.arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		double[] notasAlunos = new double[3]; //definição de arrray
		System.out.println(Arrays.toString(notasAlunos));
		notasAlunos[0] = 8.5;
		notasAlunos[1] = 9.3;
		notasAlunos[2] = 8.4;
		System.out.println(Arrays.toString(notasAlunos));
		
		double total = 0;
		for (int i = 0; i < notasAlunos.length; i++) {
			total = total + notasAlunos[i];
		}
		double media = total / (notasAlunos.length);
		
		System.out.println("A média das notas é: " + media);
		
		double[] notasAlunosB = {5.5, 6.8, 9.9};//Outra definição de array
		
		double totalB = 0;
		for(int i = 0; i < notasAlunosB.length; i++) {
			totalB = totalB + notasAlunosB[i];
		}
		
		double media2 = totalB/ notasAlunosB.length;
		System.out.println("A média das notas é: " + media2);
		
		
		
		double[] notas = {9.9, 9.2, 9.3};
		for (int i=0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.println();
		
		for(double nota:notas) {
			System.out.print(nota + " ");
		}
		
	}
	
	
}

