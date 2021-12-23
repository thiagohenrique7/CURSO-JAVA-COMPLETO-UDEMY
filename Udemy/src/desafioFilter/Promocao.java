package desafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Promocao {

	public static void main(String[] args) {
		Funcionarios f1 = new Funcionarios("Thiago",15,2);
		Funcionarios f2 = new Funcionarios("Pedro",20,8);
		Funcionarios f3 = new Funcionarios("Ana",25,1);
		Funcionarios f4 = new Funcionarios("José",2,1);
		Funcionarios f5 = new Funcionarios("Daniela",2,10);
		
		List <Funcionarios> funcionarios = Arrays.asList(f1,f2,f3,f4,f5);
		Consumer<String> print = System.out::println; 
		Predicate<Funcionarios> aprovadoVendas = f->f.numeroDeVendas>=15;
		Predicate<Funcionarios> aprovadoFaltas = f->f.faltas<=5;
		Function<Funcionarios, String> mensagemPromocao = f -> "Parabens " + f.nome + " você foi promovido(a)!!";
		
		funcionarios.stream()
		.filter(aprovadoVendas)
		.filter(aprovadoFaltas)
		.map(mensagemPromocao)
		.forEach(print);

	}

}
