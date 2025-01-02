import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
         //get username and name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your username: ");
        String username = sc.nextLine();

        PlayerProfile player = new PlayerProfile(username);
        System.out.println(player.getUsername());



    }
}
