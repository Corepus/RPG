import java.util.*;

public class Game {

	public boolean won = false;
	public static int level = 1;
	public static Scanner scanner = new Scanner(System.in);
	public static int characterClass;
	public static String input;
	public static String name;
	public static Archer archer;
	public static Warrior warrior;
	public static DualWeilder dw;
	public static Characters characters;
	
	public static void main(String args[]) {
		
		System.out.println("Choose your class:");
		System.out.println("Archer, Warrior, Dual Weilder");
		input = scanner.next();
		
		if (input.equalsIgnoreCase("Archer")) {
			
			getName();
			archer = new Archer(name, 10, 15, "bow", 5);
			archer.printStatus();
			System.out.println("Elemental: " + archer.getElemental());
			
		}
		if (input.equalsIgnoreCase("Warrior")) {
			
			getName();
			warrior = new Warrior(name, 30, 5, "axe", 10);
			warrior.printStatus();
			System.out.println("Shield: " + warrior.getShield());
			
		}
		
		if (input.equalsIgnoreCase("Dual Weilder")) {
			
			getName();
			dw = new DualWeilder(name, 1, 35, "swords", 2);
			dw.printStatus();
			System.out.println("Attack Multilpier: " + dw.getAttack());
			
		}
		
	}
	
	public static void getName() {
		
		System.out.println("What's your name?");
		name = scanner.next();
		
	}
	
}
