package birds;
public class BirdTest {

        public static void main(String[] args) {
       Bird cardinal = new Bird();
       cardinal.setName("cardinal");
            System.out.println(cardinal.getName() + " says: ");
            cardinal.makeNoise();
            cardinal.move();

            Duck mallard = new Duck();
               mallard.setName("Mallard");
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


        }
    }

