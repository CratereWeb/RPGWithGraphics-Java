package game;

//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
//import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.*;

import menus.HandleButtonClick;
import menus.InventoryPanel;
import menus.JournalPanel;
import menus.LosePanel;
import menus.MainPanel;
import menus.MapPanel;
import menus.NextLevelPanel;
import menus.OptionsPanel;
import menus.PlayerInfoPanel;
import menus.TitlePanel;
import menus.WinPanel;

public class Game implements ActionListener {
	
	private JFrame window;
	private JPanel titlePanel, mainPanel, playerInfoPanel, inventoryPanel, mapPanel, journalPanel, optionsPanel, winPanel, losePanel, nextLevelPanel;
	
	
	public Game() {
		window = new JFrame();
		titlePanel = new TitlePanel();
		mainPanel = new MainPanel();
		playerInfoPanel = new PlayerInfoPanel();
		inventoryPanel = new InventoryPanel();
		mapPanel = new MapPanel();
		journalPanel = new JournalPanel();
		optionsPanel = new OptionsPanel();
		winPanel = new WinPanel();
		losePanel = new LosePanel();
		nextLevelPanel = new NextLevelPanel();
	}
	
	public JFrame getWindow() {
		return this.window;
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		
		System.out.println(cmd + " a été demandé");
		
		switch(cmd) {
			case "Nouvelle partie": createNewGame(); break;
			case "Charger une partie": loadGame(); break;
			case "Quitter": quitGame(); break;
			case "Personnage": openPlayerInfo(); break;
			case "Inventaire": openInventory(); break;
			case "Carte": openMap(); break;
			case "Journal": openJournal(); break;
			case "Options": openOptions(); break;
		}
		
	}
	private void openTitleScreen() {
		
	}
	private void openGameScreen() {
		
	}
	private void openPlayerInfo() {
		
	}
	private void openInventory() {
		
	}
	private void openMap() {
		
	}
	private void openJournal() {
		
	}
	private void openOptions() {
		
	}
	
	private static HashMap<String, JButton> initGameButtons(HandleButtonClick cl) {
		
		HashMap<String, JButton> buttons = new HashMap<String, JButton>();
		
		JButton newGameBtn = new JButton("Nouvelle partie");
		JButton loadGameBtn = new JButton("Charger la partie");
		JButton openCharacter = new JButton("Personnage");
		JButton openInventory = new JButton("Inventaire");
		JButton openMap = new JButton("Carte");
		JButton openJournal = new JButton("Journal");
		JButton openOptions = new JButton("Options");
		
		buttons.put("new-game", newGameBtn);
		buttons.put("load-game", loadGameBtn);
		buttons.put("open-character", openCharacter);
		buttons.put("open-inventory", openInventory);
		buttons.put("open-map", openMap);
		buttons.put("open-journal", openJournal);
		buttons.put("open-options", openOptions);
		
//		for(JButton b : buttons.values()) {
//			b.addActionListener(cl);
//		}
		return buttons;
		
	}
	
	
}
