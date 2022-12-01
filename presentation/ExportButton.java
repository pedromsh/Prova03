package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ExportButton extends JButton implements ActionListener{

	public JButton newExportButton(String text) {
		JButton export = new JButton(text);
		export.addActionListener(this);
		
		return export;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Clicado");
		
	}
}
