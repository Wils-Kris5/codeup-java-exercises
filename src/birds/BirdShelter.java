package birds;

public class BirdShelter {
    public void visitThelterAndHearThePrettyBirdies(Bird[] allTheBirdsInTheShelter) {
        for (Bird bird : allTheBirdsInTheShelter) {
            System.out.println(bird.getName() + " goes ");
            bird.makeNoise();
        }
    }
}
