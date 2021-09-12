public class favAnimal {
    public String name;
    

    String sound;
    int foodCount;
     public void setName(String name){
         this.name = name;
     }
     public String getName (){
         return name;
     }
    public void makeNoise() {
        System.out.println(RandomQuote.generateQuote());
        System.out.println(name + " makes the sound " + sound);
    }

    private void eatFood() {

        System.out.println("You ate a can of food, good girl!");
        foodCount++;
        System.out.println("you just ate! youll only have " + foodCount + "left");
    }
}
//    public void makeNoise() {
//        System.out.println(name + " makes the sound " + sound);
//    }


       
//    Create a class for your favorite type of animal. The class should be named for your animal
//        - Cat, Dog, Parrot etc.
//    It should have two instance variables - name and sound - and one method - makeNoise().
//    The output of the makeNoise method should be name +  " goes " + sound.
//    Create a test class with a main method to instantiate and test your class code.

  //modify your animal class so that the
    // name and noise are initiated during object construction,
    // and the animal makes a noise when it is created.

//Encapsulate your animal class.
// Use your test class to verify that your instance variables
// cannot be directly accessed and can only be accessed through your getters and setters.





        


