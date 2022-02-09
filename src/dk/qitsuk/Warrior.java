package dk.qitsuk;

public class Warrior extends Character {
    public Warrior(String name) {
        super(5,2,1, name);
    }

    public void levelUp() {
        setIntelligence(getIntelligence() + 1);
        setDexterity(getDexterity() + 2);
        setStrength(getStrength() + 5);
    }
}
