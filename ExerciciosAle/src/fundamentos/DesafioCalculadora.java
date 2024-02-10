package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		double num1;
		double num2;
		
		
		String multiplicacao = "*";
		String soma = "+";
		String divisao = "/";
		String subtracao = "-";
		String operacao;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculadora JAVA");
		System.out.println("Digite o primeiro numero:");
		num1 = teclado.nextInt();
		System.out.println("Digite o segundo numero:");
		num2 = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Digite o operação: + - * /");
		operacao = teclado.nextLine();
		
		String resultado;
		System.out.println("Operacao dada: " + operacao);
		
		resultado = (operacao.equals(multiplicacao))? "O resultado é: " + String.valueOf(num1*num2):" Não é multiplicação";
		System.out.println(resultado);
		
		resultado = (operacao.equals(soma))? "O resultado é: " + String.valueOf(num1+num2):"Não é soma";
		System.out.println(resultado);
		
		resultado = (operacao.equals(divisao))? "O resultado é: " + String.valueOf(num1/num2):"Não é divisão";
		System.out.println(resultado);
		
		resultado = (operacao.equals(subtracao))? "O resultado é: " + String.valueOf(num1-num2):"Não é subtração";
		System.out.println(resultado);
		
		
	}
}
