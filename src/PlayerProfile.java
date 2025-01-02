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
    

    public PlayerProfile(String username) {
        usernameList.add("test");
        usernameList.add("test2");
        username = validateUsername(username);
        this.username = username;
    }
    
     public String validateUsername(String username){
            Scanner sc = new Scanner(System.in);

            while(usernameList.contains(username)){
                System.out.println("Username already in use");
                System.out.println("Enter your username: ");
                username = sc.nextLine();
            }
            return username;
        }

        // for testing
        public String getUsername() {
            return username;
        }

}
