package Fundamentos.fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações do funcionário
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; //True
		
		//Tipo caractere
		char status = 'A'; //Ativo
		
		//Dias de Empresa
		System.out.println(anosDeEmpresa*365);
		//Número de viagens
		System.out.println(numeroDeVoos/2);
		//Pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.printf("%d ganha %f de salario", id, salario);
		System.out.println("\nFerias? " + estaDeFerias);
		System.out.printf("Está de férias? %b", estaDeFerias);
		System.out.printf("\nStatus %c", status);
	}
}