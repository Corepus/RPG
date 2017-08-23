
public class Warrior extends PlayerCharacter{
	
	private int shielding;
	
	public Warrior(String name, int health, int strength, String equipment, int shield) {
		
		super(name, health, strength, equipment);
		shielding = shield;
		
	}
	
	public int getShield() {
		
		return shielding;
		
	}
	
	public void setShield(int shield) {
		
		shielding = shield;
		
	}

}
