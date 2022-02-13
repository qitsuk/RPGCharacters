package dk.qitsuk.character;

public abstract class Character {
    private int strength;
    private int dexterity;
    private int intelligence;
    private int level;
    private final String name;
    private enum slot {HEAD, BODY, LEGS, WEAPON}
    public enum charClass {MAGE, ROGUE, RANGER, WARRIOR}
    private String thisClass;

    public Character(String name, charClass classType) {
        this.level = 1;
        this.name = name;
        switch (classType) {
            case MAGE -> {
                intelligence = 8;
                dexterity = 1;
                strength = 1;
                thisClass = classType.name();
            }
            case RANGER -> {
                intelligence = 1;
                dexterity = 7;
                strength = 1;
                thisClass = classType.name();
            }
            case ROGUE -> {
                intelligence = 1;
                dexterity = 6;
                strength = 2;
                thisClass = classType.name();
            }
            case WARRIOR -> {
                intelligence = 1;
                dexterity = 2;
                strength = 5;
                thisClass = classType.name();
            }
            default -> {
            }
        }
    }

    public abstract void levelUp();

    public abstract void equipWeapon();

    public abstract void equipArmor();

    @Override
    public String toString() {
        return "Stats for " + getName() + " The " + thisClass + "\nIntelligence: " + getIntelligence() +"\nDexterity: " + getDexterity()
                + "\nStrength: " + getStrength() + "\n\n" + getName() + " is currently level: " + getLevel();
    }

    public void addStrength(int strength) {
        this.strength += strength;
    }

    public void addIntelligence(int intelligence) {
        this.intelligence += intelligence;
    }

    public void addDexterity(int dexterity) {
        this.dexterity += dexterity;
    }

    public void increaseLevel() {
        this.level++;
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

