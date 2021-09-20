package birds;


public class Bird {
 //what kind of bird
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Tweet tweet");
    }

    public void move() {
        System.out.println("Flap flap");
    }

    public Bird() {

    }

    public Bird(String name) {
        this.name = name;
        System.out.println("group.B.A new bird has been made!");
        //creating a default constructor for a quick fix BUUUUT the method is wanting

    }
}


