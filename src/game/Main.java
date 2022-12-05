package game;

import javax.swing.JFrame;

import menus.HandleButtonClick;


public class Main {

	public static void main(String[] args) {
		
		Game game = new Game();
		game.getWindow().setSize(800,800);
		game.getWindow().setTitle("RPG");
		game.getWindow().setLayout(null); // Annule la disposition automatique de la Frame, pour que l'on puisse paramétrer librement la disposition des Panel qu'elle contient
		game.getWindow().setResizable(false); // Empêche l'utilisateur de redimensionner la fenêtre (Frame)
		game.getWindow().setLocation(1300, 150);
		game.getWindow().setVisible(true);
		game.getWindow().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		


	}

}
