package dk.qitsuk;

import dk.qitsuk.character.Character;
import dk.qitsuk.character.Mage;
import dk.qitsuk.character.Ranger;
import dk.qitsuk.character.Rogue;
import dk.qitsuk.character.Warrior;
import dk.qitsuk.weapons.Weapon;

public class Main {
    public static void main(String[] args) {
        Character mage = new Mage("Gwen");
        mage.equipWeapon();
    }

}
