package game;

import java.util.LinkedHashMap;

public abstract class Merchant extends NonPlayableCharacter {


	public MerchantStore store;
	
//	* Constructor
	public Merchant(int id, String name, MerchantStore store) {
		super(id, name);
//		this.store = this.initStore();
	}
	
//	* Getters
	public LinkedHashMap<Item, Integer> getStore() {
		return this.store.getContent();
	}
	
//	* Setters
	protected abstract MerchantStore initStore();
	
//	* Displayers
	public void displayStoreItems() {
		System.out.println("--- Magasin de " + this.getName() + " ---");
		System.out.println("ID \t| Produit" + "\t\t |" + "Prix \t |");
		this.store.displayContent();
		System.out.println("-----------------------------------------");
	}
	

	@Override
	public abstract String[] initSentences();

	
	
}
