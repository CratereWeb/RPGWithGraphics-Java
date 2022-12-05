package menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HandleButtonClick implements ActionListener {
	
//	private JLabel label;
	
//	public HandleButtonClick(JLabel lab) {
//		this.label = lab;
//	}
//	private JButton newGameBtn;
//	private JButton loadGameBtn;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		System.out.println(e.paramString());
//		System.out.println(e.getSource());
		
		System.out.println(e.getActionCommand()); // Affiche la commande de l'action déclenchée
		System.out.println("");
		System.out.println(e.getSource()); // Affiche la commande de l'action déclenchée
		System.out.println("");
		System.out.println(e.getSource().getClass()); // Affiche la commande de l'action déclenchée
		System.out.println("");
		System.out.println(e.paramString()); // Affiche la commande de l'action déclenchée
		System.out.println("");
		
		
		
	}
	
	
	//	public String getActionCommand(ActionEvent e) {
//		return e.getActionCommand();
//	}
	
}
