package dk.qitsuk;

import dk.qitsuk.character.Character;
import dk.qitsuk.character.Mage;
import dk.qitsuk.character.Ranger;
import dk.qitsuk.character.Rogue;
import dk.qitsuk.character.Warrior;

public class Main {
    public static void main(String[] args) {
        Character mage = new Mage("Gwendolina");
        Character ranger = new Ranger("Legolas");
        Character rogue = new Rogue("Kali");
        Character warrior = new Warrior("Conan");

        System.out.println(mage);
        System.out.println(ranger);
        System.out.println(rogue);
        System.out.println(warrior);
    }

}
