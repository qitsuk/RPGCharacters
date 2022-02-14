package dk.qitsuk.character;

import dk.qitsuk.character.Character;

public class Warrior extends Character {
    public Warrior(String name) {
        super(name, charClass.WARRIOR);
    }

    public void levelUp() {
        addIntelligence(1);
        addDexterity(2);
        addStrength(3);
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
