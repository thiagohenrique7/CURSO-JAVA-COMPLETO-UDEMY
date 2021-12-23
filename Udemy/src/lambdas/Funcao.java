package lambdas;

import java.util.function.Function;

public class Funcao {
	 public static void main(String[] args) {
	Function <Integer,String> parOuImpar 
    = numero -> numero % 2 == 0? "Par":"Ímpar";

System.out.println(parOuImpar.apply(32));

Function <String,String> oResultadoe =
    valor -> "O resultado é: " +valor;
Function <String,String> empolgado =
    valor -> valor + "!!!";

Function <String,String> duvida=
        valor -> valor + "???";
    
String resultadoFinal = parOuImpar
    .andThen(oResultadoe)
    .andThen(empolgado)
    .apply(32);

String resultadoFinal2 = parOuImpar
    .andThen(oResultadoe)
    .andThen(duvida)
    .apply(32);

System.out.println(resultadoFinal2);
System.out.println(resultadoFinal);




}

}
