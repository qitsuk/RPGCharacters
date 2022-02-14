package dk.qitsuk.character;

public class Rogue extends Character {

    public Rogue(String name) {
        super(name, charClass.ROGUE);
        setIntelligence(1);
        setDexterity(6);
        setStrength(2);
    }

    public void levelUp() {
        addIntelligence(1);
        addDexterity(4);
        addStrength(1);
        increaseLevel();
    }

    @Override
    public String equipWeapon() {
        return "";
    }

    @Override
    public String equipArmor() {
        return "";
    }
}
