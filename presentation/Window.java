package presentation;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Window extends JFrame {

	public Window() {
		setSize(600, 600);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("Menu Inicial");
		organizeLayout();
		setVisible(true);
	}
	
	public void organizeLayout() {
		Menu menu = new Menu();
		add(menu);
	}

}
