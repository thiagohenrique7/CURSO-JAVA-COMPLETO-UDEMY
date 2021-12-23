package oodesafio;

public class Carro {
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual =0;
	private int delta = 5;
	
	public int getDelta() {
		return delta;
	}


	public void setDelta(int delta) {
		this.delta = delta;
	}


	Carro(int velocidadeMaxima){
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	
	protected void acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
		this.velocidadeAtual += getDelta();
		}
		}
		
	protected void frear () {
		if(this.velocidadeAtual>0 && this.velocidadeAtual<=5) {
		this.velocidadeAtual -= this.velocidadeAtual;
		}
		else if(this.velocidadeAtual>5) {
			this.velocidadeAtual -= 5;
		}else {
			System.out.println("Carro parado!");
		}
	}
	
	public String toString() {
		return "Velocidade atual é: " +velocidadeAtual + "KM/H";
	}

}
