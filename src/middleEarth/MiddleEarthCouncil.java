package middleEarth;

/**
 * class for managing Middle-earth characters.
 */
public class MiddleEarthCouncil {
    private static MiddleEarthCouncil instance;
    private CharacterManager characterManager;

    /**
     * Private constructor to prevent instantiation.
     */
    private MiddleEarthCouncil() {
        characterManager = new CharacterManager();
    }

    /**
     * Retrieves the single instance of MiddleEarthCouncil.
     * @return the singleton instance of MiddleEarthCouncil.
     */
    public static MiddleEarthCouncil getInstance() {
        if (instance == null) {
            instance = new MiddleEarthCouncil();
        }
        return instance;
    }

    /**
     * Provides access to the CharacterManager.
     * @return the CharacterManager instance.
     */
    public CharacterManager getCharacterManager() {
        return characterManager;
    }
}
