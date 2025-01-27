import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //get username and name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your username: ");
        String username = sc.nextLine();

        //set name and username
        PlayerProfile player = new PlayerProfile(name, username);
       
        //ask if user wants to change name
        System.out.println("would you like to change your name? y/n");
        String answer = sc.nextLine();
        if (answer.equals("y")) {
            System.out.println("Enter your new name: ");
            name = sc.nextLine();
            player.setName(name);
        }
 
        // get warriors from user and create army
        int goldCoins = player.getGold();
        do {
            goldCoins = player.getGold();
            for (String warriorType : Database.warriorTypes) {
                System.out.println(String.format("\nbelow are the %s type warriors:\n", warriorType));
                for (Character character : Database.warriors.get(warriorType)) {
                    character.display();
                    System.out.println("-------------------------");
                }

                //preventing invalid warrior name
                Character characterChosen = null;
                do{
                    System.out.println(String.format("Enter your chosen warriror of %s: ", warriorType));
                    String choice = sc.nextLine();
                    // create character using warrior type and given warrior name
                    characterChosen = Character.createCharacter(choice, warriorType);
                    if (characterChosen == null) {
                        System.out.println("\nInvalid warrior name. Please try again.");
                    }
                   
                } while (characterChosen == null);
                       
                //reduce gold form player
                goldCoins -= characterChosen.getPrice();
                if (goldCoins < 0) {
                    System.out.println("\nYou don't have enough gold. Let's begin purchase again.");
                    player.getArmy().chosenWarriors.clear();
                    break;
                }
                // add character to warrior list
                player.getArmy().createWarrirorList(characterChosen);
                System.out.println("\nYour gold: " + goldCoins + " gc"); 
               
            }
        } while (goldCoins < 0);
        player.setGold(goldCoins);

        //display army
        System.out.println("\nYour army:\n");
        for (Character character : player.getArmy().chosenWarriors) {
            character.display();
        }

        System.out.println("would you like to change ");

        System.out.println("would you like to buy any equipment? y/n");
        answer = sc.nextLine();
    }
}
