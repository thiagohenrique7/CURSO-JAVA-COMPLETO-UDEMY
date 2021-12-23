package oo;

 public class Heroi extends Jogador {
	
	Heroi (int x, int y){
		super(x,y);
	}
	
//	boolean atacar(Jogador oponente) {
//		int deltaX = Math.abs(x - oponente.x);
//		int deltaY = Math.abs(y - oponente.y);
//		
//		if(deltaX == 0 && deltaY == 1) {
//			oponente.vida -=20;
//			return true;
//		}else if(deltaX == 1 && deltaY == 0) {
//			oponente.vida -=20;			
//			return true;
//		}else {
//			return false;
//		}
//		
//	}
	boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;
		
	}

}
