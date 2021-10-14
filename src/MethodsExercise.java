
import java.util.Scanner;

class MethodsMiniExercise {

 

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

    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }
    public static long factorial(int num) {
        if (num == 1) return 1;
        return factorial(num - 1) * num;
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
    public static int getRandomInt(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    public static void promptFactorials() {
        Scanner sc = new Scanner(System.in);
        String continueMessage;
        System.out.println("Welcome to the factorial calculator!!!");
        do {
            System.out.println("What number should we calculate?");
            int userInt = getInteger(1, 10);
            System.out.println("The factorial of " + userInt + " is " + factorial(userInt) + ".");
            System.out.println("Would you like to enter another number? (Enter 'yes' or 'no')");
            continueMessage = sc.nextLine();
        } while (continueMessage.equalsIgnoreCase("yes"));
    }
    private static int inputRange(int min, int max) {
        return min - max;
    }

    public static void diceRoll() {
        System.out.println("Welcome to Dice Roll!");
        System.out.println("Enter number of sides of the dice. (1-6)");
        int noOfSidesOfDice = getInteger(1, 6);
        System.out.printf("You have rolled %d and a %d",
                getRandomInt(1, noOfSidesOfDice),
                getRandomInt(1, noOfSidesOfDice));
    }
    
    public static void main(String[] args) {

        // diceRoll();

        // System.out.println();

        // System.out.println(add(2, 2)); // 4
        // System.out.println(add(2.5, 2.5)); // 5
        //
        // System.out.println(subtract(10, 5)); // 5
        // System.out.println(subtract(8, 3)); // 5

        // System.out.println(multiply(2, 3)); // 6
        // System.out.println(multiply(3, 4)); // 12

        // System.out.println(divide(10, 2)); // 5
        // System.out.println(divide(12, 3)); // 4

        // System.out.println(modulus(10, 3)); // 1
        // System.out.println(modulus(11, 8)); // 3

        // System.out.print("Enter a number between 1 and 10: ");
        // int userInput = getInteger(1, 10);
        //
        // System.out.println("You entered: " + userInput);

        // System.out.println(factorial(1)); // 1
        // System.out.println(factorial(2)); // 2
        // System.out.println(factorial(3)); // 6
        // System.out.println(factorial(4)); // 24

        // promptUserForFactorials();
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
group.B.A factorial is a number multiplied by each of the numbers before it.
Factorials are denoted by the exclamation point (n!). Ex:

*/






