package oocomposicaodesafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	final List<Item> itens = new ArrayList<>();
	
//	public void adicionar (Item item) {
//		this.itens.add(item);
//		
//	}
	
	public void adicionar (Produto p, int quantidade) {
		this.itens.add(new Item(p,quantidade));
	}
	public void adicionar (String nome, double preco, int qntde) {
		var produto = new Produto(nome,preco);
		this.itens.add(new Item(produto,qntde));
	}
	
	public double obterValorTotal () {
		double total = 0.0;
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
		
	}

}
