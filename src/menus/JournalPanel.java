package menus;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class JournalPanel extends JPanel {


	/**
	 * 
	 */
	private static final long serialVersionUID = -7910814463896783479L;
	private JPanel panel;
	private HashMap<String, JButton> buttons = new HashMap<String, JButton>();
	
	public JournalPanel() {
		
	}
	public JournalPanel(HashMap<String, JButton> btns) {
		
		initialize(btns);
	}
	
	private void initialize(HashMap<String, JButton> btns) {
		this.panel = new JPanel();
		this.panel.setBounds(50,50,300,300);
		this.panel.setBackground(Color.RED);
		this.panel.setLayout(new BoxLayout(this.panel, BoxLayout.Y_AXIS));
		
		this.buttons.put("new-game", btns.get("new-game"));
		this.buttons.put("load-game", btns.get("load-game"));	
		
		this.buttons.get("new-game").setAlignmentX(Component.CENTER_ALIGNMENT);
		this.buttons.get("load-game").setAlignmentX(Component.CENTER_ALIGNMENT);
		
		this.panel.add(this.buttons.get("new-game"));
		this.panel.add(this.buttons.get("load-game"));

		
	}
	
	
	
	public JPanel getPanel() {
		return this.panel;
	}
	
	
//	public void addButtons(HashMap<String, JButton> btns) {
//		
//		for(HashMap.Entry<String, JButton> b : btns.entrySet()) {
//			this.buttons.put(b.getKey(), b.getValue());
//			this.panel.add(b.getValue());
//		}
//	}
	
	
	
	
	
	
	
	
	
}
