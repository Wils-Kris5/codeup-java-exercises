import java.util.Scanner;

public class MethodsMiniExercises {
    // TODO: break the following code apart into a few methods
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter an input.");
//        String stringInput = sc.nextLine();
//        System.out.println("Please enter an integer.");
//        int intInput = sc.nextInt(); // assume the user will enter a valid integer
//        if (stringInput.length() == intInput) {
//            System.out.println("That matches the length of the input!");
//        } else {
//            System.out.println("That doesn't match the length of the input!");
//        }
//    }

    public static void main(String[] args) {
        System.out.println(getDifference(7, 5));
        System.out.println(getDifference(5, 7));
        System.out.println(10);
        System.out.println(getDifference(1.5, 3));
        System.out.println(getDifference(2.5, 1.5));
        System.out.println(getDifference(8.2));


    Scanner sc = new Scanner(System.in);
        String stringInput = getInput("Please enter an input.", sc);
        int intInput = getNum("Please enter an integer.", sc);
        boolean numsMatch = matches(stringInput.length(), intInput);
        print(getMessage(numsMatch));
    }
    public static int getDifference(int num1, int num2) {
        if (num1 > num2) return num1 - num2;
        return num2 - num1;
    }
    public static int getDifference(int num) {
        return getDifference(num, 0);
    }
    public static double getDifference(double num1, double num2) {
        if (num1 > num2) return num1 - num2;
        return num2 - num1;
    }
    public static double getDifference(double num) {
        return getDifference(num, 0);
    }

    public static int getNum(String message, Scanner sc) {
        print(message);
        return sc.nextInt();
    }

    public static String getInput(String message, Scanner sc) {
        print(message);
        return sc.nextLine();
    }

    public static String getMessage(boolean doesItMatch) {
        if (doesItMatch) {
            return "That matches the length of the input!";
        } else {
            return "That doesn't match the length of the input!";
        }
    }

    public static void print(String message) {
        System.out.println(message);
    }

    public static boolean matches(int len, int num) {
        return len == num;
    }

   
}
