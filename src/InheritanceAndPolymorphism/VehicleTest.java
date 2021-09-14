package InheritanceAndPolymorphism;

public class VehicleTest {

    public static void main(String[] args){
        Vehicle honda = new Vehicle();
        honda.setName("Honda");
        System.out.println(honda.getName() + " goes:");
        honda.makeNoise();


        Truck chevy = new Truck();
        chevy.setName("Chevy");
        System.out.println(chevy.getName() + " goes:");
        chevy.makeNoise();

        Compact kia = new Compact();
        kia.setName("Kia");
        System.out.println(kia.getName() + " goes:");
        kia.makeNoise();

        Tractor johndeer = new Tractor();
        johndeer.setName("John Deer");
        System.out.println(johndeer.getName() + " goes:");
         johndeer.makeNoise();

    }
}
