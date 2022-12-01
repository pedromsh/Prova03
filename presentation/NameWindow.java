package presentation;

import javax.swing.JFrame;

public class NameWindow extends JFrame{

	public NameWindow() {
		setSize(800, 200);
		setTitle("Informação do participante");
		addPanel();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void addPanel() {
		NamePanel panel = new NamePanel();
		add(panel);
	}
}
