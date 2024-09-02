package main;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JanelaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Minha Janela em Java");

		//tamanho da janela
		frame.setMinimumSize(new Dimension(800, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//label cetralizado
		JLabel lb = new JLabel("Hello World", SwingConstants.CENTER);
		//adiciona label ao frame
		frame.getContentPane().add(lb);
		
		//empacota e exibe
		frame.pack();
		frame.setVisible(true);
		

	}

}
