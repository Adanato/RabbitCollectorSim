public class Rabbit {
    private String name;
    private int age;
    private String type;
    private String weapon;
    private int health;
    private int speed;
    private int strength;
    private int intelligence;

//Constructors
    //default rabbit
    public Rabbit(String name){
        this.name = name;
        this.age = 0;
        this.type = "basic";
        this.weapon = "bite";
        this.health = 1;
        this.speed = 1;
        this.strength = 1;
        this.intelligence = 1;
    }

//Getters and setters
//_____________________________________________________________________________________________________________________
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
