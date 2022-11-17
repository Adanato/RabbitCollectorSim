public class Player {
    private String playerName;
    private int money;
    private Rabbit pet;

    public Player(String playerName){
        this.playerName = playerName;
        money = 0;
        pet = new Rabbit("Rabbo");
    }
}
