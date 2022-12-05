package game;

import java.util.LinkedHashMap;

public class Merchant extends NonPlayableCharacter {


	public MerchantStore store;
	
//	* Constructor
	public Merchant(int id, String name, MerchantStore store) {
		super(id, name);
		this.store = store;
	}
	
//	* Getters
	public LinkedHashMap<Item, Integer> getStore() {
		return this.store.getContent();
	}
	
	
//	* Displayers
	public void displayStoreItems() {
		System.out.println("--- Magasin de " + this.getName() + " ---");
		System.out.println("ID \t| Produit" + "\t\t |" + "Prix \t |");
		this.store.displayContent();
		System.out.println("-----------------------------------------");
	}

	
	
}
