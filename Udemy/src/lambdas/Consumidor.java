package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer <Produto> imprimirNome = p -> System.out.println(p.nome);
        
        Produto p1 = new Produto ("Caneta",12.32,0.09);
        Produto p2 = new Produto ("Caderno",19.90,0.03);
        Produto p3 = new Produto ("Notebook",2987.99,0.23);
        Produto p4 = new Produto ("Borracha",7.80,0.18);
        Produto p5 = new Produto ("Lápis",4.39,0.19);
        imprimirNome.accept(p1);
        
        List <Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5); 
        
        produtos.forEach(imprimirNome);
        produtos.forEach(p-> System.out.println(p.preco));
        produtos.forEach(System.out::println); 
      
    }
    
}