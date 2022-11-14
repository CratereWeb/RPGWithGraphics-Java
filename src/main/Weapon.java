package main;

//import java.util.HashMap;

public class Weapon extends Gear {
	

	private int power;
	
	
//	* Constructor
	public Weapon(int id, String name, String description, String place, int minLevel, String[] exclusiveCastes, int pow) {
		super(id, name, description, place, minLevel, exclusiveCastes);
		this.power = pow;
	}
	
//	* Getters
	public int getPower() {
		return this.power;
	}
	
//	* Setters
	
	
//	* Displayers
	@Override
	public void displayData() {
		System.out.println(this.getName() + " est une arme de niveau " + this.getMinLevel() + " réservée aux " + this.getExclusiveCastesToString() + ".");
	}


}
