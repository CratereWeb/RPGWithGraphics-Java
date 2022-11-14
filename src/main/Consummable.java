package main;

import java.util.HashMap;

public class Consummable extends Item {


	private HashMap<String, Integer> effects; // un integer peut être négatif ou positif => pratique pour obtenir le bonus ou le malus
	/*
		 * {
		 * 	"PV": 3 
		 * 	"PA": -3
		 * }
	 */
	
	
	
//	* Constructor
	public Consummable(int id, String name, String description, HashMap<String, Integer> e) {
		super(id, name, description);
		this.effects = e;
	}

	
	
//	* Getters
	public HashMap<String, Integer> getEffects() {
		return this.effects;
	}
	
	
	
//	* Setters
	
	
	
//	* Displayers
	public void displayEffects() {
		System.out.println(this.effects.toString());
	}
	
	
	
	
}
