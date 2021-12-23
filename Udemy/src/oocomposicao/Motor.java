package oocomposicao;

public class Motor {
	final Carro carro;
	boolean ligado = false;
	double fatorInjecao=1;
	
	Motor(Carro carro){
		this.carro = carro;
	}
	int giros() {
		if(!ligado) {
			return 0;
		}
		return (int) Math.round(fatorInjecao* 3000);
		
		
	}
	

}
