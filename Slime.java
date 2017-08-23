
public class Slime extends Enemy{

	private int teamCallChances;
	public Slime(String name, int health, int strength, int gold, int team) {
		
		super(name, health, strength, gold);
		teamCallChances = team;
		
	}
	
	public int getTeam() {
		
		return teamCallChances;
		
	}
	
	public void setTeam(int team) {
		
		teamCallChances = team;
		
	}
	
}
