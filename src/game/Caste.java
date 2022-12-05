package game;

public class Caste {

		
	protected int id;
	protected String name;
	protected StatsTable baseStats;
	
//	* Constructor
	public Caste(int id, String name, StatsTable baseStats) {
		this.id = id;
		this.name = name;
		this.baseStats = baseStats;
	}
	
//	* Getters
	public int getId() {
		return this.id;	
	}
	
	public String getIdToString() {
		return Integer.toString(this.id);
	}
	
	public String getName() {
		return this.name;
	}
	public StatsTable getBaseStats() {
		return this.baseStats;
	}
	

//	* Setters
	public void setBaseStat(String key, int value) {
		this.baseStats.set(key, value);
	}

	
//	* Displayers
	public void displayBaseStats() {
		this.baseStats.displayTable();
	}


}
