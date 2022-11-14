package main;

import java.util.LinkedHashMap;

public class SkillSet {
	
	private LinkedHashMap<Integer, Skill> skillSet;
	
	
	
//	* Constructor
	public SkillSet(LinkedHashMap<Integer, Skill> sks) {
		this.skillSet = sks;
	}
	
//	* Getters
	public Skill getSkill(int index) {
		return this.skillSet.get(index);
	}
	
	
//	* Setters
	public void addSkill(Skill skill) {
		this.skillSet.put(this.skillSet.size(), skill);
	}
	
	
//	* Displayers
	public void display() {
		System.out.println(this.skillSet.toString());
	}
}
