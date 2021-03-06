package lambdas;

import java.text.DecimalFormat;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		Produto p = new Produto("iPad", 3235.89, 0.13);
		BinaryOperator<Double> precoComDesconto = (preco, desconto) -> {
			double descontoFinal = preco * desconto;
			return preco - descontoFinal;
		};
		UnaryOperator<Double> imposto 
		= preco -> preco >= 2500 ? preco + (preco * 0.085) : preco;
		UnaryOperator<Double> frete 
		= preco -> preco >= 3000 ? preco + 100.0 : preco + 50.0;

		double precoFinal = precoComDesconto
				.andThen(imposto)
				.andThen(frete)
				.apply(p.preco, p.desconto);

		DecimalFormat arredondar = new DecimalFormat("###.##");
		System.out.println("R$" + arredondar.format(precoFinal));

		System.out.println("RESOLU??O DO PROFESSOR");
		
		Function<Produto, Double> precoComDesconto2 
		= prod -> prod.preco * (1 - prod.desconto);
		UnaryOperator<Double> imposto2 
		= preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete2 
		= preco -> preco >= 3000 ? preco + 100.0 : preco + 50.0;
		UnaryOperator<Double> arredondar2 
		= preco -> Double.parseDouble(String.format("%.3f", preco));
		Function<Double, String> formatar
		= preco -> ("R$" + preco).replace(".", ",");

		String precoFinal2 = precoComDesconto2
				.andThen(imposto2)
				.andThen(frete2)
				.andThen(arredondar2)
				.andThen(formatar)
				.apply(p);
		
		System.out.println("O pre?o final ?: " + precoFinal2);

//		DoubleBinaryOperator precoComDesconto = 
//				(preco,desconto) -> {
//					double descontoFinal = preco*desconto;
//					return preco-descontoFinal;
//				};

//System.out.println(precoComDesconto.apply
//		(p.preco,p.desconto));	

//		BiFunction<Double,Double,Double> precoComDesconto = 
//				(preco,desconto) -> {
//					double descontoFinal = preco*desconto;
//					return preco-descontoFinal;
//				};
//				
//			System.out.println(precoComDesconto.apply(p.preco,p.desconto));
	}

}
