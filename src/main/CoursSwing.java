package main;
import java.awt.BorderLayout;
//import java.awt.BorderLayout;
//import java.awt.CardLayout;
import java.awt.Color;
//import java.awt.FlowLayout;
//import java.awt.GridBagLayout;
//import java.awt.GridLayout;

import javax.swing.*;

public class CoursSwing {

	public CoursSwing() {
		
//		* Elements principaux

//		** JFrame
		JFrame window = new JFrame("Hello world!");
		window.setSize(800, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		** JPanel
		JPanel panel = new JPanel();
//		*** Spécifier la position et les dimensions du JPanel
		panel.setBounds(50,50,150,150);
//		*** Spécifier la couleur d'arrière-plan du JPanel
		panel.setBackground(Color.CYAN);
//		
		
//		** BorderLayout
		panel.setLayout(new BorderLayout());
		
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
		
		panel.add(new JButton("North"), BorderLayout.NORTH);
//		panel.add(new JButton("North"));
		panel.add(new JButton("South"), BorderLayout.SOUTH);
//		panel.add(new JButton("South"));
		panel.add(new JButton("Center"), BorderLayout.CENTER);
//		panel.add(new JButton("Center"));
		panel.add(new JButton("West"), BorderLayout.WEST);
//		panel.add(new JButton("West"));
		panel.add(new JButton("East"), BorderLayout.EAST);
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
		panel2.setBackground(Color.GREEN);
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

		
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
		window.add(panel);
		window.add(inputPanel);
		window.add(panel2);
		
		window.setLayout(null); // Annule la disposition automatique de la Frame, pour que l'on puisse paramétrer librement la disposition des Panel qu'elle contient
		window.setResizable(false); // Empêche l'utilisateur de redimensionner la fenêtre (Frame)
		window.setLocation(1600, 150);
		window.setVisible(true);
	}

}
