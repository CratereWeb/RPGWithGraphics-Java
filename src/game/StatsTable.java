package game;
import java.util.LinkedHashMap;


public class StatsTable {
	
	LinkedHashMap<String, Integer> statsTable;
	
//	* Constructor
	public StatsTable(LinkedHashMap<String, Integer> statsTable) {
		this.statsTable = statsTable;
	}
	
//	* Getters
	public LinkedHashMap<String, Integer> getTable() {
		return this.statsTable;
	}	
	public Integer getStat(String key) {
		return this.statsTable.get(key);
	}

	
//	* Setters
	public void set(String key, Integer value) {
		this.statsTable.put(key, value);
	}
	public void increase(String key, Integer increment) {
		this.statsTable.put(key, this.statsTable.get(key) + increment);
	}
	public void decrease(String key, Integer decrement) {
		int initialValue = this.statsTable.get(key);
		this.statsTable.put(key, initialValue - decrement);
	}
	public void maxHeal() {
		this.statsTable.put("PV", 100);
	}
	

//	* Displayers
	public void displayTable() {
		System.out.println(this.statsTable);
	}
	
	
	

}
