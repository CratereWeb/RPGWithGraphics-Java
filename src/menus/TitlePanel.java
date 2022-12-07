package menus;

import java.awt.Color;
import java.awt.Component;
import java.util.HashMap;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import game.Game;


public class TitlePanel extends JPanel {


	/**
	 * 
	 */
	private static final long serialVersionUID = -7910814463896783479L;
	private Game game;
	private JButton newGameBtn, loadGameBtn, quitGameBtn;
	
	public TitlePanel(Game g) {
		
		this.game = g;
		
//		Boutons
		newGameBtn = new JButton("Nouvelle partie");
		loadGameBtn = new JButton("Charger une partie");
		quitGameBtn = new JButton("Quitter le jeu");
		
//		Button Click Listeners
		newGameBtn.addActionListener(this.game);
		loadGameBtn.addActionListener(this.game);
		quitGameBtn.addActionListener(this.game);
		
//		Ajout au TitlePanel
		this.add(newGameBtn);
		this.add(loadGameBtn);
		this.add(quitGameBtn);
		
//		Paramètres du TitlePanel
		this.setBounds(
				0,0, 
				this.game.getWindow().getWidth(),
				this.game.getWindow().getHeight()
		);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBackground(Color.BLACK);

	}
	
	
	
//	public JPanel getPanel() {
//		return this.panel;
//	}

	
}
