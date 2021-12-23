import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Metodos {
	
	
	Jogador j1 = new Jogador();
	Jogador j2 = new Jogador();
	
	List<Personagem> personagens =  new ArrayList<Personagem>(Arrays.asList(new Personagem ("Batman", "Frieza","Riqueza"),
			new Personagem ("CJ", "Arma","Força"),
			new Personagem ("SubZero", "Congelar","Magia"),
			 new Personagem ("Homem Aranha", "Lançar Teia","Visão Noturna"),
			 new Personagem ("Kratos", "SemiDeus","Velocidade"),
			 new Personagem ("Homem De Ferro", "Inteligência","Armadura")));
	
	Personagem[] personagensEscolhidos =  new Personagem[2];
	
	Scanner entrada = new Scanner(System.in);
	
	public void cadastroJogador(Jogador j) {
        System.out.println("------------------------ CADASTRO DOS JOGADORES ------------------------");
        
        System.out.println("Digite seu nome: ");
        j.setNome(entrada.next());
        
        System.out.println("Digite o seu apelido: ");
        j.setApelido(entrada.next());
        
        System.out.println("Digite o seu e-mail: ");
        j.setEmail(entrada.next());
        
        System.out.println("Digite o seu telefone: ");
        j.setTelefone(entrada.next());
        
        System.out.println("CADASTRADO COM SUCESSO!");
        
        System.out.println("---------------------\n");
}
	public int escolheOrdemPersonagem() {
	       Random r = new Random();
	       return r.nextInt(2)+1;
	       
	   }
	
	public int jogadorInicial = escolheOrdemPersonagem();
	

	
	public void mostrarPersonagem() {
		
		for(int i =0;i<personagens.size();i++) {
			System.out.println("[" + (i+1) +"]" + personagens.get(i));
		}
	}
		
	
	public void escolherPersonagem() {
		if(jogadorInicial == 1) {
			System.out.println("Jogador 1, escolha o personagem: ");
			int escolha = entrada.nextInt();
			personagens.get(escolha-1).setStatus(true); 
			personagensEscolhidos[0] = personagens.get(escolha -1);
			personagens.remove((escolha -1));
			System.out.println("Agora é a vez do jogador 2 escolher o personagem: ");
			mostrarPersonagem();
			int escolha2 = entrada.nextInt();
			personagens.get(escolha2-1).setStatus(true); 
			personagensEscolhidos[1] = personagens.get(escolha2 -1);
			
			
		} else {
			System.out.println("Jogador 2, escolha o personagem: ");
			int escolha = entrada.nextInt();
			personagens.get(escolha-1).setStatus(true);
			personagensEscolhidos[1] = personagens.get(escolha -1);
			personagens.remove((escolha -1));
			mostrarPersonagem();
			System.out.println("Agora é a vez do jogador 1 escolher o personagem: ");
			int escolha2 = entrada.nextInt();
			personagens.get(escolha2-1).setStatus(true);
			personagensEscolhidos[0] = personagens.get(escolha2 -1);
		}
	
			
		}
	public void partida () {
		System.out.println("VAMOS INICIAR A PARTIDA");
		System.out.println("Vamos apresentar os dois personagens: ");
		System.out.println("Personagem 1: " + personagensEscolhidos[0]);
		System.out.println("Personagem 2: " +personagensEscolhidos[1]);
		System.out.println("");
		System.out.println("VAMOS INICIAR A PARTIDA: ");
			
	}
	}
	


