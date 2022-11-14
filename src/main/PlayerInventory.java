package main;

import java.util.LinkedHashMap;

public class PlayerInventory extends Inventory implements HowManyItems {

	private int wallet;
	
//	* Constructor
	public PlayerInventory(LinkedHashMap<Item, Integer> content, int w) {
		super(content);
		this.wallet = w;
	}

	
//	* Getters
	public int getCapacity() {
		return this.getContent().size();
	}
	public int getWallet() {
		return this.wallet;
	}
	
	
//	* Setters
	public void addItem(Item item) {
		this.getContent().put(item, this.getContent().get(item) + 1);
	}
	public void addItem(Item item, int increment) {
		this.getContent().put(item, this.getContent().get(item) + increment);
	}
	public void removeItem(Item item) {
		this.getContent().put(item, this.getContent().get(item) - 1);
	}
	public void removeItem(Item item, int decrement) {
		this.getContent().put(item, this.getContent().get(item) - decrement);
	}
	public void addMoney(int value) {
		this.wallet += value;
	}
	public void spendMoney(int value) {
		this.wallet -= value;
	}
	@Override
	public int howMany(Item item) {
		int quantity = this.getContent().get(item);
		return quantity;
		
	}

	
//	* Displayers
	@Override
	public void displayContent() {
		System.out.println("Votre inventaire ---");
		System.out.println("-- Objets");
		System.out.println("\t\t" + this.getContent().toString());
		System.out.println("-- Portfeuille : ");
		System.out.println("\t\t" + this.getWallet() + " PO");

	}


	
}
