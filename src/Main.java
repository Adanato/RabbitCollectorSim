import Game.Player;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;
//import java.awt.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        //Game start
        ImageIcon rat = new ImageIcon("C:\\Users\\Adam\\IdeaProjects\\Rabbit Collector Sim\\Resources\\rabbitIcon.png");
        Border border = BorderFactory.createLineBorder(ColorUIResource.BLUE, 5);
        JLabel label = new JLabel();
        label.setText("Press start to begin");
        label.setIcon(rat);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.NORTH);
        label.setHorizontalAlignment(JLabel.CENTER);

        JFrame frame = new JFrame();
        frame.setTitle("Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);
        frame.setSize(1920,1080);
        frame.setVisible(true);
        frame.add(label);

        ImageIcon image = new ImageIcon("C:\\Users\\Adam\\IdeaProjects\\Rabbit Collector Sim\\Resources\\rabbitIcon.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(ColorUIResource.getHSBColor(0, 166, 227));
        Scanner scan = new Scanner(System.in);


        System.out.println("What is your name?");
        String playerName = scan.nextLine();
        Player player = new Player(playerName);
        System.out.println("Hello " + player.getPlayerName());

        //game loop
        while(true){
            System.out.println("What do you want to do?");
            System.out.println("Here is a list of options:");
            System.out.println("[1] Places.Train your pet, [2] Battle others, [3]get more Rabbits, or [4] quit the game");
            int action = scan.nextInt();
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