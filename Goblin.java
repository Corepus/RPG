
public class Goblin extends Enemy{

	private int slamChances;
	public Goblin(String name, int health, int strength, int gold, int slam) {
		
		super(name, health, strength, gold);
		slamChances = slam;
		
	}
	
	public int getSlam() {
		
		return slamChances;
		
	}
	
	public void setSlam(int slam) {
		
		slamChances = slam;
		
	}
	
}
