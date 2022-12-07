package game;

//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
//import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.*;

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
	private JPanel titlePanel, mainPanel, characterCreationPanel, cNamePanel, cCastePanel, playerInfoPanel, inventoryPanel, mapPanel, journalPanel, optionsPanel, winPanel, losePanel, nextLevelPanel;
	private JButton newGameBtn, loadGameBtn, quitGameBtn, confirmCharacterCreationBtn, openTitleScreenBtn, openGameScreenBtn, openPlayerInfoBtn, openInventoryBtn, openMapBtn, openJournalBtn, openOptionsBtn; 
	private JTextField cNameInput;
	private ButtonGroup cCasteInputs;
	private JRadioButton cCasteInputWarrior, cCasteInputMage, cCasteInputHunter;
	private JLabel cNameLabel, cCasteLabel;
	
	
	public Game() {
		
//		/----- FENÊTRE RACINE DU JEU ------/
		window = new JFrame(); // Fenêtre racine
		window.setSize(1200,800);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("RPG");
		
		
//		/------ CREATION DES ELEMENTS PANELS / BOUTONS ------/
//		ECRAN TITRE
		titlePanel = new TitlePanel(this); // Écran titre
//		titlePanel.setBackground(Color.BLACK);
//		titlePanel.setBounds(0, 0, window.getWidth(), window.getHeight());

		
//		ECRAN DE CREATION DU PERSONNAGE			
		characterCreationPanel = new CharacterCreationPanel(this);
		
//		ECRAN DE JEU PRINCIPAL
		mainPanel = new MainPanel(this); // Écran de jeu principal
//		mainPanel.setBackground(Color.GREEN);
//		mainPanel.setBounds(300, 100, 100, 100);
		// Boutons de l'interface en jeu
		openTitleScreenBtn = new JButton("Retour à l'écran titre");
		openGameScreenBtn = new JButton("Retour au jeu");
//		openPlayerInfoBtn = new JButton("Personnage");
//		openInventoryBtn = new JButton("Inventaire");
//		openMapBtn = new JButton("Carte");
//		openJournalBtn = new JButton("Journal");
//		openOptionsBtn = new JButton("Options");
		
		// Panneaux s'affichant au clic sur les boutons
//		playerInfoPanel = new PlayerInfoPanel(); // Écran affichant les caractéristiques du personnage
//		playerInfoPanel.setBackground(Color.BLUE);
//		playerInfoPanel.setBounds(300, 100, 100, 100);
		
		
//		inventoryPanel = new InventoryPanel(this); // Écran affichant l'inventaire
//		mapPanel = new MapPanel(this); // Écran affichant la map
//		journalPanel = new JournalPanel(this); // Écran affichant le journal de quêtes
//		optionsPanel = new OptionsPanel(); // Écran affichant les options de jeu
//		winPanel = new WinPanel(); // Écran affichant le bilan après une victoire en combat
//		losePanel = new LosePanel(); // Écran affichant le bilan après une défaite en combat
//		nextLevelPanel = new NextLevelPanel(); // Écran affichant les nouvelles caractéristiques du personnage 		lorsqu'il passe au niveau supérieur
		
//		ECOUTEURS DE CLIC SUR LES BOUTONS
//		newGameBtn.addActionListener(this);
//		loadGameBtn.addActionListener(this);
//		quitGameBtn.addActionListener(this);
		//confirmCharacterCreationBtn.addActionListener(this);
		openTitleScreenBtn.addActionListener(this);
		openGameScreenBtn.addActionListener(this);
//		openPlayerInfoBtn.addActionListener(this);
//		openInventoryBtn.addActionListener(this);
//		openMapBtn.addActionListener(this);
//		openJournalBtn.addActionListener(this);
//		openOptionsBtn.addActionListener(this);
		
		
//		/----- IMBRIQUER LES ELEMENTS ------/
//		ECRAN TITRE
//		titlePanel.add(newGameBtn);
//		titlePanel.add(loadGameBtn);
//		titlePanel.add(quitGameBtn);
		
//		ECRAN DE CREATION DU PERSONNAGE
//		characterCreationPanel.add(cNamePanel);
//		characterCreationPanel.add(cCastePanel);
//		characterCreationPanel.add(confirmCharacterCreationBtn);

//		ECRAN DE JEU PRINCIPAL
//		mainPanel.add(playerInfoPanel);
//		mainPanel.add(inventoryPanel);
//		mainPanel.add(mapPanel);
//		mainPanel.add(journalPanel);
//		mainPanel.add(optionsPanel);
//		mainPanel.add(winPanel);
//		mainPanel.add(losePanel);
//		mainPanel.add(nextLevelPanel);
		
//		FENETRE PRINCIPALE
		window.add(titlePanel);
		window.add(characterCreationPanel);
		window.add(mainPanel);
		
//		VISIBILITE DES PANNEAUX
		titlePanel.setVisible(true);
		characterCreationPanel.setVisible(false);
		mainPanel.setVisible(false);
		
		
		window.setResizable(true);
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
		this.window.add(characterCreationPanel);
		titlePanel.setVisible(false);
		characterCreationPanel.setVisible(true);
		System.out.println("Affiché !");
	}
	private void openGameScreen() {
		System.out.println("Ouverture de l'écran de jeu...");
		System.out.println("");
		try {		
			titlePanel.setVisible(false);
			characterCreationPanel.setVisible(false);
			mainPanel.setVisible(true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
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
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		
		System.out.println("'" + cmd + "'" + " a été demandé");
		
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
	
	
}
