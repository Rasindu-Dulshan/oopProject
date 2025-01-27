public class Character {
    private final String name;
    private final int price;
    private final int attack;
    private final int defense;
    private final int health;
    private final int speed;

    // Constructor
    public Character(String name, int price, int attack, int defense, int health, int speed) {
        this.name = name;
        this.price = price;
        this.attack = attack;
        this.defense = defense;
        this.health = health;
        this.speed = speed;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

     public static Character createCharacter(String name, String characterType) {
       
        for (Character character : Database.warriors.get(characterType)) {
            if (character.getName().equals(name)) {
                return character;
            }
        }
        return null;
    }

    // Display Character Details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price + " gc");
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defense);
        System.out.println("Health: " + health);
        System.out.println("Speed: " + speed);
        System.out.println("-------------------------");
    }

}

