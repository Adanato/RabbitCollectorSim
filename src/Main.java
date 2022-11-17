import java.sql.SQLOutput;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        //Game start
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String playerName = scan.nextLine();
        Player player = new Player(playerName);
        System.out.println("Hello " + player.getPlayerName());

        //game loop
        while(true){
            System.out.println("What do you want to do?");
            System.out.println("Here is a list of options:");
            System.out.println("[1] Train your pet, [2] Battle others, [3]get more Rabbits, or [4] quit the game");
            int action = Integer.valueOf(scan.nextInt());
            if(action == 4)
            {
                System.out.println("Aight see you later!");
                break;
            }
            System.out.println("ok");
        }
        System.out.println("Thanks for playing");
    }

}