package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import business.Participant;

public class SemiButton extends JButton implements ActionListener{

	//Atributos
	private Participant participant;
	
	//Metodo para criar o botao e adicionar o action listener
	public JButton newSemiButton(Participant participant) {
		JButton button = new JButton("Enviar");
		button.addActionListener(this);
		
		return button;
	}
		
	public void actionPerformed(ActionEvent e) {
		Finals finals = new Finals(participant);
		
	}

}
