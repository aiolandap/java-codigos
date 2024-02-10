package arrays;
import java.util.Scanner;
import java.util.Arrays;
public class ExercicioNotas {
	public static void main(String[] args) {
		int tamanho = 0;
		Scanner entrada = new Scanner(System.in);
		//int tamanhoArray = 0;
		
		for (int i = 0; i == tamanho; i++) {
			System.out.println("Digite o tamanho do Array:");
			tamanho = entrada.nextInt();
			
			
		}
		double[] notas = new double[tamanho];
		
		
		System.out.println("o valor de tamanho é:" + tamanho);
		System.out.println(Arrays.toString(notas));
		/*for (int i = 0; i < notas.length ; i++) {
			System.out.println(notas[i]);
		}*/
		
		for(int i = 0; i< tamanho; i++) {
			System.out.printf("Digite o valor da posição do array %d: \n", i);
			notas[i] = entrada.nextDouble();
			
		}
		
		entrada.close();
		
		System.out.println("Os novos valores para o Array são: " + Arrays.toString(notas));
	}
}
