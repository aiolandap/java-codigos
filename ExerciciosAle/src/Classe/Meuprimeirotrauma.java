package Classe;

public class Meuprimeirotrauma {
	int a = 3;
	static int b = 4;
	
	public static void main(String[] args) {
		Meuprimeirotrauma m1 = new Meuprimeirotrauma();
		//System.out.println(a);// Não é possível acessar a variável dessa forma
		System.out.println("valor de a:" + m1.a); //caso a variável não seja estática, é necessário uma instância para acessá-la
		
		System.out.println(b); //se o valor for estático é possível acessá-lo diretamente
	}
}
