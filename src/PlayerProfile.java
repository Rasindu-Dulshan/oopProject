import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PlayerProfile {
    private String name;
    private String username;
    private int userId = 0;
    private int gold = 500;
    private int xp;
    private List<String> usernameList = new ArrayList<String>();

    public boolean validateUsername(String username){
        if (usernameList.contains(username)){
            System.out.println("Username already in use");
            return false;
        } else {
            return true;
        }
    }

    public void createProfile() {
        
        //get username and name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();

        do {
            System.out.println("Enter your username: ");
            username = sc.nextLine();
        } while (!validateUsername(username));
        
        sc.close();
        usernameList.add(username);
        userId += 1;
    }
}
