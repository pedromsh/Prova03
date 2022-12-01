package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import business.Participant;

public class NameButton implements ActionListener{

	private JTextField field;
	private Participant participant;
	
	public NameButton(JTextField field, Participant participant) {
		this.field = field;
		this.participant = participant;
	}
	
	public void actionPerformed(ActionEvent e) {
		QuarterFinals quarterFinals = new QuarterFinals(participant);
		participant.setName(field.getText());
	}

}
