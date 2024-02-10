package DesafioCarros;

public class Main {
	public static void main(String[] args) {
		Carro c1 = new Civic();
		Carro c2 = new Ferrari(300);
		System.out.println(c1.estaLigado());
		c1.ligado();
		c2.ligado();
		
		//c2.VELOCIDADE_MAXIMA(200); ERRO
		c1.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		System.out.println(c2.motor.giros());
		
		c2.frear();
		c2.frear();
		c2.frear();
		System.out.println(c2.motor.giros());
		c2.frear();
		c2.frear();
		c2.frear();
		System.out.println(c2.motor.giros());
	}
}
