package main;


public class Player {
	
	private String name;
	private Caste caste;
	private int level;
	private StatsTable stats;
	private int[] location = new int[2];
	private Inventory inventory;
	private SkillSet skills;
	private Equipment equipment;
	
//	* Constructor
	public Player(String na, Caste ca, int lev, StatsTable st, int[] loc, Inventory inv, SkillSet sk, Equipment eq) {
		this.name = na;
		this.caste = ca;
		this.level = lev;
		this.stats = st;
		this.location = loc;
		this.inventory = inv;
		this.skills = sk;
		this.equipment = eq;
	}

	
//	* Getters
	public String getName() {
		return this.name;
	}
	public Caste getCaste() {
		return this.caste;
	}
	public int getLevel() {
		return this.level;
	}
	public StatsTable getAllStats() {
		return this.stats;
	}
	public int[] getLocation() {
		return this.location;
	}
	public Inventory getInventory() {
		return this.inventory;
	}
	public SkillSet getSkills() {
		return this.skills;
	}
	public Equipment getEquipment() {
		return this.equipment;
	}
	
	
	
//	* Setters
	public void setCaste(Caste caste) {
		this.caste = caste;
	}
	public void setStat(String key, int value) {
		this.stats.set(key, value);
	}
	public void setAllStats(StatsTable stats) {
		this.stats = stats;
	}
	public void navigate(char direction) {
		
		switch(direction) {
			case 'E': this.location[0]++;
				break;
			case 'W': this.location[0]--;
				break;
			case 'N': this.location[1]--;
				break;
			case 'S': this.location[1]++;
				break;
		}
		
	}
	public int[] previewNextLocation(char direction) {
		
		int[] nextLocation = new int[2];
		
		switch(direction) {
			case 'E': nextLocation[0] = this.location[0]+1; 	nextLocation[1] = this.location[1];
				break;
			case 'W': nextLocation[0] = this.location[0]-1; 	nextLocation[1] = this.location[1];
				break;
			case 'N': nextLocation[0] = this.location[0]; 		nextLocation[1] = this.location[1]-1;
				break;
			case 'S': nextLocation[0] = this.location[0]; 		nextLocation[1] = this.location[1]+1;
				break;
		}
		
		return nextLocation;

	}
	
	
	
	
//	* Displayers
	public void displayInfo() {
		System.out.println(this.getName() + ", " + this.caste.getName() + " de niveau " + this.getLevel());
		this.stats.displayTable();
	}
	public void displayInventory() {
		this.inventory.displayContent();
	}
	public void displayEquipment() {
		this.equipment.display();
	}
	
	
	

}
