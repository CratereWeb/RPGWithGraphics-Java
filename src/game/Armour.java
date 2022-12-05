package game;

public class Armour extends Gear {
	
	private int robustness;
	private int magickRobustness;
	
//	* Constructor
	public Armour(int id, String name, String description, String place, int minLevel, String[] exclusiveCastes, int rob, int mgkrob) {
		super(id, name, description, place, minLevel, exclusiveCastes);
		this.robustness = rob;
		this.magickRobustness = mgkrob;
	}
	
//	* Getters
	
	public int getRobustness() {
		return this.robustness;
	}
	public int getMagickRobustness() {
		return this.magickRobustness;
	}
	
//	* Setters
	
//	* Displayers
	@Override
	public void displayData() {
		System.out.println(this.getName() + " est une armure de niveau " + this.getMinLevel() + " réservée aux " + this.getExclusiveCastesToString() + ".");
	}
	
}
