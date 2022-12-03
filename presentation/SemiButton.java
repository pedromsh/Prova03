package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import business.Participant;

public class SemiButton extends JButton implements ActionListener{

	//Atributos
	private Participant participant;
	private SemiFinals window;
	
	//Metodo para criar o botao e adicionar o action listener
	public SemiButton(Participant participant, SemiFinals window) {
		this.participant = participant;
		this.window = window;
	}
		
	public void actionPerformed(ActionEvent e) {
		Finals finals = new Finals(participant);
		window.setVisible(false);
		
	}

}
