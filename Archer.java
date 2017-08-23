
public class Archer extends PlayerCharacter{

	private int elemental;
	
	public Archer(String name, int health, int strength, String equipment, int element) {
		
		super(name, health, strength, equipment);
		elemental = element;
	
	}

	public int getElemental() {
		
		return elemental;
		
	}
	
	public void setElemental(int element) {
		
		elemental = element;
		
	}
	
}
