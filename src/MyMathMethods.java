public class MyMathMethods {

    //Have it take two integer parameters and return the product of the two integers
// Do not create a main method in your MyMathMethods class Instead, create a test class,
// and run your multiply method from a main method in your test class
//If you want a bonus, you can overload the method with a version that takes doubles
// instead of ints as its parameters
    //Method overloading is defining multiple methods with the same name, but with different parameter type, parameter order, or number of parameters.
    //
    //Overloaded methods can call other versions of themselves, and are commonly used to provide default values for arguments.

    public static int multiply(int min, int max) {
        return min * max;
    }


    // public static int multiply(int full, float half) { return full * half; }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    // overload the multiply method so that it takes doubles as well as ints


    // write a pub stat method that works with both ints and doubles (method overloading) and returns the result of dividing the two passed bumbers.
    // write a pub stat method named sum that takes in an array of int numbers( not a list) and returns the sum of those numbers
    //// 4. Create a class called Movie. The class should define two instance variables of type String named name and director. Add a constructor that takes two strings and sets the name and director properties based on the passed arguments. Make it so the instance variables are not accessible from outside the Movie class. Write getters and setters for the instance variables.
    //
    //    // Bonus: if the passed name or director arguments are null or empty, the constructor should throw an IllegalArgumentException
    public static int quotient(int num1, int num2) {
        return num1 % num2;
    }

    public static double quotient(double num1, double num2) {
        return num1 % num2;
    }

    public static int sum(int[] myNumArr) {
        int sum = 0;
        for (int i = 0; i < myNumArr.length; i++) {
            sum += myNumArr[i];
        }
          return sum;
    }
}


