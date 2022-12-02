package presentation;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import business.Participant;

public class QuarterButton extends JButton implements ActionListener{

	//Atributos
	private Participant participant;
	
	//Metodo para criar um botao e adicionar o action listener
	public JButton newQuarterButton(Participant participant) {
		JButton button = new JButton("Enviar");
		this.participant = participant;
		button.addActionListener(this);
		
		return button;
	}
	
	//Metodo para pegar o evento do clique e abrir a janela das semifinais
	public void actionPerformed(ActionEvent e) {
		SemiFinals semiFinals = new SemiFinals(participant);
		
	}

}
