package menus;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

import game.Game;

public class MinimapPanel extends JPanel {
	
	private Game game;
	
	public MinimapPanel(Game g, int wWidth, int wHeight) {
		
		Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
		this.game = g;
		
		this.setLocation( (wWidth/5)*4, 0 );
		this.setSize( (wWidth/5), (wHeight/10)*3) ;
		System.out.println(this.getBounds());
		this.setBackground(Color.CYAN);
		this.setBorder(border);
		
		
		
//		Click Listener
		
		
		
//		Ajout au MinimapPanel
		
		
		
//		Paramètres du MinimapPanel
		
		
		
		
	}

}
