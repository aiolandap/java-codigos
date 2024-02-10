package Classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc a1 = new AreaCirc(25);
		//static pertence a classe
		//a1 é uma instância da classe AreaCirc
		//a1 está sendo construido por new construtor AreaCirc com parâmetro raio igual a 25;
		System.out.println("A área de a1 é: " + a1.area());
		
		AreaCirc a2 = new AreaCirc(10);
		a2.pi = 3;
		System.out.println("A área com novo pi pela instancia é: " + a2.area());
		//Neste exemplo o atributo de classe está sendo modificado
		//por uma instância, que por sua vez, modificará o valor
		//para todas as outras instâncias
		//Então nesse caso, se executarmos a área para a1 novamente
		//seu valor será modificado
		
		System.out.println("A nova área para a1 modificado por a2 é: " + a1.area());
		
		//O ideal é modificar o valor de pi diretamente com a classe
		//No caso, acessar o atributo diretamente com a classe
		AreaCirc.pi = 3.1415;
		System.out.println("A nova área corrigida com novo pi é: " + a1.area());
		System.out.println("A nova área corrigida com novo pi é: " + a2.area());
		
		System.out.println("O valor de pi com a classe Math: " + Math.PI);
	}
}
