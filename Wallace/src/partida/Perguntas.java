package partida;

import java.util.ArrayList;

import Alternativas;

public class Perguntas {
    
    private String enunciado;
    private ArrayList<Alternativas> alternativas;
    
    public Perguntas() {
        this.alternativas = new ArrayList();
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public ArrayList<Alternativas> getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(ArrayList<Alternativas> alternativas) {
        this.alternativas = alternativas;
    }

     
    @Override
    public String toString() {
        return "Pergunta: " + getEnunciado();
    }
    
    public void preencherPerguntas(ArrayList<Perguntas> perguntas) {
        int n = 10;
        Perguntas p = new Perguntas();
        ArrayList<Alternativas> alternativas = new ArrayList();
        
        p.setEnunciado("Nesta instrução, identifique o tipo das variáveis.\n" + "\n" + "Student s = new Student();");
        Alternativas a = new Alternativas("String", false);
        Alternativas b = new Alternativas("null", true);
        Alternativas c = new Alternativas("Classe", false);
        Alternativas d = new Alternativas("Aluno", false);
        alternativas.add(a);
        alternativas.add(b);
        alternativas.add(c);
        alternativas.add(d);
        p.setAlternativas(alternativas);
        alternativas.clear();
        
        Perguntas p1 = new Perguntas();
        
        p1.setEnunciado("Qual tem um valor padrão nulo?");
        Alternativas a1 = new Alternativas("booleano", true);
        Alternativas b1 = new Alternativas("double", false);
        Alternativas c1 = new Alternativas("int", false);
        Alternativas d1 = new Alternativas("String", false);
        alternativas.add(a1);
        alternativas.add(b1);
        alternativas.add(c1);
        alternativas.add(d1);
        p.setAlternativas(alternativas);
        alternativas.clear();
        
        Perguntas p2 = new Perguntas();
        
        p2.setEnunciado("O que é encapsulamento?");
        Alternativas a2 = new Alternativas("Uma técnica para incluir primitivas dentro de uma Lista de Matrizes.", false);
        Alternativas b2 = new Alternativas("Uma técnica para criar mais de um método principal.", false);
        Alternativas c2 = new Alternativas("Uma técnica de depuração.", false);
        Alternativas d2 = new Alternativas("Uma técnica para limitar a visibilidade de uma classe para outra.", true);
        alternativas.add(a2);
        alternativas.add(b2);
        alternativas.add(c2);
        alternativas.add(d2);
        p.setAlternativas(alternativas);
        alternativas.clear();
        
        Perguntas p3 = new Perguntas();
        
        p3.setEnunciado("Qual é a opção a seguir que consiste em um modificador de acesso?");
        Alternativas a3 = new Alternativas("final", false);
        Alternativas b3 = new Alternativas("static", false);
        Alternativas c3 = new Alternativas("private", true);
        Alternativas d3 = new Alternativas("void", false);
        alternativas.add(a3);
        alternativas.add(b3);
        alternativas.add(c3);
        alternativas.add(d3);
        p.setAlternativas(alternativas);
        alternativas.clear();
        
        Perguntas p4 = new Perguntas();
        
        p4.setEnunciado("Os quatro pilares do paradigma de Orientação a Objetos são:");
        Alternativas a4 = new Alternativas("Abstração, Encapsulamento, Herança e Polimorfismo.", false);
        Alternativas b4 = new Alternativas("Herança, Polimorfismo, Classes e Objetos.", false);
        Alternativas c4 = new Alternativas("Classes, Atributos, Métodos e Abstração.", true);
        Alternativas d4 = new Alternativas("Sequenciamento, Procedimentos, Bibliotecas e Herança.", false);
        alternativas.add(a4);
        alternativas.add(b4);
        alternativas.add(c4);
        alternativas.add(d4);
        p.setAlternativas(alternativas);
        alternativas.clear();
        
        Perguntas p5 = new Perguntas();
        
        p4.setEnunciado("Considerando os conceitos da UML para relacionamentos estendidos, de inclusão e generalização em casos de uso, é correto afirmar que:");
        Alternativas a5 = new Alternativas("relacionamentos de inclusão são utilizados em diagramas para que o caso de uso base incorpore implicitamente o comportamento de outro caso de uso.", false);
        Alternativas b5 = new Alternativas("um relacionamento de inclusão é utilizado para a modelagem da parte de um caso de uso que o usuário poderá considerar como um comportamento opcional do sistema.", false);
        Alternativas c5 = new Alternativas("a generalização entre casos de uso é diferente da generalização existente entre as classes. No primeiro caso, a generalização significa que o caso de uso filho herda somente significado do caso de uso pai.", false);
        Alternativas d5 = new Alternativas("um relacionamento estendido entre casos de uso significa que o caso de uso base incorpora implicitamente o comportamento de outro caso de uso em um local especificado indiretamente pelo caso de uso estendido.", true);
        alternativas.add(a5);
        alternativas.add(b5);
        alternativas.add(c5);
        alternativas.add(d5);
        p.setAlternativas(alternativas);
        alternativas.clear();
        
        Perguntas p6 = new Perguntas();
        
        p6.setEnunciado("");
        Alternativas a6 = new Alternativas("Descrever um cenário que mostra as funcionalidades do sistema do ponto de vista do usuário", true);
        Alternativas b6 = new Alternativas("Mostrar o fluxo de atividades em um único processo e como uma atividade depende da outra.", false);
        Alternativas c6 = new Alternativas("Escrever a estrutura de um sistema, apresentando suas classes, atributos, operações e as relações entre os objetos.", false);
        Alternativas d6 = new Alternativas("Agrupar dados sobre um mesmo assunto, armazenando assim diversos dados como documentos, endereços, serviços, etc.", false);
        alternativas.add(a6);
        alternativas.add(b6);
        alternativas.add(c6);
        alternativas.add(d6);
        p.setAlternativas(alternativas);
        alternativas.clear();
        
        Perguntas p7 = new Perguntas();
        
        p7.setEnunciado("Ao ler um conjunto de casos de usos para um sistema novo, um desenvolvedor de software percebeu que eles descreviam como o gerente financeiro e o gerente administrativo colaboravam em um fluxo de tarefas que levava à criação do relatório anual da empresa.\n" + "Para mapear esse fluxo de tarefas de forma adequada, o desenvolvedor deve escolher o diagrama UML de:");
        Alternativas a7 = new Alternativas("sequência", false);
        Alternativas b7 = new Alternativas("colaboração", false);
        Alternativas c7 = new Alternativas("atividades", true);
        Alternativas d7 = new Alternativas("casos de uso", false);
        alternativas.add(a7);
        alternativas.add(b7);
        alternativas.add(c7);
        alternativas.add(d7);
        p.setAlternativas(alternativas);
        alternativas.clear();
        
        Perguntas p8 = new Perguntas();
        
        p8.setEnunciado("Qual é a opção a seguir que consiste em um modificador de acesso?");
        Alternativas a8 = new Alternativas(" Modelagem de software é a construção de um banco de dados para o sistema funcionar.", false);
        Alternativas b8 = new Alternativas("Modelagem de software é a atividade de construir modelos que expliquem as características ou o comportamento de um software ou de um sistema de software.", true);
        Alternativas c8 = new Alternativas("Modelagem de software é a programação do sistema usando linguagens de programação.", false);
        Alternativas d8 = new Alternativas("Modelagem de software é a organização e armazenagem de informações sobre um domínio específico.", false);
        alternativas.add(a8);
        alternativas.add(b8);
        alternativas.add(c8);
        alternativas.add(d8);
        p.setAlternativas(alternativas);
        alternativas.clear();
        
        Perguntas p9 = new Perguntas();
        
        p9.setEnunciado("Na notação UML para descrição de modelos de sistemas orientado a objetos, em cenários para elicitação de requisitos, uma técnica utiliza uma ferramenta que identifica o tipo de interação, representado por elipses, e os agentes envolvidos, representados por bonecos.\n" + "Essa ferramenta é conhecida por Diagrama de:");
        Alternativas a9 = new Alternativas("sequência", false);
        Alternativas b9 = new Alternativas("entidades", false);
        Alternativas c9 = new Alternativas("contexto", false);
        Alternativas d9 = new Alternativas("casos de uso", true);
        alternativas.add(a9);
        alternativas.add(b9);
        alternativas.add(c9);
        alternativas.add(d9);
        p.setAlternativas(alternativas);
        alternativas.clear();
                
        for (int i = 0; i < n; i++) {
            perguntas.add(p);
        }
    }
}
