package main;

public class Item {
	
	private int id;
	private String name;
	private String description;
	
	public Item(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	
	
//	* Getters
	public String getName() {
		return this.name;
	};
	public int getId() {
		return this.id;
	};
	public String getDescription() {
		return this.description;
	};
	
	
//	* Displayers
	public void displayDescription() {
		System.out.println(this.description);
	};
	
}
