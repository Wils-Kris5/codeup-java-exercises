
import java.util.Scanner;

public class MethodsExercise {

    public static void main(String[] args) {
        System.out.println(getInteger(1, 10));
    }


    public static int addInts(int min, int max) {
        return min + max;
    }

    public static int SubtractInts(int min, int max) {
        return min - max;
    }

    public static int multiplyInts(int min, int max) {
        return min * max;
    }

    public static int divideInts(int min, int max) {
        return min % max;
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        if (userInput >= max) return getInteger(min, max);


        if (userInput <= min) return getInteger(min, max);
        System.out.println("hey good for you");
        return userInput;
    }

    private static int inputRange(int min, int max) {
        return min - max;
    }
    
}
 /*#1Create four separate methods. Each will perform an arithmetic operation:

Addition
Subtraction
Multiplication
Division
#2 Create a method that validates that user input is in a certain range

The method signature should look like this:


public static int getInteger(int min, int max);
and is used like this:


System.out.print("Enter a number between 1 and 10: ");
int userInput = getInteger(1, 10);
If the input is invalid, prompt the user again.

Hint: recursion might be helpful here!
 Calculate the factorial of a number.

Prompt the user to enter an integer from 1 to 10.
Display the factorial of the number entered by the user.
Ask if the user wants to continue.
Use a for loop to calculate the factorial.
Assume that the user will enter an integer, but verify it’s between 1 and 10.
Use the long type to store the factorial.
Continue only if the user agrees to.
A factorial is a number multiplied by each of the numbers before it.
Factorials are denoted by the exclamation point (n!). Ex:

*/






