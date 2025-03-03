package middleEarth;

public class MiddleEarthCharacter {
	
	String name;
	double health;
	double power;
	
	/**
	 * Initializes a Middle Earth Character by taking in it's name, health and power.
	 * @param name
	 * @param health
	 * @param power
	 */
	public MiddleEarthCharacter(String name, double health, double power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}
	
	/**
	 * Changes the character's health by the inputed value. <br>
	 * Also ensures health stays at 0 if it goes negative.
	 * @param value
	 */
	public void changeHealth (double value) {
		this.health += value;
		if (this.health < 0) {
			this.health = 0;
		}
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getHealth() {
		return health;
	}


	public void setHealth(double health) {
		this.health = health;
	}


	public double getPower() {
		return power;
	}


	public void setPower(double power) {
		this.power = power;
	}

	/**
	 * Gets the race or class type of that character.
	 * @return
	 */
	public String getRace () {
		return this.getClass().getSimpleName();
	}
	
	/**
	 * Allows a character to attack another character. <br>
	 * Returns true if attack successfully dealt damage. <br>
	 * Returns false if attack did no damage.
	 * @param target
	 * @return
	 */
	public boolean attack(MiddleEarthCharacter target) {
		return true;
	}
	
	/**
	 * Displays info on character. <br>
	 * Info shown: name, health, power.
	 */
	public void displayInfo () {
		System.out.println("name: " + this.name);
		System.out.println("health: " + this.health);
		System.out.println("power: " + this.power);
	}
}
