import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
         //get username and name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your username: ");
        String username = sc.nextLine();

        PlayerProfile player = new PlayerProfile(name,username);
        //for testing
       
        System.out.println(player.getName());
        System.out.println("would you like to change your name? y/n");
        String answer = sc.nextLine();

        if (answer.equals("y")) {
            System.out.println("Enter your new name: ");
            name = sc.nextLine();
            player.setName(name);
        }

        System.out.println(player.getName());
    }
}
