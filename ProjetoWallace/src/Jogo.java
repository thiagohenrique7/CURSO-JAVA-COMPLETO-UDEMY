import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Jogador j1 = new Jogador();
		Jogador j2 = new Jogador();
		Metodos metodos = new Metodos();
		// questao
		List<Pergunta> perguntas = new ArrayList<Pergunta>();
		Pergunta perg1 = new Pergunta();
		perg1.setEnunciadoP("Nesta instru��o, identifique o tipo das vari�veis.\\n\" + \"\\n\" + \"Student s = new Student();\"");
		perg1.setAlternativaA("A) String");
		perg1.setAlternativaB("B) null");
		perg1.setAlternativaC("C) Classe");
		perg1.setAlternativaD("D) Aluno");
		perg1.setAlternativaCorreta('b');

		Pergunta perg2 = new Pergunta();
		perg2.setEnunciadoP("Qual tem um valor padr�o nulo?");
		perg2.setAlternativaA("A) booleano");
		perg2.setAlternativaB("B) double");
		perg2.setAlternativaC("C) int");
		perg2.setAlternativaD("D) String");
		perg2.setAlternativaCorreta('a');

		Pergunta perg3 = new Pergunta();
		perg3.setEnunciadoP("O que � encapsulamento?");
		perg3.setAlternativaA("A) Uma t�cnica para incluir primitivas dentro de uma Lista de Matrizes.");
		perg3.setAlternativaB("B) Uma t�cnica para criar mais de um método principal.");
		perg3.setAlternativaC("C) Uma t�cnica de depura��o.");
		perg3.setAlternativaD("D) Uma t�cnica para limitar a visibilidade de uma classe para outra");
		perg3.setAlternativaCorreta('d');

		Pergunta perg4 = new Pergunta();
		perg4.setEnunciadoP("Qual � a op��o a seguir que consiste em um modificador de acesso?");
		perg4.setAlternativaA("A) final");
		perg4.setAlternativaB("B) static");
		perg4.setAlternativaC("C) private");
		perg4.setAlternativaD("D) void");
		perg4.setAlternativaCorreta('c');

		Pergunta perg5 = new Pergunta();
		perg5.setEnunciadoP("Os quatro pilares do paradigma de Orienta��o a Objetos s�o:");
		perg5.setAlternativaA("A) Abstra��o, Encapsulamento, Heran�a e Polimorfismo.");
		perg5.setAlternativaB("B) Heran�a, Polimorfismo, Classes e Objetos");
		perg5.setAlternativaC("C) Classes, Atributos, M�todos e Abstra��o");
		perg5.setAlternativaD("D) Sequenciamento, Procedimentos, Bibliotecas e Heran�a.");
		perg5.setAlternativaCorreta('a');

		Pergunta perg6 = new Pergunta();
		perg6.setEnunciadoP("Considerando os conceitos da UML para relacionamentos estendidos, de inclus�o e generaliza��o em casos de uso, � correto afirmar que:");
		perg6.setAlternativaA("A) relacionamentos de inclus�o s�o utilizados em diagramas para que o caso de uso base incorpore implicitamente o comportamento de outro caso de uso.");
		perg6.setAlternativaB("B) um relacionamento de inclus�o � utilizado para a modelagem da parte de um caso de uso que o usu�rio poder� considerar como um comportamento opcional do sistema.");
		perg6.setAlternativaC("C) a generaliza��o entre casos de uso � diferente da generaliza��o existente entre as classes. No primeiro caso, a generaliza��o significa que o caso de uso filho herda somente significado do caso de uso pai");
		perg6.setAlternativaD("D) um relacionamento estendido entre casos de uso significa que o caso de uso base incorpora implicitamente o comportamento de outro caso de uso em um local especificado indiretamente pelo caso de uso estendido.");
		perg6.setAlternativaCorreta('d');

		Pergunta perg7 = new Pergunta();
		perg7.setEnunciadoP("Para a an�lise e projeto de sistemas, podemos utilizar modelos de representa��o ou abstra��o da realidade para facilitar a compreens�o do problema e auxiliar no desenvolvimento de softwares. Um destes recursos � a UML que consiste em uma linguagem de nota��o representada por um conjunto de diagramas. Neste sentido, para que serve um diagrama de CASOS DE USO?");
		perg7.setAlternativaA("A) Descrever um cen�rio que mostra as funcionalidades do sistema do ponto de vista do usu�rio");
		perg7.setAlternativaB("B) Mostrar o fluxo de atividades em um �nico processo e como uma atividade depende da outra.");
		perg7.setAlternativaC("C) Escrever a estrutura de um sistema, apresentando suas classes, atributos, opera��es e as rela��es entre os objetos.");
		perg7.setAlternativaD("D) Agrupar dados sobre um mesmo assunto, armazenando assim diversos dados como documentos, endere�os, servi�os, etc.");
		perg7.setAlternativaCorreta('a');

		Pergunta perg8 = new Pergunta();
		perg8.setEnunciadoP("Ao ler um conjunto de casos de usos para um sistema novo, um desenvolvedor de software percebeu que eles descreviam como o gerente financeiro e o gerente administrativo colaboravam em um fluxo de tarefas que levava a cria��o do relat�rio anual da empresa.\\n\" + \"Para mapear esse fluxo de tarefas de forma adequada, o desenvolvedor deve escolher o diagrama UML de:");
		perg8.setAlternativaA("A) sequ�ncia");
		perg8.setAlternativaB("B) colabora��o");
		perg8.setAlternativaC("C) atividades");
		perg8.setAlternativaD("D) casos de uso");
		perg8.setAlternativaCorreta('c');

		Pergunta perg9 = new Pergunta();
		perg9.setEnunciadoP("O que � Modelagem de Software");
		perg9.setAlternativaA("A) Modelagem de software � a constru��o de um banco de dados para o sistema funcionar.");
		perg9.setAlternativaB("B) Modelagem de software � a atividade de construir modelos que expliquem as caracter�sticas ou o comportamento de um software ou de um sistema de software.");
		perg9.setAlternativaC("C) Modelagem de software � a programa��o do sistema usando linguagens de programa��o");
		perg9.setAlternativaD("D) Modelagem de software � a organiza��o e armazenagem de informa��es sobre um dom�nio espec�fico");
		perg9.setAlternativaCorreta('d');

		Pergunta perg10 = new Pergunta();
		perg10.setEnunciadoP("Na nota��o UML para descri��o de modelos de sistemas orientado a objetos, em cen�rios para elicita��o de requisitos, uma t�cnica utiliza uma ferramenta que identifica o tipo de intera��o, representado por elipses, e os agentes envolvidos, representados por bonecos.\\n\" + \"Essa ferramenta � conhecida por Diagrama de:");
		perg10.setAlternativaA("A) sequ�ncia");
		perg10.setAlternativaB("B) entidade");
		perg10.setAlternativaC("C) contexto");
		perg10.setAlternativaD("D) casos de uso");
		perg10.setAlternativaCorreta('d');

		perguntas.add(perg1);
		perguntas.add(perg2);
		perguntas.add(perg3);
		perguntas.add(perg4);
		perguntas.add(perg5);
		perguntas.add(perg6);
		perguntas.add(perg7);
		perguntas.add(perg8);
		perguntas.add(perg9);
		perguntas.add(perg10);
		
          
        System.out.println("------------------------ BEM VINDO AO JOGO Q&A ------------------------");
        System.out.println("[1] - Inicializar o jogo"); 
        System.out.println("[2] - Informa��es dos desenvolvedores"); 
        System.out.println("[3] - Explica��o do jogo"); 
        System.out.println("[4] - Sair"); 
        System.out.println("-----------------------------------------------------------------------\n");  
        
        System.out.println("Escolha uma op��o: ");
        int escolhamenu = entrada.nextInt();
        
        switch(escolhamenu) {
            
        case 1: 
           System.out.println("Vamos cadastrar os jogadores");
           metodos.cadastroJogador(j1);
           metodos.cadastroJogador(j2);
           System.out.println("Quem come�a o jogo � o jogador: " + metodos.jogadorInicial);
           System.out.println("");
           System.out.println("Agora cada um dever� escolher um personagem abaixo");
           metodos.mostrarPersonagem();
           metodos.escolherPersonagem();
           
        
            break;          
           
        
        case 2:
            System.out.println("-------------------- INFORMA��O DOS DESENVOLVEDORES --------------------");
            System.out.println("Este jogo foi desenvolvido pelos alunos:");
            System.out.println("- Henrique Wallace"); 
            System.out.println("- Iury Ribeiro"); 
            System.out.println("- Lucas Henrique");
            System.out.println("- Rafael Pires");
            System.out.println("- Victor Silva"); 
            System.out.println("Estudantes dos cursos de tecnologia do Centro Universit�rio UNA."); 
            System.out.println("-----------------------------------------------------------------------");
            break;
            
        case 3:
            System.out.println("------------------------ EXPLICA��O DO JOGO ------------------------");
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

        metodos.partida();
         
        
        
        
        
	


	
	
	
	
	
	entrada.close();
	}

}
