package game;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public abstract class Inventory {
	
	private LinkedHashMap<Item, Integer> content;

	
//	* Constructeur
	public Inventory(LinkedHashMap<Item, Integer> c) {
		this.content = c;
	}
	
	
//	* Getters
	public LinkedHashMap<Item, Integer> getContent() {
		return this.content;
	}
	
	public Item getItem(int id) {
		
		ArrayList<Item> item = new ArrayList<Item>(); 

		this.getContent().forEach( (key, value) -> {
			if(id == key.getId()) {
				item.add(key);
			}
		});
		
		return item.get(0);	
	}
	
	
//	* Displayers
	public abstract void displayContent();
	
	

}
