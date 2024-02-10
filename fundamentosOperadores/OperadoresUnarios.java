package Fundamentos.fundamentosOperadores;

public class OperadoresUnarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		//"Não ta com pressa de incrementar
		a++; // a = a + 1
		a--; // a = a - 1
		
		//Ta com pressa de incrementar
		++b; // b = b + 1
		--b; // b = b - 1
		
		System.out.println(++a == b--);
		//primeiro incrementa o a, faz a comparação ao b, depois decrementa o b
		System.out.println(a == b);
		
		
	}
}
