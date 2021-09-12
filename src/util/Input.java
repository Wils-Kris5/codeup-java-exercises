package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public String getString(String input) {
        System.out.println("Please enter a string:");
        String userInput = scanner.nextLine();
        return userInput;
    }

    public boolean yesNo() {
        return yesNo("enter yes or no: ");

//        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");

    }

    //Bonus
    public boolean yesNo(String prompt) {
//        System.out.println("Do you agree?");
        System.out.println(prompt);
        String answer = scanner.next();
        return answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        int userInput = scanner.nextInt();
        return userInput;
    }

    // when you call getint in the test class you give it a prompt already, so itll print it out and change out the prompt phrase
    public int getInt(int min, int max) {
        return getInt(min, max, "Enter a number between ");
    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
//        System.out.println("Enter a number between " + min + " and " + max);
        int input = scanner.nextInt();
        if (input <= min || input >= max) {
            return getInt(min, max);
        }
        return input;
    }

    //    int getInt(){
//        return getInt(1,10);
//    }
    public double getDouble(String prompt) {
        double userInput = scanner.nextDouble();
        return userInput;
    }

    // double means decimal
    public double getDouble(double min, double max) {
        double userInput = scanner.nextDouble();
        // If userInput is within the min and max, return the input
        if (userInput > min && userInput < max) {
            return userInput;
        }
        // Otherwise, call getInt again to prompt the user for a new input
        return getDouble(min, max);
    }


    //Allow all of your methods for getting input to accept an optional String parameter named prompt.
    // If passed, the method should show the given prompt to the user before parsing the input.
    //


    // When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class.
    public Input() {
        this.scanner = new Scanner(System.in);
    }

}

/*
boolean yesNo()
int getInt(int min, int max)
int getInt()
double getDouble(double min, double max)
double getDouble()*/