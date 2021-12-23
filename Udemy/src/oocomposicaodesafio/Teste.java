package oocomposicaodesafio;

public class Teste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente ("Maria");
		
		Compra compra1 = new Compra();
		compra1.adicionar("Caneta", 1,100);
//		Produto not = new Produto("Notebook",2000);
		compra1.adicionar(new Produto("Notebook",2000), 2);

		
		
		Compra compra2 = new Compra();
		compra2.adicionar("Caderno", 10,10);
		compra2.adicionar(new Produto("Impressora",1000), 1);
		
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
		
	}

}
