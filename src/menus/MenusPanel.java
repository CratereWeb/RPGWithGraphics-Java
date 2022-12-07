package menus;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

import game.Game;

public class MenusPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5412061831171344603L;
	private Game game;
	private JButton openPlayerInfoBtn, openInventoryBtn, openMapBtn, openJournalBtn, openOptionsBtn;
	
	public MenusPanel(Game g, int wWidth, int wHeight) {
		
		this.game = g;
		
		
//		Boutons
		openPlayerInfoBtn = new JButton("Personnage");
		openPlayerInfoBtn.setBounds(50, 50, 50, 50);
		
		openInventoryBtn = new JButton("Inventaire");
		openInventoryBtn.setBounds(100, 50, 50, 50);
		
		openMapBtn = new JButton("Carte");
		openMapBtn.setBounds(150, 50, 50, 50);
		
		openJournalBtn = new JButton("Journal");
		openJournalBtn.setBounds(200, 50, 50, 50);
		
		openOptionsBtn = new JButton("Options");
		openOptionsBtn.setBounds(250, 50, 50, 50);
		
		
		
//		Button Click Listeners
		openPlayerInfoBtn.addActionListener(this.game);
		openInventoryBtn.addActionListener(this.game);
		openMapBtn.addActionListener(this.game);
		openJournalBtn.addActionListener(this.game);
		openOptionsBtn.addActionListener(this.game);
		
		
//		Ajout des boutons au MenusPanel
		this.add(openPlayerInfoBtn);
		this.add(openInventoryBtn);
		this.add(openMapBtn);
		this.add(openJournalBtn);
		this.add(openOptionsBtn);
		
		
//		Paramètres du MenusPanel
		this.setBounds(
				(wWidth/5)*3, (wHeight/10)*9, 
				(wWidth/5)*2, (wHeight/10)*1
				);
		this.setBackground(Color.ORANGE);	

		
	}
}
