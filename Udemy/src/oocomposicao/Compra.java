package oocomposicao;

import java.util.ArrayList;

public class Compra {
	String cliente;
	ArrayList<Item> itens = new ArrayList <Item> ();
	
	void adicionar (Item item) {
		this.itens.add(item);
		item.compra = this;
	}
	
	void adicionar (String nome,int quantidade,double preco) {
		this.adicionar(new Item(nome,quantidade,preco));
	
	}
	double obterValorTotal() {
		double total = 0;
		for(Item item:itens) {
			total+= item.quantidade * item.preco;
		}
		return total;
	}

}
