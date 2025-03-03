package middleEarth;

public class Elf extends MiddleEarthCharacter {
	
	/**
	 * Initializes an Elf by taking in it's name, health and power.
	 * @param name
	 * @param health
	 * @param power
	 */
	public Elf(String name, double health, double power) {
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
				damageMultiplier = 0;
				break;
			case "Dwarf":
				System.out.println("Dwarf");
				damageMultiplier = 0;
				break;
			case "Human":
				System.out.println("Human");
				damageMultiplier = 1;
				break;
			case "Orc":
				System.out.println("Orc");
				damageMultiplier = 1.5;
				break;
			case "Wizard":
				System.out.println("Wizard");
				damageMultiplier = 1;
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
