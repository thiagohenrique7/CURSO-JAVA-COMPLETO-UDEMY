package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600,200);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null); 
		//Centraliza janela em relação a algum componente,
//		quando o parâmetro passado é nulo ele vai centralizar a janela 
//		em relação a tela do computador.
		
		
		JButton botao =  new JButton("CLICAR");
		janela.add(botao);
		
//		botao.addActionListener(new ActionListener() {
//			public void actionPerformed (ActionEvent e) {
//				System.out.println("Evento ocorreu");
//			}//Clase anônima
//		});
		botao.addActionListener(e -> {
			System.out.println("Evento Ocorreu!!!");
		});
		
		
		
		janela.setVisible(true);

	}

}
