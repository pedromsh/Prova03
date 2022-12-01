package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ImportButton extends JButton implements ActionListener{

	public JButton newImportButton(String text) {
		JButton importButton = new JButton(text);
		importButton.addActionListener(this);
		
		return importButton;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("funcionando");
		
	}
}
