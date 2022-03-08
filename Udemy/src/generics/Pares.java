package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C1 extends Number,V1> {
	private final Set<Par<C1,V1>> itens = new LinkedHashSet<>(); 
	//TreeSet e LinkedHashSet garante a ordem de inserção 
	// mas o TreeSet precisa de ter um Comparable
	//Set NÃO aceita repetição -> HashCode e Equals
	public void adicionar (C1 chave, V1 valor) {
		if(chave == null ) return; //sai do método;
		
		Par<C1,V1> novoPar = new Par<C1,V1>(chave,valor);
		
		
		
		itens.add(novoPar);
	}
	
	public V1 getValor (C1 chave) {
		if(chave == null ) return null;
		Optional<Par<C1,V1>> parOpcional = itens.stream()
				.filter(par-> chave.equals(par.getChave()))
				.findFirst();
		
		return parOpcional.isPresent()
				? parOpcional.get().getValor():null;
	}
	

}
