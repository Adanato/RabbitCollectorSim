
import java.util.ArrayList;

public class Store {
    private ArrayList<Rabbit> rabbits;
    private String name;

    private int money;

    public Store(String name){
        this.rabbits = new ArrayList<Rabbit>();
        this.name = name;
    }
}
