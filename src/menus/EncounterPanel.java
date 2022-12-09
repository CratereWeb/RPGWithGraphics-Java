package menus;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import game.Alchemist;
import game.Game;
import game.NonPlayableCharacter;

public class EncounterPanel extends JPanel {
	
	private Game game;
	
	private JLabel title = new JLabel();
	private JTextArea content = new JTextArea();
	
	private JPanel commands = new JPanel();
	private JButton talkBtn = new JButton("PARLER");
	private JButton shopBtn = new JButton("ACHETER");
	private JButton leaveBtn = new JButton("PARTIR");
	
	
	public EncounterPanel(Game g, int wWidth, int wHeight) {
		
		this.game = g;
		
		this.setLocation( wWidth/5, wHeight/5 );
		this.setSize( (wWidth/5)*3, (wHeight/5)*3 );
		this.setBackground(Color.BLACK);
		this.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		
		// Titre (nom du PNJ, du Mob)
		title.setFont(new Font("Arial", Font.PLAIN, 28));
		title.setAlignmentX(CENTER_ALIGNMENT);
		title.setForeground(Color.WHITE);

		// Contenu 
		content.setFont(new Font("Arial", Font.PLAIN, 24));
		content.setBackground(Color.BLACK);
		content.setForeground(Color.WHITE);
		content.setEditable(false);
		
		// Sub-Panel des interactions
		commands.setBackground(Color.BLACK);
		commands.setForeground(Color.WHITE);
		
		talkBtn.setBackground(Color.BLACK);
		talkBtn.setForeground(Color.WHITE);
		
		shopBtn.setBackground(Color.BLACK);
		shopBtn.setForeground(Color.WHITE);
		
		leaveBtn.setBackground(Color.BLACK);
		leaveBtn.setForeground(Color.WHITE);
		
//		talkBtn.addActionListener(this.game);
//		shopBtn.addActionListener(this.game);
//		leaveBtn.addActionListener(this.game);
		talkBtn.addActionListener(this.game);
		shopBtn.addActionListener(this.game);
		leaveBtn.addActionListener(this.game);
		
		
		commands.add(talkBtn);
		commands.add(shopBtn);
		commands.add(leaveBtn);
		
		
		this.add(title);
		this.add(Box.createRigidArea(new Dimension(0,100)));
		this.add(content);
		this.add(Box.createRigidArea(new Dimension(0,100)));
		this.add(commands);
		
		
	}
	
	public void newNPC(NonPlayableCharacter npc) {
		
		this.title.setText(npc.getName());
		this.content.setText(npc.getSentence(0));
		
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		this.game.getWindow().add(this);
//	}

}