package Game;

import Entities.Rabbit;
import java.util.*;
public class Player {
    private String playerName;
    private int money;
    private Rabbit pet;
    private ArrayList<Rabbit> rabbitCarrier;

    public Player(String playerName){
        this.playerName = playerName;
        money = 0;
        pet = new Rabbit("Rabbo");
        rabbitCarrier = new ArrayList<Rabbit>();
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Rabbit getPet() {
        return pet;
    }

    public void setPet(Rabbit pet) {
        this.pet = pet;
    }
}
