package Fundamentos.desafioCarros;

public class Ferrari extends Carro {
	Ferrari(){
		super(300);
	}
	
	Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
	}
	void acelerar(Motor motor) {
		motor.fatorInjecao += 0.4*3;
	}
	
	void frear(Motor motor) {
		motor.fatorInjecao -= 0.4*3;
	}
}