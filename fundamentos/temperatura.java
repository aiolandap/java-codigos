package Fundamentos.fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		double celsius = 0.0;
		double farenheit = 0.0;
		final int constante = 32;
		final double constante2 = 5/9.0;
		farenheit = 233;
		celsius = (farenheit - constante)*constante2;
		System.out.println("A temperatura em celsius: " + celsius + " para Farenheit: " + farenheit);
		
		celsius = 27;
		farenheit = (celsius/constante2)+constante;		
		System.out.println("A temperatura em celsius: " + celsius + " para Farenheit: " + farenheit);
	}
}
