package presentation;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JPanel{

	private RegistrationButton registration;
	private ShowButton show;
	private ImportButton importButton;
	private ExportButton export;
	private JLabel label;
	
	public Menu() {
		createButtons();
	}
	
	public void createButtons() {
		setLayout(new GridLayout(5, 1, 10, 10));
		
		label = new JLabel();
		label.setText("Funcionalidades do Bolão");
		add(label);
		
		registration = new RegistrationButton();
		add(registration.newRegistrationButton("Cadastrar novo Bolão"));
		
		show = new ShowButton();
		add(show.newShowButton("Mostrar Botões Cadastrados"));
		
		importButton = new ImportButton();
		add(importButton.newImportButton("Importar Bolões"));
		
		export = new ExportButton();
		add(export.newExportButton("Exportar Bolões"));
	}
}
