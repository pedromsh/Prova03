package presentation;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import business.Participant;

public class SemiFinals extends JFrame{

	//Atributos 
	private Participant participant;
	private SemiButton button;
	
	//Metodo construtor
	public SemiFinals(Participant participant) {
		this.participant = participant;
		
		setSize(800, 800);
		setTitle("Semifinal");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		organizeLayout();
		setVisible(true);
	}
	
	//Metodo para deixar os elementos dessa janela da forma desejada 
	public void organizeLayout() {
		setLayout(new BorderLayout());
		
		SemiPanel semi = new SemiPanel(participant);
		add(semi, BorderLayout.CENTER);
		
		button = new SemiButton();
		add(button.newSemiButton(participant), BorderLayout.SOUTH);
		
	}
}
