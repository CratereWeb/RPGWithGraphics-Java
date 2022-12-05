package game;


public class Alchemist extends Merchant implements InteractionTalk {

	public Alchemist(int id, String name, MerchantStore store) {
		super(id, name, store);
	}


	@Override
	public void talk() {
		System.out.println("Bonjour aventurier ! Je suis l'alchimiste. Les potions que je vends ici peuvent te requinquer, si tu es mal en point ou épuisé au cours de ton voyage.");
	}
	
	
	

}
