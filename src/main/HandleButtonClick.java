package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class HandleButtonClick implements ActionListener {
	
//	private JLabel label;
	
//	public HandleButtonClick(JLabel lab) {
//		this.label = lab;
//	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getActionCommand()); // Affiche la commande de l'action déclenchée
		System.out.println(e.paramString()); // Affiche les paramètres de l'action déclenchée
		System.out.println(e.getSource()); // Affiche les données de l'élement (JButton...) auquel l'événement est associé
	}
	
}
