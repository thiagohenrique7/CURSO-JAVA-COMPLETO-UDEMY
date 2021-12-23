package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		Supplier<List<String>> umaLista = 
				() -> Arrays.asList("Ana","Bia","Lia","Gui");
				
				System.out.println(umaLista.get());

				Supplier<Object> umaLista2 = 
						() -> Arrays.asList("Ana","Bia","Lia","Gui");
						
						System.out.println(umaLista2.get());
						
//						Quanto mais específico melhor!!
	}

}
