package Classe;

public class Data {
	int dia;// atributos do objeto
	String mes;
	int ano;
	
	Data(){
		//Valores padrões
		//byte, short, int, long -> 0
		//float, double -> 0.0
		//boolean -> false
		//char -> "\u0000"
		//Objetos apontam para null
		//String s = null;
		
		//dia = 01;
		//mes = "Janeiro";
		//ano = 1970;
		this(01,"Janeiro", 1970);//Usar this como método muda apenas a questão da assinatura do construtor
		//Só pode ser usada dentro de um construtor para chamar outro construtor
	}
	
	/*Data(int diadefault, String mesdefault, int anodefault){
		dia = diadefault;
		mes = mesdefault;
		ano = anodefault;
	}*/
	Data(int dia, String mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	String dataFormatada(){
		String resultado; //variável local, dentro do método
		resultado = (Integer.toString(dia) + "/" + this.mes + "/" + ano);
		return resultado;
	}
}
