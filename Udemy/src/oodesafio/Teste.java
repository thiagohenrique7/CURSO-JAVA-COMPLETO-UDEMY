package oodesafio;

public class Teste {

	public static void main(String[] args) {
		Carro c1 = new Civic(200);
		Carro b1 = new Bmw(250);
		Ferrari f1 = new Ferrari(300);
		
		c1.acelerar();
		b1.acelerar();
		f1.acelerar();
		
		c1.frear();
		b1.frear();
		f1.frear();
		c1.frear();
		b1.frear();
		f1.frear();
		
		System.out.println(c1);
		System.out.println(b1);
		System.out.println(f1);
//		f1.ligarAr();
//		f1.acelerar();
		f1.ligarTurbo();
		f1.acelerar();
		System.out.println(f1);
		System.out.println(f1.nivelDoAr());
	}

}
