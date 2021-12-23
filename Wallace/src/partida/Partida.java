package partida;
import java.util.Scanner;
public class Partida {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Jogador j1 = new Jogador();
        Jogador j2 = new Jogador();
        Metodos cj1 = new Metodos();   
        Metodos cj2 = new Metodos();
        Metodos pers1 = new Metodos();
        Metodos pers2 = new Metodos();
        Perguntas perg = new Perguntas();
        
                   
        int opcao = 0;
        while (opcao != 4) {
          
        System.out.println("------------------------ BEM VINDO AO JOGO Q&A ------------------------");
        System.out.println("[1] - Inicializar o jogo"); 
        System.out.println("[2] - Informações dos desenvolvedores"); 
        System.out.println("[3] - Explicação do jogo"); 
        System.out.println("[4] - Sair"); 
        System.out.println("-----------------------------------------------------------------------\n");  
        
        System.out.println("Escolha uma opção: ");
        int escolhamenu = entrada.nextInt();
        
        switch(escolhamenu) {
            
        case 1: 
            cj1.cadastroJogador1();
            cj2.cadastroJogador2();
            pers1.escolhePersonagem();
            pers2.escolhePersonagem2();
            System.out.println("Quem começará o jogo será o Jogador " + cj1.escolheOrdemPersonagem());
            System.out.println("\n-------------------- PERGUNTAS --------------------");
            
            
            break;          
           
        
        case 2:
            System.out.println("-------------------- INFORMAÇÃO DOS DESENVOLVEDORES --------------------");
            System.out.println("Este jogo foi desenvolvido pelos alunos:");
            System.out.println("- Henrique Wallace"); 
            System.out.println("- Iury Ribeiro"); 
            System.out.println("- Lucas Henrique");
            System.out.println("- Rafael Pires");
            System.out.println("- Victor Silva"); 
            System.out.println("Estudantes dos cursos de tecnologia do Centro Universitário UNA."); 
            System.out.println("-----------------------------------------------------------------------");
            break;
            
        case 3:
            System.out.println("------------------------ EXPLICAÇÃO DO JOGO ------------------------");
            System.out.println("O jogo deve permitir uma batalha de 2 jogadores.");
            System.out.println("Os jogadores escolhem os personagens cadastrados.");
            System.out.println("O jogador que irá começar o jogo será escolhido de forma aleatória.");
            System.out.println("A jogada deve ser intercalada entre os 2 jogadores.");
            System.out.println("O jogo é composto por 10 perguntas.");
            System.out.println("Se o jogador errar uma pergunta, a vida é reduzida.");
            System.out.println("Ganha o jogo quem acertar o maior número de perguintas.");
            System.out.println("--------------------------------------------------------------------");
            break;
            
        default:
            System.out.println("-------------------------- FIM DO JOGO ----------------------------");
            System.exit(0);
    }
        }
    }
    
}
