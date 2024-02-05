package Fundamentos.fundamentos;

public class DesafioAritmetico {
	public static void main(String[] args) {
		double num0 = 3+2;
		double num1 = num0*6;
		double num2 = Math.pow(num1, 2);
		double num3 = 3*2;
		double num4 = num2/num3;
		
		double num5 = Math.pow(((1-5)*(2-7))/2, 2);
		
		double num6 = Math.pow(num4-num5,3);
		double num7 = Math.pow(10, 3);
		double num8 = num6/num7;
		
		System.out.println("Num0: " + num0);
		System.out.println("Num1: " + num1);
		System.out.println("Num2: " + num2);
		System.out.println("Num3: " + num3);
		System.out.println("Num4: " + num4);
		System.out.println("Num5: " + num5);
		System.out.println("Num6: " + num6);
		System.out.println("Num7: " + num7);
		System.out.println("Num8: " + num8);
	}
}