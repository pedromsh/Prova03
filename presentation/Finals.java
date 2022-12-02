package presentation;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import business.Participant;

public class Finals extends JFrame{

	//Atributos 
	private Participant participant;
	private FinalsButton button;
			
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
		
		button = new FinalsButton();
		add(button.newFinalsButton(), BorderLayout.SOUTH);
		
	}
}
