package birds;

public class Orinithologist {

   // changeBirdName method
    // method that takes in a String newBirdName &
  // Bird birdToRename in parens
   public void changeBirdName(String newBirdName, Bird birdToRename) {
       String oldBirdName = birdToRename.getName();
       birdToRename.setName(newBirdName);
       System.out.println(oldBirdName + " is the old birds name, " + birdToRename.getName() + " is the new birds name. ");

   }
}
