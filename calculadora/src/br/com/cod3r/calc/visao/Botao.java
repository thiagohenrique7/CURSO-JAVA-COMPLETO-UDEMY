package br.com.cod3r.calc.visao;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("serial")
public class Botao extends JButton{
public Botao(String texto,Color cor) {
	setText(texto);
	setOpaque(true);
	setBackground(cor);
	setForeground(Color.WHITE);
	setFont(new Font("courier", Font.PLAIN,28));
	setBorder(BorderFactory.createLineBorder(Color.BLACK));
}
}
