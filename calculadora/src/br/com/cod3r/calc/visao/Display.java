package br.com.cod3r.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;

import br.com.cod3r.calc.modelo.Memoria;
import br.com.cod3r.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {
	
	private final JLabel label;
	
	public Display() {
		Memoria.getInstancia().adicionarObservador(this);
		//Registrando -> O display disse pra mémoria que ta interessado em ser notificado sempre que o valor modificar
		
		setBackground(new ColorUIResource(Color.WHITE));
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.BLACK);
		label.setFont(new Font("courier", Font.PLAIN,30));//nome,estilo,tamanho
		
		setLayout(new FlowLayout(FlowLayout.RIGHT,10,25));//GERENCIADOR DE LAYOUT
		add(label);
		
		
	}
@Override
public void valorAlterado(String novoValor) {
	label.setText(novoValor);
	
}
}
