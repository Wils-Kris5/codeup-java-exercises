package InheritanceAndPolymorphism;

public class VehicleTest {

    public static void main(String[] args){
        Vehicle car = new Vehicle();
        car.setName("Honda");
        System.out.println(car.getName() + " goes: ");
        car.makeNoise();


        Truck chevy = new Truck();
        chevy.setName("Chevy");
        System.out.println(chevy.getName() + " goes:");
        chevy.makeNoise();

        Compact kia = new Compact();
        kia.setName("Kia");
        System.out.println(kia.getName() + " goes:");
        kia.makeNoise();


    }
}
