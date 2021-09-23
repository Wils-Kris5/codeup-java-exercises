public class Movie {
    protected String name;
    protected String director;
    
    // 4. Create a class called Movie.
    // The class should define two instance variables of type String named name and director.
    // Add a constructor that takes two strings and sets the name and director properties based on the passed arguments.
    // Make it so the instance variables are not accessible from outside the Movie class. Write getters and setters for the instance variables.
    // Bonus: if the passed name or director arguments are null or empty, the constructor should throw an IllegalArgumentException
     
    public Movie() {

    }

    public String getName(){
            return name;
       }
        public String getDirector(){
            return director;
        }


}


