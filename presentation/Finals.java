package presentation;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import business.Participant;

public class Finals extends JFrame{

	//Atributos 
	private Participant participant;
	private JButton button;
		
	//Metodo cosntrutor
	public Finals(Participant participant) {
		this.participant = participant;
		
		setSize(800, 800);
		setTitle("Final");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		organizeLayout();
		setVisible(true);
	}
	
	public void organizeLayout() {
		setLayout(new BorderLayout());
		
		FinalsPanel panel = new FinalsPanel(participant);
		add(panel, BorderLayout.CENTER);
		
		button = new JButton("Enviar");
		FinalsButton finalButton = new FinalsButton(participant, this);
		button.addActionListener(finalButton);
		add(button, BorderLayout.SOUTH);
		
	}
}
