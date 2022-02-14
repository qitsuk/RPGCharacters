package dk.qitsuk.weapons;

public class Weapon {
    public String name;
    public int levelRequirement;
    public enum weaponType {
        AXE,
        BOW,
        DAGGER,
        HAMMER,
        STAFF,
        SWORD,
        WAND
    }

    public void setWeaponType(weaponType weaponType) {
    }
}
