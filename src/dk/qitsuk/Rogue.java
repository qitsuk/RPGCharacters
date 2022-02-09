package dk.qitsuk;

public class Rogue extends Character {

    public Rogue(String name) {
        super(2, 6, 1, name);
    }

    public void levelUp() {
        setIntelligence(getIntelligence() + 1);
        setDexterity(getDexterity() + 4);
        setStrength(getStrength() + 1);
        setLevel(getLevel() + 1);
    }
}
