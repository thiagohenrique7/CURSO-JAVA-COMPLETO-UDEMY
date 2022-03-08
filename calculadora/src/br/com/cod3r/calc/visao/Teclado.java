package br.com.cod3r.calc.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.cod3r.calc.modelo.Memoria;
@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener {
	private final Color COR_CINZA_ESCURO = new Color (68,68,68);
	private final Color COR_CINZA_CLARO = new Color (99,99,99);
	private final Color COR_LARANJA = new Color (242,163,60);

	public Teclado() {
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		setLayout(layout);//GridLayout -> bot�es do mesmo tamanho!
		c.fill = GridBagConstraints.BOTH; //Preenche o bot�o nas duas dire��es!
		c.weightx = 1;//Peso relacionado ao eixo X, ocupar o eixo X completamente ou n�o! 
		c.weighty = 1;
//		GridBagLayout = mais flex�vel// gridy = linha , gridx= coluna
//		LINHA 1
		c.gridwidth = 2; //Largura do grid.
		adicionarBotao("AC",COR_CINZA_ESCURO,c,0,0);
		c.gridwidth = 1;
		adicionarBotao("�",COR_CINZA_ESCURO,c,2,0);
		adicionarBotao("/",COR_LARANJA,c,3,0);
//		LINHA 2
		adicionarBotao("7",COR_CINZA_CLARO,c,0,1);
		adicionarBotao("8",COR_CINZA_CLARO,c,1,1);
		adicionarBotao("9",COR_CINZA_CLARO,c,2,1);
		adicionarBotao("X",COR_LARANJA,c,3,1);
//		LINHA 3
		adicionarBotao("4",COR_CINZA_CLARO,c,0,2);
		adicionarBotao("5",COR_CINZA_CLARO,c,1,2);
		adicionarBotao("6",COR_CINZA_CLARO,c,2,2);
		adicionarBotao("-",COR_LARANJA,c,3,2);
//		LINHA 4
		adicionarBotao("1",COR_CINZA_CLARO,c,0,3);
		adicionarBotao("2",COR_CINZA_CLARO,c,1,3);
		adicionarBotao("3",COR_CINZA_CLARO,c,2,3);
		adicionarBotao("+",COR_LARANJA,c,3,3);
//		LINHA 5
		c.gridwidth = 2;
		adicionarBotao("0",COR_CINZA_CLARO,c,0,4);
		c.gridwidth = 1;
		adicionarBotao(",",COR_CINZA_CLARO,c,2,4);
		adicionarBotao("=",COR_LARANJA,c,3,4);
		
	}

	private void adicionarBotao(String texto, Color cor, GridBagConstraints c
			, int x, int y) {
		c.gridx=x;
		c.gridy=y;
		Botao botao = new Botao(texto,cor);
		botao.addActionListener(this);
		add(botao,c);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) { //A��o foi executada
		if(e.getSource()instanceof JButton) { //conferindo se foi um bot�o que sofreu o evento
			JButton botao = (JButton) e.getSource(); //pegando qual bot�o sofreu o evento			
//			System.out.println(botao.getText());//pegando o texto do bot�o
			Memoria.getInstancia().processarComando(botao.getText());
		}
		
	}
	
}
