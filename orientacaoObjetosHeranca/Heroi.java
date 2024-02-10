package Fundamentos.orientacaoObjetosHeranca;

public class Heroi extends Jogador {
	/*boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 20;
			return true;
		}else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 20;
			return true;
		}
		
		return false;*/
	Heroi(int x, int y){
		super(x,y);
	}//chama o construtor padrão
	
	boolean atacar(Jogador oponente) {
		boolean ataquenovo = (super.atacar(oponente));
		boolean ataquenovo2 = (super.atacar(oponente));
		boolean ataquenovo3 = (super.atacar(oponente));
		return ataquenovo|| ataquenovo2||ataquenovo3;
	}
}
