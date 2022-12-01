package presentation;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import business.Participant;

public class QuarterFinals extends JFrame{

	//Atributos
	private Participant participant;
	private QuarterButton button;
	
	//Metodo construtor
	public QuarterFinals(Participant participant) {
		this.participant = participant;
		
		setSize(800, 800);
		setTitle("Quartas de Final");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		organizeLayout();
		setVisible(true);
	}
	
	//Metodo para deixar os elementos dessa janela da forma desejada 
	public void organizeLayout() {
		setLayout(new BorderLayout());
		QuarterPanel quarter = new QuarterPanel(participant);
		add(quarter, BorderLayout.CENTER);
		
		button = new QuarterButton();
		add(button, BorderLayout.SOUTH);
	}
}
