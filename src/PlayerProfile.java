import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PlayerProfile {
    private String name;
    private final String username;
    private int userId = 0;
    private int gold = 500;
    private int xp;
    private List<String> usernameList = new ArrayList<String>();
    private Army army = new Army();
    
    public PlayerProfile(String name, String username) {
        this.name = name;
        username = validateUsername(username);
        this.username = username;
    }
    
    public String validateUsername(String username) {
        Scanner sc = new Scanner(System.in);

        while (usernameList.contains(username)) {
            System.out.println("\nUsername already in use");
            System.out.println("Enter your username: ");
            username = sc.nextLine();
        }
        userId += 1;
        return username;
    }

   
    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }
        
    public Army getArmy() {
        return army;
    }

    public int getGold() {
        return gold;
    }

    // for testing
    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }
}
