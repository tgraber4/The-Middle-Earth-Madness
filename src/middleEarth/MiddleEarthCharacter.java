package middleEarth;

public class MiddleEarthCharacter {
	
	String name;
	double health;
	double power;
	
	public MiddleEarthCharacter(String name, double health, double power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}
	
	
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


	public String getRace () {
		return this.getClass().getSimpleName();
	}
	
	public boolean attack(MiddleEarthCharacter target) {
		return true;
	}
	
	public void displayInfo () {
		System.out.println("name: " + this.name);
		System.out.println("health: " + this.health);
		System.out.println("power: " + this.power);
	}
}
