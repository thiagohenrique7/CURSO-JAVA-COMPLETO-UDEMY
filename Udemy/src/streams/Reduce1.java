package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
	List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
	
	BinaryOperator<Integer> soma = (ac,n) -> ac+n;
	
	Integer total = nums.stream()
	.reduce(soma).get();
	
	System.out.println(total);
	
	Integer total2 = nums.parallelStream().reduce(100,soma);
	//O parallelStream() faz com que o valor inical 100 seja
	//chamado m�ltiplas vezes, para todas substreams em paralelo
	System.out.println(total2);
	
	Integer total3 = nums.stream().reduce(100,soma);
	System.out.println(total3);
	//Para obter o valor esperado basta chamar uma stream()
	//e o valor inicial ser� passado uma �nica vez 
	
	
	//Resultado foi um Opcional<Integer>...
	nums.stream()
		.filter(n->n>5)
		.reduce(soma)
		.ifPresent(System.out::println);
	}

	

}
