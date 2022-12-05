package menus;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
//import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Menu extends JPanel implements ActionListener {


	private static final long serialVersionUID = 2132095189130788975L;
	private JFrame frame;
	private ArrayList<JButton> buttons = new ArrayList<JButton>();
	private ArrayList<JPanel> panels = new ArrayList<JPanel>();
	
	
	public Menu() {
		this.buttons = new ArrayList<JButton>();
	}
	
	public Menu(String[] labels ) {
		for(String l : labels) {
			JButton btn = new JButton(l);
			HandleButtonClick handleClick = new HandleButtonClick();
			btn.addActionListener(handleClick);
			this.buttons.add(btn);
			this.add(btn);
		}
	}
	
	public void addButtons(String[] labels) {
		
		for(String l : labels) {
			JButton btn = new JButton(l);
			HandleButtonClick handleClick = new HandleButtonClick();
			btn.addActionListener(handleClick);
			this.buttons.add(btn);
			this.add(btn);
		}
	}
	public void addPanelsWithButtonInputs(String[] panelsTitles) {
		
		for(String pt : panelsTitles) {
			JPanel p = new JPanel();
			p.setBackground(Color.BLACK);
			p.setBounds(100,100,400,30);
			addInputWithLabel(p, "Nom : ", 15);
			this.panels.add(p);
			
		}
		
	}
	
	private static void addInputWithLabel (JPanel panel, String label, int fontSize) {
		JLabel l = new JLabel(label);
//		l.setText(label);
//		l.setBackground(Color.BLACK);
		l.setForeground(Color.WHITE);
		JTextField tf = new JTextField("", fontSize);
		tf.setBackground(Color.BLACK);
		tf.setForeground(Color.WHITE);
		panel.add(l);
		panel.add(tf);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
