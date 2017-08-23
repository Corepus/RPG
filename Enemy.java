
public class Enemy extends Characters{

	private int goldDrop;
	
	public Enemy(String name, int health, int strength, int gold) {
		
		super(name, health, strength);
		goldDrop = gold;
		
	}
	
	public int getGold() {
		
		return goldDrop;
		
	}
	
	public void setGold(int gold) {
		
		goldDrop = gold;
		
	}
	
}
