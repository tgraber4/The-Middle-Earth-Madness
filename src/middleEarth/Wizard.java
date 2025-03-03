package middleEarth;

public class Wizard extends MiddleEarthCharacter {
	
	/**
	 * Initializes a Wizard by taking in it's name, health and power.
	 * @param name
	 * @param health
	 * @param power
	 */
	public Wizard(String name, double health, double power) {
		super(name, health, power);
	}
	
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (target.getHealth() == 0) {
			return false;
		}
		double damageMultiplier = 1;
		switch (target.getRace()) {
			case "Elf":
				System.out.println("Elf");
				damageMultiplier = 1;
				break;
			case "Dwarf":
				System.out.println("Dwarf");
				damageMultiplier = 1.5;
				break;
			case "Human":
				System.out.println("Human");
				damageMultiplier = 0;
				break;
			case "Orc":
				System.out.println("Orc");
				damageMultiplier = 1;
				break;
			case "Wizard":
				System.out.println("Wizard");
				damageMultiplier = 0;
				break;
			default:
				System.out.println("No class given");
				break;
		}
		if (damageMultiplier == 0) {
			return false;
		} else {
			target.changeHealth(-1 * damageMultiplier * this.getPower());
			return true;
		}
	}
}
