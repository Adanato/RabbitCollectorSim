package Places;
import Entities.*;
import java.util.ArrayList;
import Game.*;
public class Store implements Place {
    private ArrayList<Rabbit> lowTierRabbits;
    private ArrayList<Rabbit> midTierRabbits;
    private ArrayList<Rabbit> highTierRabbits;
    private ArrayList<Rabbit> featuredRabbits;
    private String name;

    private int money;

    public Store(String name) {
        this.name = name;
        this.featuredRabbits = new ArrayList<>();
        this.lowTierRabbits = new ArrayList<>();
        this.midTierRabbits = new ArrayList<>();
        this.highTierRabbits = new ArrayList<>();
    }
    public void run(){

    }
    /**
     * Refreshes and refills the array list of rabbits.
     */
    public void stockUp(){

    }
    /**
     * Checks if the store is opened or not in realTime;
     */
    public boolean isOpen(){
        return true;
    }

    public void sell(int shelf, Player player){

    }

}
