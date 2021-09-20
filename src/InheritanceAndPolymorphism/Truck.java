package InheritanceAndPolymorphism;

public class Truck extends Vehicle {
    public Truck(){
        super();

    }
    public void makeNoise() {
        System.out.println(this.getName() + "goes Rurrn rurrm");
    }

    public void breakingDownNoise() {
        super.makeNoise();
        System.out.println("Rurrn rurrm");
        System.out.println("kssh kshh");
    }
}



//  public Truck(){
//            super("Truck");

//        }
//        public void setName(){
//            super.name = truckName;
////        super.name = duckName;
//        }
//    public Truck(String name){
//            //   this.setName(name);
//           super.setName(name);
//            System.out.println("group.B.A new Tuck is made!");
//        }
//        // anything outside the class where name genisised from cannot be refrenced
//
//    }
