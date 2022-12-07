package menus;

import java.awt.Color;

import javax.swing.JPanel;

import game.Game;

public class DirectionsPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5412061831171344603L;
	private Game game;
	
	public DirectionsPanel(Game g, int wWidth, int wHeight) {
		
		this.game = g;
		
		this.setBounds(
				(wWidth/5)*4, (wHeight/10)*4, 
				(wWidth/10)*3, (wHeight/10)*3
		);
		this.setBackground(Color.PINK);	
		
		
		
	}
}
