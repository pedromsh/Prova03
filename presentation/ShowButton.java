package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ShowButton extends JButton implements ActionListener{

	public JButton newShowButton(String text) {
		JButton show = new JButton(text);
		show.addActionListener(this);
		
		return show;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("oi");
		
	}
}
