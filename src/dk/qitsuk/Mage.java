package dk.qitsuk;

public class Mage extends Character {
    public Mage(String name) {
        super(1,1, 8, name);
    }

    public void levelUp() {
        setIntelligence(getIntelligence() + 5);
        setDexterity(getDexterity() + 1);
        setStrength(getStrength() +1 );
        setLevel(getLevel() +1);
    }


}
