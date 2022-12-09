package game;

public abstract class NonPlayableCharacter {

	private int id;
	private String name;
	private String[] sentences;
	
//	* Constructor
	public NonPlayableCharacter(int id, String n) {
		super(name);
		this.id = id;
		this.name = n;
		this.sentences = this.initSentences();
	}
	public NonPlayableCharacter(String n) {
		this.name = n;
	}
	
//	* Getters
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getSentence(int sIndex) {
		return this.sentences[sIndex];
	}
	public abstract String[] initSentences();
	
	
	
//	* Setters
	
	
//	* Displayers


	
}
