
public class DrIda extends Enemy{

	private int knowledge;
	public DrIda(String name, int health, int strength, int gold, int intelligence) {
		
		super(name, health, strength, gold);
		knowledge = intelligence;
		
	}
	
	public int getIntelligence() {
		
		return knowledge;
		
	}
	
}
