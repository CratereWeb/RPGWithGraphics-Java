package game;

import java.util.HashMap;

public abstract class Gear extends Item {
	
	private String place;
	private int minLevel;
	private String[] exclusiveCastes;
	
//	* Constructor
	public Gear(int id, String name, String description, String p, int ml, String[] ec) {
		super(id, name, description);
		this.place = p;
		this.minLevel = ml;
		this.exclusiveCastes = ec;
	}
	
//	* Getters
	public String getPlace() {
		return this.place;
	}
	public int getMinLevel() {
		return this.minLevel;
	}
	public String[] getExclusiveCastes() {
		return this.exclusiveCastes;
	}
	public String getExclusiveCastesToString() {
		return this.exclusiveCastes.toString();
	}


	
//	* Setters
	
	
//	* Displayers
	public void displayExclusiveCastes() {
		System.out.println(this.exclusiveCastes.toString());
	}
	public abstract void displayData();
	
}
