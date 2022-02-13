package dk.qitsuk.armors;

public class Armor {
    private String name;
    private int levelRequirement;
    public enum armorTypes {
        CLOTH,
        LEATHER,
        MAIL,
        PLATE
    }

    // region Getters And Setters

    public String getName() {
        return name;
    }

    public int getLevelRequirement() {
        return levelRequirement;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevelRequirement(int levelRequirement) {
        this.levelRequirement = levelRequirement;
    }

    // endregion
}
