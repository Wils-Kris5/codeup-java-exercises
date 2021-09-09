import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {

 /* do not compate strings in Java with comparison operator
 use the CO "==" for primitive variables == compares the refrence variables that are stored in the strings, the object refrences are different

  */
 Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String userInput = sc.next();
// what not to do
//        if (userInput == "Justin") {
//            System.out.println("The user entered the string 'Justin'");
//        } else {
//            System.out.println("The user did not enter the string 'Justin'");
//        }

//  DO this
//        if (userInput .equals ("Justin")) {
//            System.out.println("The user entered the string 'Justin'");
//        } else {
//            System.out.println("The user did not enter the string 'Justin'");
//        }

    //.equals	determine, case-sensitively, if two strings have the same value.
        //.equalsIgnoreCase	determine if two strings have the same value, disregarding their casing.
        //.startsWith	determine, case-sensitively, if one string starts with another.
        //.endsWith	determine, case-sensitively, if one string ends with another.





    }
}
