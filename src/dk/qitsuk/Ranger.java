package dk.qitsuk;

public class Ranger extends Character {
    public Ranger(String name) {
        super(1, 7, 1, name);
    }

    public void levelUp() {
        setIntelligence(getIntelligence() + 1);
        setDexterity(getDexterity() + 7);
        setStrength(getStrength() + 1);
        setLevel(getLevel() + 1);
    }


}
