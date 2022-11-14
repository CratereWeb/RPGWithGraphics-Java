package main;

public class Skill {
	
	private int id;
	private String name;
	private String description;
	private String[] exclusiveCastes;
	private int minLevel;
	private String nature; // "phy" pour Physique | "mgk" pour Magique
	private int power;
	
//	* Constructor
	public Skill(int id, String n, String[] ec, int ml, String nat, int pow) {
		this.id = id;
		this.name = n;
		this.exclusiveCastes = ec;
		this.minLevel = ml;
		this.nature = nat;
		this.power = pow;
	}
	
	
//	* Getters
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getDescription() {
		return this.description;
	}
	public String[] getExclusiveCastes() {
		return this.exclusiveCastes;
	}
	public String getExclusiveCastesToString() {
		return this.exclusiveCastes.toString();
	}
	public String getNature() {
		return this.nature;
	}
	public int getMinLevel() {
		return this.minLevel;
	}
	public int getPower() {
		return this.power;
	}
	
	
//	* Setters
	
	
//	* Displayers
	public void displayData() {
		System.out.println("Capacité " + this.getNature() + " de niveau " + this.getMinLevel() + ". Puissance : " + this.getPower() + ". Réservée aux " + this.getExclusiveCastesToString());
		System.out.println(this.getDescription());
		
	}
	
	
}	



