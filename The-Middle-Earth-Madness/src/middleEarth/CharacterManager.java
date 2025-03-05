package middleEarth;

import java.util.Arrays;

/**
 * Manages Middle-earth characters and supports CRUD operations.
 */
public class CharacterManager {
    private MiddleEarthCharacter[] characters;
    private int size;
    private final int INITIAL_CAPACITY = 5;

    /**
     * Initializes the CharacterManager with a default capacity.
     */
    public CharacterManager() {
        characters = new MiddleEarthCharacter[INITIAL_CAPACITY];
        size = 0;
    }

    /**
     * Adds a character to the system. Expands array if full.
     * @param c the character to be added.
     * @return true if the character was added successfully.
     */
    public boolean addCharacter(MiddleEarthCharacter c) {
        if (size == characters.length) {
            expandArray();
        }
        characters[size++] = c;
        System.out.println("Character added: " + c.getName());
        return true;
    }

    /**
     * Retrieves a character by name.
     * @param name the name of the character to retrieve.
     * @return the MiddleEarthCharacter object, or null if not found.
     */
    public MiddleEarthCharacter getCharacter(String name) {
        for (int i = 0; i < size; i++) {
            if (characters[i].getName().equalsIgnoreCase(name)) {
                return characters[i];
            }
        }
        return null;
    }

    /**
     * Updates a character's details.
     * @param character the character to update.
     * @param name the new name of the character.
     * @param health the new health value.
     * @param power the new power value.
     * @return true if the update was successful, false otherwise.
     */
    public boolean updateCharacter(MiddleEarthCharacter character, String name, double health, double power) {
        if (character != null) {
            character.setName(name);
            character.setHealth(health);
            character.setPower(power);
            System.out.println("Updated character: " + character.getName());
            return true;
        }
        return false;
    }

    /**
     * Deletes a character from the system.
     * @param character the character to delete.
     * @return true if the character was successfully deleted.
     */
    public boolean deleteCharacter(MiddleEarthCharacter character) {
        for (int i = 0; i < size; i++) {
            if (characters[i] == character) {
                for (int j = i; j < size - 1; j++) {
                    characters[j] = characters[j + 1];
                }
                characters[--size] = null;
                System.out.println("Character removed: " + character.getName());
                return true;
            }
        }
        return false;
    }

    /**
     * Displays all characters in the system.
     */
    public void displayAllCharacters() {
        if (size == 0) {
            System.out.println("No characters in the system.");
            return;
        }
        for (int i = 0; i < size; i++) {
            characters[i].displayInfo();
            System.out.println("------------------");
        }
    }

    /**
     * Expands the character array size when full.
     */
    private void expandArray() {
        MiddleEarthCharacter[] newCharacters = Arrays.copyOf(characters, characters.length * 2);
        characters = newCharacters;
        System.out.println("Array size doubled. New capacity: " + characters.length);
    }
}

