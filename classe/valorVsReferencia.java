package Fundamentos.classe;

public class valorVsReferencia {
	public static void main(String[] args) {
		double a = 3; //Necessário inicializar a variável antes de passar ela como referência
		double b = a;//Atribuição por valor, indica uma cópia do parâmetro
		
		a++;
		b--;
		
		System.out.println("O valor de a: " + a + " O valor de b: " + b);
		
		Data d1 = new Data();
		d1.dia = 02;
		Data d2 = d1; //Atribuição por referência, indica mesmo lugar na memória
		d2.mes = "Abril";
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
	}
}
