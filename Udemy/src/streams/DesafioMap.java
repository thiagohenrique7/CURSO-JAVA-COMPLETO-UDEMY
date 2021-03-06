package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DesafioMap {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Consumer<String> print = System.out::print;
		
//		nums.stream()
//		.map( n -> Integer.toBinaryString(n) + " ")
//		.forEach(print);
//		
//		nums.stream()
//		.map(r->new StringBuilder(r).reverse().toString())
//		.forEach(print);

		nums.stream().map( n -> Integer.toBinaryString(n) + " ")
		.map(r->new StringBuilder(r).reverse().toString())
		.map(r->Integer.parseInt(r,2))
		.forEach(System.out::print);
		
		
		
		
	
	}

}
