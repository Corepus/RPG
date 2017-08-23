
public class PlayerCharacter extends Characters{

	private String weapon;
	
	public PlayerCharacter(String name, int health, int strength, String equipment) {
		
		super(name, health, strength);
		weapon = equipment;
		
	}
	
	public String getWeapon() {
		
		return weapon;
		
	}
	
	public void setWeapon(String equipment) {
		
		weapon = equipment;
		
	}
	
}
