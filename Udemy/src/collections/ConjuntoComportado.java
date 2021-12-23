package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
//		   Set<String> lista = new HashSet<>();N�o garante a ordem de inser��o
		   SortedSet<String> lista = new TreeSet<>();//Garante a ordem de inser��o
	        
	        lista.add("Ana");
	        lista.add("Carlos");
	        lista.add("Luca");
	        lista.add("Pedro");
	        
	        lista.remove("Ana");
	        lista.add("Carlos");
	        lista.add("Luca");
	        lista.add("Pedro");
	        
	        for(String candidato:lista) {
	        	System.out.println(candidato);
	        }
	        
	        Set<Integer>nums = new HashSet<>();
	        nums.add(1);
	        nums.add(2);
	 
	        for(int n:nums) {
	        	System.out.println(n);
	        }
	}

}
