package InheritanceAndPolymorphism;

public class Tractor extends Vehicle {

    public void makeNoise() {
        System.out.println(this.getName() + " KSSShhh");
    }
        public void breakingDownNoise() {
               super.makeNoise();
            System.out.println(" kee kee kee");
            System.out.println("kur ploop");

        }

    }

