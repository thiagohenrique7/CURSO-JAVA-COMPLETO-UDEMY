package oocomposicao;

public class Carro {
//Motor motor = new Motor();
	
	final Motor motor;
	Carro (){
		this.motor = new Motor (this);
	}

void acelerar() {
	if(this.motor.fatorInjecao<2.6) {
		motor.fatorInjecao += 0.4;		
	}
}

void frear() {
	if(this.motor.fatorInjecao>0.5) {
		motor.fatorInjecao -= 0.4;		
	}
}
void ligar() {
	motor.ligado=true;
}
void desligar() {
	motor.ligado = false;
}

boolean estaLigado() {
	return this.motor.ligado;
}
}
