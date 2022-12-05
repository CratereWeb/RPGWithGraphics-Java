package game;
import java.awt.BorderLayout;
//import java.awt.BorderLayout;
//import java.awt.CardLayout;
import java.awt.Color;
//import java.awt.FlowLayout;
//import java.awt.GridBagLayout;
//import java.awt.GridLayout;

import javax.swing.*;

import menus.HandleButtonClick;

public class CoursSwing {

	public static void main (String[] args) {
		
//		* Elements principaux

//		** JFrame
		JFrame window = new JFrame("Hello world!");
		window.setSize(800, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		** JPanel
		JPanel navPanel = new JPanel();
//		*** Spécifier la position et les dimensions du JPanel
		navPanel.setBounds(50,50,200,100);
//		*** Spécifier la couleur d'arrière-plan du JPanel
		navPanel.setBackground(Color.CYAN);
		
		
//		** BorderLayout
		navPanel.setLayout(new BorderLayout());
		
//		** FlowLayout
//		window.setLayout(new FlowLayout());
		
// 		** CardLayout
//		window.setLayout(new CardLayout());
		
//		** GridLayout
//		window.setLayout(new GridLayout(3, 2)); // Les éléments s'ordonnent en 3 lignes, 2 colonnes
		
//		** BoxLayout
// 		*** Les éléments s'ordonnent de haut en bas
//		window.setLayout(new BoxLayout(window.getContentPane(), BoxLayout.Y_AXIS)); //  (selon l'axe Y)	
//		window.setLayout(new BoxLayout(window.getContentPane(), BoxLayout.PAGE_AXIS)); // (selon l'axe de la page) 	
		
// 		*** Les éléments s'ordonnent de gauche à droite
//		window.setLayout(new BoxLayout(window.getContentPane(), BoxLayout.X_AXIS)); // (selon l'axe X)	
//		window.setLayout(new BoxLayout(window.getContentPane(), BoxLayout.LINE_AXIS)); // (selon l'axe des lignes) 
		
//		** GridBadLayout
//		. Le paramétrage de GridBagLayout est beaucoup plus complexe
//		window.setLayout(new GridBagLayout()); 
		
//		==> Appliquer le layout a un panel
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//		panel.setLayout(new GridLayout(3, 2)); // Les éléments s'ordonnent en 3 lignes, 2 colonnes
		JButton northBtn = new JButton("North");
		JButton southBtn = new JButton("South");
		JButton centerBtn = new JButton("Center");
		JButton westBtn = new JButton("West");
		JButton eastBtn= new JButton("East");
		
		HandleButtonClick getDirectionInput = new HandleButtonClick();
		
		northBtn.addActionListener(getDirectionInput);
		southBtn.addActionListener(getDirectionInput);
		centerBtn.addActionListener(getDirectionInput);
		westBtn.addActionListener(getDirectionInput);
		eastBtn.addActionListener(getDirectionInput);
		
		navPanel.add(northBtn, BorderLayout.NORTH);
//		panel.add(new JButton("North"));
		navPanel.add(southBtn, BorderLayout.SOUTH);
//		panel.add(new JButton("South"));
		navPanel.add(centerBtn, BorderLayout.CENTER);
//		panel.add(new JButton("Center"));
		navPanel.add(westBtn, BorderLayout.WEST);
//		panel.add(new JButton("West"));
		navPanel.add(eastBtn, BorderLayout.EAST);
//		panel.add(new JButton("East"));
		
		
//		* Autres composants graphiques
		
		JPanel inputPanel = new JPanel();
		inputPanel.setBounds(50,200,400,30);
		inputPanel.setLayout(new BorderLayout());

//		** JTextField
//		. Champs de texte : l'utilisateur peut y saisir des informations
		inputPanel.add(new JTextField("Saisissez votre nom", 15), BorderLayout.WEST); // texte placeholder, nombre de colonnes du champ
		
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(50,250,400,250);
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		
		
		JPanel itemChoicePanel = new JPanel();
		itemChoicePanel.setBounds(300,50,150,400);
		itemChoicePanel.setLayout(new BoxLayout(itemChoicePanel, BoxLayout.Y_AXIS));
		
		int itemChoicePanelWidth = 20;
		itemChoicePanel.add(new JButton("Potion"));

		
//		** JCheckBox
//		. Cases à cocher
//		int panel2InputsLayout = BoxLayout.Y_AXIS;
		panel2.add(new JCheckBox("Sauce tomate"));
		panel2.add(new JCheckBox("Fromage"));
		panel2.add(new JCheckBox("Oignons"));
		panel2.add(new JCheckBox("Oeuf"));
		panel2.add(new JCheckBox("Chorizo"));
		
		
//		** JRadioButton
//		. Boutons radio
		
//		** JList
//		. Liste d'éléments à sélectionner
		
//		** JScrollPane
//		. Ajoute un scroll à un composant
		
//		** JComboBox
//		. Liste d'éléments, parmi lesquels on ne peut en sélectionner qu'un seul
//		. Ils héritent tous de la classe JComponent sauf les composants racines (JFrame...)
		

//		* Ajouter le panel à la fenêtre
		window.add(navPanel);
		window.add(inputPanel);
		window.add(panel2);
		
		window.setLayout(null); // Annule la disposition automatique de la Frame, pour que l'on puisse paramétrer librement la disposition des Panel qu'elle contient
		window.setResizable(false); // Empêche l'utilisateur de redimensionner la fenêtre (Frame)
		window.setLocation(1600, 150);
		window.setVisible(true);
		
	}

}
