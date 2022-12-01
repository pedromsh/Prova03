package presentation;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import business.Participant;

public class QuarterPanel extends JPanel{

	//Atributos
	private JTextField field;
	private JLabel team;
	private JLabel scoreBoard;
	private JLabel x;
	private Participant participant;
	
	//Metodo construtor
	public QuarterPanel(Participant participant) {
		this.participant = participant;
		organizePanel();
	}
	
	//Metodo para deixar os elementos do painel posicionados da forma escolhida
	public void organizePanel() {
		
		setLayout(new GridLayout(4, 9, 5, 5));
		
		team = new JLabel("Seleção:");
		add(team);
		
		field = new JTextField(10);
		add(field);
		participant.getSoccerTeams().add(field.getText());
		
		scoreBoard = new JLabel("Placar:");
		add(scoreBoard);
		
		field = new JTextField(5);
		add(field);
		participant.getScoreBoards().add(Integer.parseInt(field.getText()));
		
		x = new JLabel("X");
		add(x);
		
		team = new JLabel("Seleção:");
		add(team);
		
		field = new JTextField(10);
		add(field);
		participant.getSoccerTeams().add(field.getText());
		
		scoreBoard = new JLabel("Placar:");
		add(scoreBoard);
		
		field = new JTextField(5);
		add(field);
		participant.getScoreBoards().add(Integer.parseInt(field.getText()));
		
		team = new JLabel("Seleção:");
		add(team);
		
		field = new JTextField(10);
		add(field);
		participant.getSoccerTeams().add(field.getText());
		
		scoreBoard = new JLabel("Placar:");
		add(scoreBoard);
		
		field = new JTextField(5);
		add(field);
		participant.getScoreBoards().add(Integer.parseInt(field.getText()));
		
		x = new JLabel("X");
		add(x);
		
		team = new JLabel("Seleção:");
		add(team);
		
		field = new JTextField(10);
		add(field);
		participant.getSoccerTeams().add(field.getText());
		
		scoreBoard = new JLabel("Placar:");
		add(scoreBoard);
		
		field = new JTextField(5);
		add(field);
		participant.getScoreBoards().add(Integer.parseInt(field.getText()));
		
		team = new JLabel("Seleção:");
		add(team);
		
		field = new JTextField(10);
		add(field);
		participant.getSoccerTeams().add(field.getText());
		
		scoreBoard = new JLabel("Placar:");
		add(scoreBoard);
		
		field = new JTextField(5);
		add(field);
		participant.getScoreBoards().add(Integer.parseInt(field.getText()));
		
		x = new JLabel("X");
		add(x);
		
		team = new JLabel("Seleção:");
		add(team);
		
		field = new JTextField(10);
		add(field);
		participant.getSoccerTeams().add(field.getText());
		
		scoreBoard = new JLabel("Placar:");
		add(scoreBoard);
		
		field = new JTextField(5);
		add(field);
		participant.getScoreBoards().add(Integer.parseInt(field.getText()));
		
		team = new JLabel("Seleção:");
		add(team);
		
		field = new JTextField(10);
		add(field);
		participant.getSoccerTeams().add(field.getText());
		
		scoreBoard = new JLabel("Placar:");
		add(scoreBoard);
		
		field = new JTextField(5);
		add(field);
		participant.getScoreBoards().add(Integer.parseInt(field.getText()));
		
		x = new JLabel("X");
		add(x);
		
		team = new JLabel("Seleção:");
		add(team);
		
		field = new JTextField(10);
		add(field);
		participant.getSoccerTeams().add(field.getText());
		
		scoreBoard = new JLabel("Placar:");
		add(scoreBoard);
		
		field = new JTextField(5);
		add(field);
		participant.getScoreBoards().add(Integer.parseInt(field.getText()));
		
	}
}
