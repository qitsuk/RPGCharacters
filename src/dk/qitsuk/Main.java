package dk.qitsuk;

public class Main {
    public static void main(String[] args) {
        createMage("Gwendolina");
    }

    public static void createMage(String name) {
        Mage mage = new Mage(name);
        System.out.println(mage);
    }

}
