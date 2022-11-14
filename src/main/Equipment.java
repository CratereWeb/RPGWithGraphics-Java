package main;

import java.util.LinkedHashMap;

public class Equipment {
	
	
	private LinkedHashMap<String, Gear> gears;
	
	
//	* Constructor
	public Equipment(LinkedHashMap<String, Gear> g) {
		this.gears = g;
	}
	
//	* Getters
	public LinkedHashMap<String, Gear> getGears() {
		return this.gears;
	}
	
//	* Setters
	public void addWeapon(String place, Weapon weapon) {
		this.gears.put(place, weapon);
	}
	public void addArmour(String place, Armour armour) {
		this.gears.put(place, armour);
	}
	public void removeItem(String place) {
		this.gears.remove(place);
	}
	public void replaceItem(String place, Gear gear) {
		this.gears.put(place, gear);
	}
	
	
//	* Displayers
	public void display() {
		System.out.println(this.gears.toString());
	}
}
