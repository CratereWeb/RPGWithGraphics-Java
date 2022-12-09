package menus;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

import game.Game;

public class MainPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8213858259378760940L;
	private Game game;
//	private int windowWidth, windowHeight;
	private JPanel menusPanel, minimapPanel, directionsPanel, encounterPanel, fightPanel, playerInfoPanel, inventoryPanel, mapPanel, journalPanel, optionsPanel, winPanel, losePanel, nextLevelPanel;

	
	public MainPanel(Game g) {
		
		this.game = g;
		
		int wWidth = this.game.getWindow().getWidth();
		int wHeight = this.game.getWindow().getHeight();
		Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
		
//		Paramètres du MainPanel
//		this.setLayout(new GridLayout(12,8));
//		this.setLayout(new BorderLayout());
//		this.setSize(wWidth, wHeight);
//		this.setPreferredSize(new Dimension(wWidth, wHeight));
//		this.setBounds(0,0, wWidth/2, wHeight/2);
		this.setBackground(Color.GREEN);
//		this.setLayout(new GridBagLayout());
		this.setLayout(null);
		this.setBorder(border);
		


//		Sub-Panels
		// Interface en surface
		////// Minimap
		minimapPanel = new MinimapPanel(this.game, wWidth, wHeight);
		////// Directions
		directionsPanel = new DirectionsPanel(this.game, wWidth, wHeight);
		////// Rencontre / Dialogue avec un Mob ou un NPC
		encounterPanel = new EncounterPanel(this.game, wWidth, wHeight);
		////// Fight
		fightPanel = new FightPanel(this.game, wWidth, wHeight);
		////// Menus
		menusPanel = new MenusPanel(this.game, wWidth, wHeight);
		
		// Interface en profondeur
		playerInfoPanel = new PlayerInfoPanel(this.game, wWidth, wHeight);
		inventoryPanel = new InventoryPanel(this.game, wWidth, wHeight);
		mapPanel = new MapPanel(this.game, wWidth, wHeight);
		journalPanel = new JournalPanel(this.game, wWidth, wHeight);
		optionsPanel = new OptionsPanel(this.game, wWidth, wHeight);
		
		
//		Ajout au MainPanel
		// Interface en surface
		////// Directions
		this.add(directionsPanel);
		////// Rencontre / Dialogue avec un Mob ou un NPC
		this.add(encounterPanel);
		////// Fight
		this.add(fightPanel);
		////// Menus
		this.add(menusPanel);
		
		// Interface en profondeur
		this.add(playerInfoPanel);
		this.add(inventoryPanel);
		this.add(mapPanel);
		this.add(journalPanel);
		this.add(optionsPanel);
		
		
//		Visibilité des Sub-Panels
		minimapPanel.setVisible(true);
		directionsPanel.setVisible(true);
		menusPanel.setVisible(true);
		
		encounterPanel.setVisible(true);
		fightPanel.setVisible(false);
		
		playerInfoPanel.setVisible(false);
		inventoryPanel.setVisible(false);
		mapPanel.setVisible(false);
		journalPanel.setVisible(false);
		optionsPanel.setVisible(false);
		
		

		
	}
	
	private void cleanSubPanels() {
		minimapPanel.setVisible(false);
		directionsPanel.setVisible(false);
		encounterPanel.setVisible(false);
		fightPanel.setVisible(false);
		menusPanel.setVisible(false);
		playerInfoPanel.setVisible(false);
		inventoryPanel.setVisible(false);
		mapPanel.setVisible(false);
		journalPanel.setVisible(false);
		optionsPanel.setVisible(false);
	}
	
	private void showPanel(String panelName) {
		
		switch(panelName) {
			
			case "main-surface-interface": showSurfaceInterface(); break;
			case "player-info": playerInfoPanel.setVisible(true); break;
			case "inventory": 	inventoryPanel.setVisible(true); break;
			case "map": 		mapPanel.setVisible(true); break;
			case "journal": 	journalPanel.setVisible(true); break;
			case "options": 	optionsPanel.setVisible(true); break;
			case "encounter": 	encounterPanel.setVisible(true); break;
			case "fight": 		fightPanel.setVisible(true); break;
		
		}
	}
	
	private void hidePanel(String panelName) {
		
		switch(panelName) {
		
			case "main-surface-interface": hideSurfaceInterface(); break;
			case "player-info": playerInfoPanel.setVisible(false); break;
			case "inventory": 	inventoryPanel.setVisible(false); break;
			case "map": 		mapPanel.setVisible(false); break;
			case "journal": 	journalPanel.setVisible(false); break;
			case "options": 	optionsPanel.setVisible(false); break;
			case "encounter": 	encounterPanel.setVisible(false); break;
			case "fight": 		fightPanel.setVisible(false); break;
	
		}
	}
	
	private void showSurfaceInterface() {
		minimapPanel.setVisible(true);
		directionsPanel.setVisible(true);
		menusPanel.setVisible(true);
	}
	private void hideSurfaceInterface() {
		minimapPanel.setVisible(false);
		directionsPanel.setVisible(false);
		menusPanel.setVisible(false);
	}
}
