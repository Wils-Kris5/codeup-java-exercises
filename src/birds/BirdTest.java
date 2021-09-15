package birds;
public class BirdTest {

        public static void main(String[] args) {
//       Bird cardinal = new Bird();
//       cardinal.setName("cardinal");
            Bird cardinal = new Bird("Cardinal");
            System.out.println(cardinal.getName() + " says: ");
            cardinal.makeNoise();
            cardinal.move();

//            Duck mallard = new Duck();
//               mallard.setName("Mallard");
            Duck mallard = new Duck("Mallard");
            System.out.println(mallard);
            System.out.println(mallard.getName() + " says:");
               mallard.makeNoise();
               mallard.move();

            Parakeet budgerigar = new Parakeet();
            budgerigar.setName("Budgerigar");
            System.out.println(mallard.getName() + " says:");
            budgerigar.makeNoise();
            budgerigar.move();

            Penguin gunthur = new Penguin();
            gunthur.setName("Gunthur");
            System.out.println(gunthur.getName() + " says");
            gunthur.makeNoise();
            gunthur.move();
     //when you call a subclass constr it calls the superclass constr first
            //now we wanna do all these methods in one line so in Bird.java we will make a constructor that takes a String name
           Bird myBird = new Duck();
           myBird.move();
           myBird.makeNoise();
            
        }
    }

