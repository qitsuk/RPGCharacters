package dk.qitsuk.character;
import dk.qitsuk.character.Character.*;

public class Mage extends Character {
    public Mage(String name) {
        super(name, charClass.MAGE);
    }

    public void levelUp() {
        setLevel(getLevel() +1);
        addIntelligence(5);
        addDexterity(1);
        addStrength(1);
        increaseLevel();
    }

    @Override
    public void equipWeapon() {

    }

    @Override
    public void equipArmor() {

    }
}
