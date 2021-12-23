package partida;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Metodos {
   
    Jogador j1 = new Jogador();
    Jogador j2 = new Jogador();
    
    
    Scanner input = new Scanner(System.in);
    
   ArrayList<Perguntas> perguntas;
   Perguntas p;
   
   public int escolheOrdemPersonagem() {
       Random r = new Random();
       return r.nextInt(2)+1;
   }
   
   public Metodos() {
       this.perguntas = new ArrayList<>();
       this.p = new Perguntas();
       p.preencherPerguntas(perguntas);
   }
   
   public void mostrarPergunta() {
       System.out.println("Pergunta: ");
   }
   
   public void setandoStatusPersonagem(Personagem p) {
       p.setStatus(true);
   }
   
   public void escolhePersonagem() {
       ArrayList<Personagem> pers = new ArrayList<>();
       ArrayList<String> hab = new ArrayList<>();
       
       
       pers.add(new Personagem("Batman [Frieza, ser rico]"));
       pers.add(new Personagem("CJ [Possui arma, força]"));
       pers.add(new Personagem("Sub Zero [Congelar, magia]"));
       pers.add(new Personagem("Homem Aranha [Lançar teia, visão noturna]"));
       pers.add(new Personagem("Kratos [Poder de um deus, velocidade]"));
       
       System.out.println("Personagens");
       int cont = 1;
       for (Personagem pe : pers) {
           System.out.println("[" + cont + "]");
           
           if (!pe.isStatus()) {
               System.out.println(pe.getNome());
           }
           cont++;
       }
       
       System.out.println("Jogador 1, escolha um personagem:");
       int opcao = input.nextInt();
       
       switch (opcao) {
           
           case 1:
           pers.get(0).setStatus(true);
           
           break;
           
           case 2:
           pers.get(1).setStatus(true);
           
           break;
           
           case 3:
           pers.get(2).setStatus(true);
           
           break;
           
           case 4:
           pers.get(3).setStatus(true);
           
           break;
           
           case 5:
           pers.get(4).setStatus(true);
                     
           break;
                      
           default:
               System.out.println("ERRO! Digite o número válido de um personagem.");
               
       }
           System.out.println("------------------------------------------------");    
   }
   
   public void escolhePersonagem2() {
       ArrayList<Personagem> pers = new ArrayList<>();
       ArrayList<String> hab = new ArrayList<>();
       
       
       pers.add(new Personagem("Batman [Frieza, ser rico]"));
       pers.add(new Personagem("CJ [Possui arma, força]"));
       pers.add(new Personagem("Sub Zero [Congelar, magia]"));
       pers.add(new Personagem("Homem Aranha [Lançar teia, visão noturna]"));
       pers.add(new Personagem("Kratos [Poder de um deus, velocidade]"));
       
       System.out.println("Personagens");
       int cont = 1;
       for (Personagem pe : pers) {
           System.out.println("[" + cont + "]");
           
           if (!pe.isStatus()) {
               System.out.println(pe.getNome());
           }
           cont++;
       }
       
       System.out.println("Jogador 2, escolha um personagem:");
       int opcao = input.nextInt();
       
       switch (opcao) {
           
           case 1:
           pers.get(0).setStatus(true);
           
           break;
           
           case 2:
           pers.get(1).setStatus(true);
           
           break;
           
           case 3:
           pers.get(2).setStatus(true);
           
           break;
           
           case 4:
           pers.get(3).setStatus(true);
           
           break;
           
           case 5:
           pers.get(4).setStatus(true);
                     
           break;
                      
           default:
               System.out.println("ERRO! Digite o número válido de um personagem.");
       }
           System.out.println("------------------------------------------------");    
   }
   
   public void cadastroJogador1() {
            System.out.println("------------------------ CADASTRO DOS JOGADORES ------------------------");
            System.out.println("----- Jogador 1 -----");
            
            System.out.println("Digite seu nome: ");
            j1.setNome(input.next());
            
            System.out.println("Digite o seu apelido: ");
            j1.setApelido(input.next());
            
            System.out.println("Digite o seu e-mail: ");
            j1.setEmail(input.next());
            
            System.out.println("Digite o seu telefone: ");
            j1.setTelefone(input.next());
            
            System.out.println("---------------------\n");
    }
    
    public void cadastroJogador2() {
            System.out.println("----- Jogador 2 -----");
            System.out.println("Digite seu nome: ");
            j2.setNome(input.next());
            
            System.out.println("Digite o seu apelido: ");
            j2.setApelido(input.next());
            
            System.out.println("Digite o seu e-mail: ");
            j2.setEmail(input.next());
            
            System.out.println("Digite o seu telefone: ");
            j2.setTelefone(input.next());
            
            System.out.println("---------------------"); 
    }
}

   

