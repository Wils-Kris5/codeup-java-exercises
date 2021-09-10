
public class Fighter {
    // instance variables
    public String name;
    public int hitPoints;
    public int maxDamage;

    // methods
    public void printStats() {
        System.out.println(name + " has " + hitPoints + " hit points and can do " + maxDamage + " damage.");
    }

    public void battleRoar() {
        System.out.println("I am " + name + ", prepare to be defeated!");

//        System.out.println(Quote.randomQuote());
    }

    // you call a static method with a class name (e.g., D20.roll20())


    public int attackRoll() {
        return D20.roll20();
    }

    // default constructor
    public Fighter() {
    }

    public Fighter(String name, int hitPoints, int maxDamage) {
        System.out.println("A new fighter has emerged!");
        this.name = name;
        this.hitPoints = hitPoints;
        this.maxDamage = maxDamage;
        this.printStats();
    }
}
