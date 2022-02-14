package dk.qitsuk.character;
import dk.qitsuk.character.Character.*;
import dk.qitsuk.customexceptions.InvalidArmorException;
import dk.qitsuk.customexceptions.InvalidWeaponException;

public class Mage extends Character {
    private boolean canEquipWeapon = false;
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
    public String equipWeapon() {
        try {
            if (!canEquipWeapon) {
                throw new InvalidWeaponException("This class cannot equip this weapon!");
            }
        } catch(InvalidWeaponException iwe) {
            return iwe.getMessage();
        }
        return "Weapon equipped";
    }

    @Override
    public String equipArmor() {
        try {
            if (!canEquipWeapon) {
                throw new InvalidArmorException("This class cannot equip this armor.");
            }
        } catch (InvalidArmorException iae) {
            return iae.getMessage();
        }
        return "Armor equipped";
    }
}
