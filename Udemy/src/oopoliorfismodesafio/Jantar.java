package oopoliorfismodesafio;

public class Jantar {

	public static void main(String[] args) {
		Pessoa convidado = new Pessoa(100);
		
		Comida ingrediente1 = new Arroz(0.25);
		Comida ingrediente2 = new Feijao(0.18);
		Comida ingrediente3 = new Sorvete(0.50);
//		Comida ingrediente4 = new Comida(0.100);
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
//		convidado.comer(ingrediente4);
		
		System.out.println(convidado.getPeso());
		convidado.comer(ingrediente3);
		System.out.println(convidado.getPeso());
	}

}
