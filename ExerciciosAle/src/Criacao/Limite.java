package Criacao;



public class Limite {
	Cores cor;
	Pessoa pessoa;
	String seloManual = "Selo sexual ou Ralo";
	String seloMaquina = "Selo sexual ou Ralo";
	String limiteManual = "limite velho";
	String limiteDeMáquina = "limite novo";
	
	
	void limites(Cores cor) {
		if(cor.equals(cor.Azul)) {
			System.out.println("O limite é forte, mas alguém está cego");
		}else if(cor.equals(cor.Azulzinho)) {
			System.out.println("O limite é flexível");
		}
	}
	
	
}
