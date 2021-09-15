package InheritanceAndPolymorphism;

public class Car extends Vehicle{

    public void makeNoise() {
         super.makeNoise();
        System.out.println("Beep beep");
    }

    public Car(){
        super();
    }

}
