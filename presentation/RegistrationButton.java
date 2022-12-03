package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class RegistrationButton extends JButton implements ActionListener{

	private Window window;
	
	public JButton newRegistrationButton(String text, Window window) {
		this.window = window;
		JButton registration = new JButton(text);
		registration.addActionListener(this);

		return registration;
	}
	
	public void actionPerformed(ActionEvent e) {
		NameWindow nameWindow = new NameWindow();
		window.setVisible(false);
	}
}
