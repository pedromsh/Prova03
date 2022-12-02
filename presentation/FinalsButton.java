package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import business.Participant;

public class FinalsButton extends JButton implements ActionListener{

	//Atributos
	private Participant participant;
		
	//Metodo para criar um botao e adicionar o action listener
	public JButton newFinalsButton() {
		JButton button = new JButton();
		button.addActionListener(this);
		
		return button;
	}
	
	//Metodo para exibir a bandeira do campeao
		public void actionPerformed(ActionEvent e) {
			
			
		}
}
