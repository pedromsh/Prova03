package presentation;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import business.Participant;

public class NamePanel extends JPanel{

	private JTextField field;
	private JButton button;
	private JLabel label;
	
	public NamePanel() {
        setLayout(new FlowLayout());
        
        Participant participant = new Participant();
		
		this.label = new JLabel("Nome:");
		add(label);
		
		this.field = new JTextField(40);
		add(field);
		
		this.button = new JButton("Enviar");
		NameButton name = new NameButton(field, participant);
		this.button.addActionListener(name);
		add(button);
	}
	
}
