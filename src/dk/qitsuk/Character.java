package dk.qitsuk;

public abstract class Character {
    private int strength;
    private int dexterity;
    private int intelligence;
    private int level;
//    private enum classes {
//        MAGE, RANGER, ROGUE, WARRIOR
//    }
    private String name;

    public Character(int strength, int dexterity, int intelligence, String name) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.level = 1;
        this.name = name;
    }

    public abstract void levelUp();

    @Override
    public String toString() {
        return "Stats for " + getName() + "\nIntelligence: " + getIntelligence() +"\nDexterity: " + getDexterity()
                + "\nStrength: " + getStrength() + "\n\n" + getName() + " is currently level: " + getLevel();
    }


    // region Setters and Getters
    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    // endregion
}

