package Fundamentos.classe;

public class AreaCirc {
	double raio;
	static double pi = 3.1415;
	
	AreaCirc(double raio){
		this.raio = raio;
		
	}
	
	double area() {
		return pi*Math.pow(raio, 2);
		//pow é um método estático da classe Math, por isso não precisa
		//ser instanciado para ser usado
	}
}
