
public class DualWeilder extends PlayerCharacter{

	private int attackMultiplier;
	public DualWeilder(String name, int health, int strength, String equipment, int attack) {
		
		super(name, health, strength, equipment);
		attackMultiplier = attack;
		
	}
	
	public int getAttack() {
		
		return attackMultiplier;
		
	}
	
	public void setAttack(int attack) {
		
		attackMultiplier = attack;
		
	}
	
}
