package birds;

public class BirdShelterTest {
    public static void main(String[] args){
     //polymorphic wanna cracker
        Bird[] birds = new Bird[3];

        birds[0] = new Duck();
        birds[0].setName("Mallard");
        birds[1] = new Parakeet();
        birds[1].setName("Budgerigar");
        birds[2] = new Penguin();
        birds[2].setName("Gunthur");

        BirdShelter healingWings = new BirdShelter();
        healingWings.visitThelterAndHearThePrettyBirdies(birds);
    }
}
