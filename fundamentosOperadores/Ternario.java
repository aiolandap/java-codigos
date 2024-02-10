package Fundamentos.fundamentosOperadores;

public class Ternario {
	public static void main(String[] args) {
		double media = 7.6;
		//boolean bomComportamento = true;
		String resultadoParcial = media >=5.0 ? "em recuperação":"Reprovado";
		String resultado = media >= 7.0 ? "Aprovado":resultadoParcial;
		//String temDesconto = bomComportamento && resultado;
		System.out.println("resultado: " + resultado);
		
	}
}
