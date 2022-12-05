package game;

public class Armourer extends Merchant implements InteractionTalk {

	public Armourer(int id, String name, MerchantStore store) {
		super(id, name, store);
	}

	@Override
	public void talk() {
		System.out.println("Salut. J'suis l'armurier. Si tu te sens pas assez fort pour encaisser les coups, viens me voir avec quelques écus et je te vendrai une armure digne de ce nom.");
		
	}
	
	
	
}
