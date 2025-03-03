import middleEarth.*;

public class Main {

	public static void main(String[] args) {
		Elf bob = new Elf("Bob", 12.50, 5);
		Elf bob2 = new Elf("Bob", 12.50, 5);
		Human timmy = new Human("Timmy", 10, 2);
		bob.attack(timmy);
		timmy.displayInfo();
	}

}
