public class Player {
    private String playerName;
    private int money;
    private Rabbit pet;

    public Player(String playerName){
        this.playerName = playerName;
        money = 0;
        pet = new Rabbit("Rabbo");
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
