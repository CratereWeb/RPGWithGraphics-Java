package game;

//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
//import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.*;
import javax.swing.border.Border;

import menus.CharacterCreationPanel;
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
	private int windowWidth = 1200;
	private int windowHeight = 800;
	private JPanel titlePanel, mainPanel, characterCreationPanel, cNamePanel, cCastePanel, playerInfoPanel, inventoryPanel, mapPanel, journalPanel, optionsPanel, winPanel, losePanel, nextLevelPanel;
	private JButton newGameBtn, loadGameBtn, quitGameBtn, confirmCharacterCreationBtn, openTitleScreenBtn, openGameScreenBtn, openPlayerInfoBtn, openInventoryBtn, openMapBtn, openJournalBtn, openOptionsBtn; 
	private JTextField cNameInput;
	private ButtonGroup cCasteInputs;
	private JRadioButton cCasteInputWarrior, cCasteInputMage, cCasteInputHunter;
	private JLabel cNameLabel, cCasteLabel;
	
	
	public Game() {
		
//		int wWidth = 1200;
//		int wHeight = 800;
		
//		/----- FENÊTRE RACINE DU JEU ------/
		window = new JFrame(); // Fenêtre racine
		window.setSize(windowWidth,windowHeight);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("RPG");
		
		
//		/------ CREATION DES ELEMENTS PANELS / BOUTONS ------/

//		ECRAN TITRE
		titlePanel = new TitlePanel(this); // Écran titre

//		ECRAN DE CREATION DU PERSONNAGE			
		characterCreationPanel = new CharacterCreationPanel(this);
		
//		ECRAN DE JEU PRINCIPAL
		mainPanel = new MainPanel(this); // Écran de jeu principal

		// Boutons de l'interface en jeu
		openTitleScreenBtn = new JButton("Retour à l'écran titre");
		openGameScreenBtn = new JButton("Retour au jeu");
		
		// Panneaux s'affichant au clic sur les boutons

		
		
//		ECOUTEURS DE CLIC SUR LES BOUTONS
		openTitleScreenBtn.addActionListener(this);
		openGameScreenBtn.addActionListener(this);

		
		
//		/----- IMBRIQUER LES ELEMENTS ------/
		
//		FENETRE PRINCIPALE
		window.add(titlePanel);
		window.add(characterCreationPanel);
//		window.add(mainPanel);
		
//		mainPanel.setLayout(new GridBagLayout());
//		GridBagConstraints gbc = new GridBagConstraints();
//		gbc.gridwidth = 5;
//		gbc.gridheight = 8;
//		window.add(mainPanel, gbc);
		
//		VISIBILITE DES PANNEAUX
		titlePanel.setVisible(true);
		characterCreationPanel.setVisible(false);
		mainPanel.setVisible(false);
		
		
		window.setResizable(false);
		window.setVisible(true);
		
	}
	
	public JFrame getWindow() {
		return this.window;
	}	
	private void createNewGame() {
		System.out.println("Création d'une nouvelle partie...");
		System.out.println("");
		openCharacterCreator();
//		System.out.println("Game : " + this);
	}
	private void loadGame() {
		System.out.println("Affichage des parties enregistrées...");
		System.out.println("");
	}
	private void quitGame() {
		System.out.println("Fermeture du programme...");
		System.out.println("");
	}
	private void openTitleScreen() {
		System.out.println("Ouverture de l'écran titre...");
		System.out.println("");
	}
	private void openCharacterCreator() {
		System.out.println("Menu de création de personnage...");
		System.out.println("");
		titlePanel.setVisible(false);
		this.window.add(characterCreationPanel);
		characterCreationPanel.setVisible(true);
		System.out.println("Affiché !");
	}
	private void openGameScreen() {
		System.out.println("Ouverture de l'écran de jeu...");
		System.out.println("");
		try {		
			titlePanel.setVisible(false);
			characterCreationPanel.setVisible(false);
			this.window.add(mainPanel);
			mainPanel.setVisible(true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Affiché !");
	}
	private void openPlayerInfo() {
		System.out.println("Ouverture de l'écran de personnage...");
		System.out.println("");
	}
	private void openInventory() {
		System.out.println("Ouverture de l'inventaire...");
		System.out.println("");
	}
	private void openMap() {
		System.out.println("Ouverture de la carte...");
		System.out.println("");
	}
	private void openJournal() {
		System.out.println("Ouverture du journal de quêtes...");
		System.out.println("");
	}
	private void openOptions() {
		System.out.println("Ouverture des options...");
		System.out.println("");
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		
		
		System.out.println("'" + cmd + "'" + " a été demandé");
		System.out.println(e);
//		System.out.println(e.getSource().);
//		System.out.println(e.getID());
//		System.out.println(e.getClass());
		
		switch(cmd) {
			case "Nouvelle partie": createNewGame(); break;
			case "Charger une partie": loadGame(); break;
			case "Quitter le jeu": quitGame(); break;
			case "Retour au jeu":
			case "Lancer la partie": openGameScreen(); break;
			case "Retour à l'écran titre": openTitleScreen(); break;
			case "Personnage": openPlayerInfo(); break;
			case "Inventaire": openInventory(); break;
			case "Carte": openMap(); break;
			case "Journal": openJournal(); break;
			case "Options": openOptions(); break;
		}
		
	}
	
//	private static HashMap<String, JButton> initGameButtons(HandleButtonClick cl) {
//		
//		HashMap<String, JButton> buttons = new HashMap<String, JButton>();
//		
//		JButton newGameBtn = new JButton("Nouvelle partie");
//		JButton loadGameBtn = new JButton("Charger la partie");
//		JButton openCharacter = new JButton("Personnage");
//		JButton openInventory = new JButton("Inventaire");
//		JButton openMap = new JButton("Carte");
//		JButton openJournal = new JButton("Journal");
//		JButton openOptions = new JButton("Options");
//		
//		buttons.put("new-game", newGameBtn);
//		buttons.put("load-game", loadGameBtn);
//		buttons.put("open-character", openCharacter);
//		buttons.put("open-inventory", openInventory);
//		buttons.put("open-map", openMap);
//		buttons.put("open-journal", openJournal);
//		buttons.put("open-options", openOptions);
//		
////		for(JButton b : buttons.values()) {
////			b.addActionListener(cl);
////		}
//		return buttons;
//		
//	}
	
}
