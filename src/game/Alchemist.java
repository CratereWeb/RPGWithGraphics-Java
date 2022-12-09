package game;


public class Alchemist extends Merchant implements InteractionTalk {
	
	private int id;
	private String name;
	private String[] sentences;
	private MerchantStore store;
	
	public Alchemist(int id, String name) {
		super(id, name, store);
	}
	public Alchemist(int id, String name, String[] sentences, MerchantStore store) {
		
		super(id, name, store);
		this.sentences = this.initSentences(); 
	}


	@Override
	public void talk() {
		System.out.println("Bonjour aventurier ! Je suis l'alchimiste. Les potions que je vends ici peuvent te requinquer, si tu es mal en point ou épuisé au cours de ton voyage.");
	}
	@Override
	protected MerchantStore initStore() {
		MerchantStore store = new MerchantStore();
		
		
		return store;
	}
	@Override
	public String[] initSentences() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
