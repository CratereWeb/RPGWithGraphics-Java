package game;

public class Blacksmith extends Merchant implements InteractionTalk {

	public Blacksmith(int id, String name, MerchantStore store) {
		super(id, name, store);
	}

	@Override
	public void talk() {
		System.out.println("Je suis le forgeron de la ville, et tu pourras m'acheter une excellente arme, à condition d'y mettre le prix.");
		
	}
	
	
}
