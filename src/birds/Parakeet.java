package birds;

public class Parakeet extends Bird {
 // Super method
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Sqwak Squak");
    }

    public Parakeet(){

        System.out.println("group.B.A new Parakeet has been made!");
    }
}
