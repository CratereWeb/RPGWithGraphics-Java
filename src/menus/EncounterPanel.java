package menus;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import game.Game;

public class EncounterPanel extends JPanel {
	
	private Game game;
	
	public EncounterPanel(Game g, int wWidth, int wHeight) {
		
		this.game = g;
		
		this.setBounds(
				wWidth/5, wHeight/5,
				(wWidth/5)*3, (wHeight/5)*3
		);
		this.setBackground(Color.BLACK);
		this.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		
	}

}