package game;

import java.util.LinkedHashMap;
import java.util.Scanner;

public abstract class MerchantStore extends Inventory implements InteractionShop {

	


	//	* Constructor
	public MerchantStore() {
		this.content = new LinkedHashMap<Item, Integer>();
	}
	
//	* Getters
	public int getItemPrice(Item item) {
		return this.getContent().get(item);
	}
	
//	* Setters
	protected abstract MerchantStore initStore();

	
//	* Displayers
	@Override
	public void displayContent() {
		this.getContent().forEach( (key, value) -> {
			System.out.println(key.getId() + "\t|"+ key.getName() + "|\t\t| " + value.toString() + " PO \t |");
		});
	}
	public void displayItemPrice(Item item) {
		System.out.println(item.getName() + " coûte " + this.getItemPrice(item) + " PO.");
	}
	

	@Override
	public Item shop() {
		System.out.println("Que souhaites-tu m'acheter ?");
		this.displayContent();

		Scanner scanner = new Scanner(System.in);
		int userReqItemId = scanner.nextInt();
		
		Item item = this.getItem(userReqItemId);
		
		System.out.println("Tu veux acheter cet article : " + item.getName() + "? (O / N)");
		
		String userConfirm = scanner.nextLine();
		if(userConfirm == "O") {
			System.out.println("Merci !");
		} else {
			scanner.close();
			this.shop();
		}
		scanner.close();		
		
		return item;
		
	}
	
	
}
