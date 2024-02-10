package DesafioCarros;

public class Carro {
	Motor motor;
	int VELOCIDADE_MAXIMA = 0;
	int delta = 5;
	
	
	Carro(){
		
	}
	
	Carro(int velocidadeMaxima){
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
		this.motor = new Motor(this);//????????????? não entendi esse construtor
	}
	
	
	void acelerar() {
		if(motor.fatorInjecao + delta > VELOCIDADE_MAXIMA) {
			motor.fatorInjecao = VELOCIDADE_MAXIMA;
			System.out.println("Chegou na velocidade máxima " + motor.fatorInjecao);
		}else {
			motor.fatorInjecao = motor.fatorInjecao + delta;
			System.out.println("Acelerou " + motor.fatorInjecao);
		}
		
	}
	
	void frear() {
		if(motor.fatorInjecao >= delta) {
			motor.fatorInjecao = motor.fatorInjecao - delta;
			System.out.println("Freou " + motor.fatorInjecao);
		}
		
	}
	void ligado() {
		motor.ligado = true;
	}
	void desligado() {
		motor.ligado = false;
	}
	boolean estaLigado() {
		return motor.ligado;
	}
	
}
