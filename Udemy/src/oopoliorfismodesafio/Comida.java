package oopoliorfismodesafio;

public abstract class Comida {
	protected double peso;
	public Comida(double peso) {
		setPeso(peso);
	}
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso>=0) {
		this.peso = peso;
	}
	}

}
