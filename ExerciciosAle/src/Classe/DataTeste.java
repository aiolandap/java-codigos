package Classe;
import java.util.Scanner;

public class DataTeste {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Data d0 = new Data();
		Data d1 = new Data();
		System.out.printf("Digite o ano:\n");
		d1.ano = entrada.nextInt();
		System.out.printf("Digite o dia:\n");
		d1.dia = entrada.nextInt();
		System.out.printf("Digite o mês:\n");
		d1.mes = entrada.next();
		
		
		entrada.close();
		//System.out.printf("A data é: %d/%s/%d", d1.dia,d1.mes, d1.ano);
		//System.out.printf(dataFormatada());
		System.out.printf(d0.dataFormatada()+"\n");
		System.out.printf(d1.dataFormatada());
	}
}
