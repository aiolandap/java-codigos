package EstruturasDeControle;

public class DesafioFor {
	public static void main(String[] args) {
		String palavra = "";
		String teste;
		System.out.println();
		String valor = "#";
		
		System.out.println("Programa");
		for(;!palavra.equals("cinco"); ) {
			System.out.println(valor);
			valor = valor + "#";
			if(palavra.equals("")) {
				palavra = "c";
			}else if(palavra.equals("c")) {
				palavra = "ci";
			}else if(palavra.equals("ci")) {
				palavra = "cin";
			}else if(palavra.equals("cin")) {
				palavra = "cinc";
			}else if(palavra.equals("cinc")) {
				palavra = "cinco";
			}
		}
	}
}
