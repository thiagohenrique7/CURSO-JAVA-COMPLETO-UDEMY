package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue <String> fila = new LinkedList<>();
		
		fila.add("Ana");//gera um erro caso n�o consiga adicionar
		fila.offer("Bia");//retorna false caso n�o consiga adicionar
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafael");
		fila.offer("Gui");
		
		System.out.println(fila.peek());//retorna null caso n�o consiga acessar
		System.out.println(fila.peek());
		System.out.println(fila.element());//gera um errocaso n�o consiga acessar
		System.out.println(fila.element());
		
//		fila.clear();
//		fila.size();
//		fila.isEmpty();
//		fila.contains();
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}

}
