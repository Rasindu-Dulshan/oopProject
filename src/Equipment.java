public class Equipment {
    private final String name;
    private final int price;
    private final int attack;
    private final int defense;
    private final int health;
    private final int speed;

    // Constructor
    public Equipment(String name, int price, int attack, int defense, int health, int speed) {
        this.name = name;
        this.price = price;
        this.attack = attack;
        this.defense = defense;
        this.health = health;
        this.speed = speed;
    }
}
