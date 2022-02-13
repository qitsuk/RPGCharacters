package dk.qitsuk.character;

public class Ranger extends Character {

    public Ranger(String name) {
        super(name, charClass.RANGER);
    }

    public void levelUp() {
        addIntelligence(1);
        addDexterity(5);
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
