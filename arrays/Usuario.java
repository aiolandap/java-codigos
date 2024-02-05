package Fundamentos.arrays;

public class Usuario {
	String nome;
	String email;
	
	
	Usuario(){
		
	}
	public boolean equals(Object objeto) {
		if(objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
			//boolean nomeIgual = outro.nome == this.nome;
			boolean nomeIgual = outro.nome.equals(this.nome);
			//boolean emailIgual = outro.email == this.email;
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		}
		else{
			return false;
		}
	}
}
