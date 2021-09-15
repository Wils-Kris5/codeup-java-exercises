package birds;

public class BirdShelter {
    public void visitThelterAndHearThePrettyBirdies(Bird[] allTheBirdsInTheShelter) {
        for (Bird bird : allTheBirdsInTheShelter) {
            System.out.println(bird.getName() + " goes ");
            bird.makeNoise();
        }
    }
    public void  hospitalizedShelterBirds(Bird birdPatient){
        //just changed the name of the method for easier understanding and context
        birdPatient.makeNoise();
    }
}
