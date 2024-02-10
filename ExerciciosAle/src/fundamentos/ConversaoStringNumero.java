package fundamentos;

import java.util.Scanner;

import java.awt.*;
import javax.swing.*;

public class ConversaoStringNumero {
	public static void main(String [] args) {
		//int num1, num2;
//		String num1;
//		String num2;
//		Scanner teclado = new Scanner(System.in);
//		System.out.println("Digite o primeiro número:\n");
//		num1 = teclado.nextLine();
//		
//		System.out.println("Digite o segundo número:\n");
//		num2 = teclado.nextLine();		
//		
//		System.out.printf("O primeiro número é %s e o segundo é %s ", num1, num2);
//		teclado.close();
//		
//		double numero1;
//		double numero2;
//		numero1 = Double.parseDouble(num1);
//		numero2 = Double.parseDouble(num2);
//		double soma;
//		soma = numero1 + numero2;
//		
//		System.out.println("\nA soma é:" + soma);
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro numero:");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo numero:");
		
		double numero1;
		double numero2;
		numero1 = Double.parseDouble(valor1);
		numero2 = Double.parseDouble(valor2);
		double soma;
		soma = numero1 + numero2;
		System.out.println("\nA soma é:" + soma);

		
	}
}
