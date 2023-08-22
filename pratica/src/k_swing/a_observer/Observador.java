package k_swing.a_observer;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {

		JFrame janela = new JFrame("Observador"); // Titulo da Janela
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Quando a aplicação é feixada a execusão é terminada
		janela.setSize(600, 200);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null); // centralizar na tela do computador

		JButton botao = new JButton("Clicar");
		janela.add(botao);
		
//		botao.addActionListener(new ActionListener() { // Quando clicar no botão: 
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Evento ocorreu!");
//			}
//		});

		botao.addActionListener(evento -> System.out.println("Evento ocorreu"));

		janela.setVisible(true);
	}

}
