package menus;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import game.Game;

public class CharacterCreationPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1584032530028684025L;
	private Game game;
	private JPanel cNamePanel, cCastePanel;
	private JLabel cNameLabel, cCasteLabel;
	private JTextField cNameInput;
	private ButtonGroup cCasteInputs;
	private JRadioButton cCasteInputWarrior, cCasteInputMage, cCasteInputHunter;
	private JButton confirmCharacterCreationBtn;
	
	
	public CharacterCreationPanel(Game g) {
		
		this.game = g;
				
//		Choix du nom
		cNamePanel = new JPanel();
		cNamePanel.setBackground(Color.BLACK);
		
		cNameLabel = new JLabel("Nom de votre personnage");
		cNameLabel.setForeground(Color.WHITE);
		cNameLabel.setFont(new Font("Verdana", Font.PLAIN, 25));
		
		cNameInput = new JTextField("", 30);
		cNameInput.setBounds(0,0,300,80);
		cNameInput.setBackground(Color.BLACK);
		cNameInput.setForeground(Color.WHITE);
		cNameInput.setFont(new Font("Verdana", Font.PLAIN, 25));
		
		cNamePanel.add(cNameLabel);
		cNamePanel.add(cNameInput);
		
//		Choix de la caste
		cCastePanel = new JPanel();
		cCastePanel.setBackground(Color.BLACK);
		
		cCasteLabel = new JLabel("Sa classe");
		cCasteInputWarrior = new JRadioButton("Guerrier");
		cCasteInputMage = new JRadioButton("Mage");
		cCasteInputHunter = new JRadioButton("Voleur");
		cCasteInputs = new ButtonGroup();
		
		cCasteInputs.add(cCasteInputWarrior);
		cCasteInputs.add(cCasteInputMage);
		cCasteInputs.add(cCasteInputHunter);
		
		cCastePanel.add(cCasteLabel);
		cCastePanel.add(cCasteInputWarrior);
		cCastePanel.add(cCasteInputMage);
		cCastePanel.add(cCasteInputHunter);
		
//		Previsualisation des stats de départ selon la caste choisie
		
		
//		Validation du personnage
		confirmCharacterCreationBtn = new JButton("Lancer la partie");
		confirmCharacterCreationBtn.setBounds(0,0,300,100);
		confirmCharacterCreationBtn.setBackground(Color.BLACK);
		confirmCharacterCreationBtn.setForeground(Color.WHITE);
		
//		Button Click Listeners
		confirmCharacterCreationBtn.addActionListener(this.game);
				
//		Ajout au CharacterChoicePanel
		this.add(cNamePanel);
		this.add(cCastePanel);
		this.add(confirmCharacterCreationBtn);
		
//		Paramètres du CharacterChoicePanel
		this.setBounds(
				0,0, 
				this.game.getWindow().getWidth(), 
				this.game.getWindow().getHeight()
		);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBackground(Color.BLACK);
		
		
		
	}
	
	
	
	
//	public CharacterCreationPanel(Game game, JPanel np, JPanel cp, JLabel cnl, JTextField cni, JLabel ccl, ButtonGroup cci, JRadioButton cciw, JRadioButton ccim, JRadioButton ccih, JButton cccb) {
//		this.game = game;
//		this.cNamePanel = np;
//		this.cCastePanel = cp;
//		this.cNameLabel = cnl;
//		this.cNameInput = cni;
//		this.cCasteLabel = ccl;
//		this.cCasteInputWarrior = cciw;
//		this.cCasteInputMage = ccim;
//		this.cCasteInputHunter = ccih;
//		this.cCasteInputs = cci;
//		this.confirmCharacterCreationBtn = cccb;
//		this.confirmCharacterCreationBtn.addActionListener(game);
//	}
	
	
	
	
}
