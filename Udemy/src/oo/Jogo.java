package oo;

public class Jogo {

	public static void main(String[] args) {

		Monstro monstro = new Monstro();
		
		monstro.x = 10;
		monstro.y= 10;
		
		Heroi heroi = new Heroi(10,11);
		
		heroi.x = 10;
		heroi.y= 11;
	
		
		
		System.out.println("Vida do monstro: "+monstro.vida);
		System.out.println("Vida do herói: "+ heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		System.out.println("Vida do monstro: "+monstro.vida);
		System.out.println("Vida do herói: "+ heroi.vida);
	}

}
