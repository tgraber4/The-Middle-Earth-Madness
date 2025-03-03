import middleEarth.*;

public class Main {

	public static void main(String[] args) {
		Elf bob = new Elf("Bob", 12.50, 5);
		Elf bob2 = new Elf("Bob", 12.50, 5);
		bob.attack(bob2);
		bob2.displayInfo();
	}

}
