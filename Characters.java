
public class Characters {

	private String characterName;
	private int characterHealth;
	private int characterStrength;
	
	public Characters(String name, int health, int strength) {
		
		characterName = name;
		characterHealth = health;
		characterStrength = strength;
		
	}
	
	public String getName() {
		
		return characterName;
		
	}
	
	public int getHealth() {
		
		return characterHealth;
		
	}
	
	public int getStrength() {
		
		return characterStrength;
		
	}
	
	public void setName(String name) {
		
		characterName = name;
		
	}
	
	public void setHealth(int health) {
		
		characterHealth = health;
		
	}
	
	public void setStrength(int strength) {
		
		characterStrength = strength;
		
	}
	
	public void printStatus() {
		
		System.out.println("Character: " + characterName);
		System.out.println("Health: " + characterHealth);
		System.out.println("Strength: " + characterStrength);
		
	}
	
}
