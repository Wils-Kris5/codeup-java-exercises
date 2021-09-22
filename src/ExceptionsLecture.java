import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExceptionsLecture {

   public String couldbeInt = "42";
   public String noIntAtAll = "There is no Integer here at all";

    public void askForAnInteger(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer or else..");
        String userInput = sc.nextLine();
        try{
            int userInputInteger = Integer.parseInt(userInput);
            System.out.println("The Integer in your string is " +
                    userInputInteger);
        }  catch (NumberFormatException nfx){
            System.out.println("Oh no, " + nfx.getMessage() + " there is NO INTEGER!!!");
        }  finally {
            System.out.println("Wow, good for you, you know how to input an integer, thanks for coming.");
        }
    }

    public void aMoreComplexAskForInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        String userInput = scanner.nextLine();
        // userInput =  null;
        try {
            //userInput = null;
            int userInputAsInteger = Integer.parseInt(userInput, 10, 15, 10);
        } catch (NullPointerException npx){
            System.out.println("Oops you didn't enter anything");
            npx.printStackTrace();
        } catch (IndexOutOfBoundsException iobx) {
            System.out.println("Oops your string wasn't long enough");
            iobx.printStackTrace();
        } catch (Exception nfx){
            System.out.println("Just a generic error");
            nfx.printStackTrace();
        } finally {
            System.out.println("That was useful wasn't it?");
        }
    }

 // javiers mini exercise:

    //Parameters:
    //fromIndex - low endpoint (inclusive) of the subList
    //toIndex - high endpoint (exclusive) of the subList
    //Returns:
    //a view of the specified range within this list
    //Throws:
    //IndexOutOfBoundsException - if an endpoint index value is out of range (fromIndex < 0 || toIndex > size)
    //IllegalArgumentException - if the endpoint indices are out of order (fromIndex > toIndex)


    public void subListMaker(String sentence) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");

        int firstInt = scanner.nextInt();
        System.out.println("Please enter another integer");
        int secondInt = scanner.nextInt();
        System.out.println(sentence);
        ArrayList<String> wordArrayList = new ArrayList<String>();
        try {
            String[] stringArray = sentence.split(" ");
            for (String word : stringArray) {
                wordArrayList.add(word);

                wordArrayList.addAll(Arrays.asList(stringArray));
            }
            List<String> shorterList = wordArrayList.subList(firstInt, secondInt);
            String newSentence = String.join(" ", shorterList);
            System.out.println(newSentence);
        } catch (IndexOutOfBoundsException iobe) {
            System.out.println("For this sentence, I need Integers between 0 and " + wordArrayList.size());
        } catch (IllegalArgumentException iae) {
            System.out.println("HEY YOU CANT DO THAT, IT'S ILLEGAL " + wordArrayList.size());
        } catch (NullPointerException npe) {
            System.out.println("meh you're null " + wordArrayList.size());
        } finally {
            System.out.println("forgot what goes here fix later");
        }


        }
        public void echoWord () throws IllegalArgumentException {
            Scanner sc = new Scanner(System.in);
            System.out.println("I'm a parrot. say something ill repeat it back");
            String userInput = sc.nextLine();
            if (userInput.equalsIgnoreCase("swear")) {
                throw new IllegalArgumentException();
            }
            System.out.println(userInput);
        }
    }


 //Do not put a generic catch statement at the bottom like your switch statement
    //you want your default at the bottom
    

// Final Variables  CANT be altered / but Final Classes CAN
//HEY IF YOU GET TOSSED AN ERROR YOU NEED TO GO TO :
                         // *( JAVA ORACLE REFER TO DOCUMENTATION FOR THE RESOLUTION

 //Investigate the substring method for String objects in the Java API.
    // Find out what kind of exception it throws. Create a test class with a main method.
    // Set up a try-catch block that defines a string and finds its length.
    // Once you have the length of your string, modify your program so it creates a substring from your original string,
    // but give it an index that doesn't exist so you get the error message.


 // Types of Exceptions
    // two main categories: checked and unchecked:
//Unchecked-  These are mostly exceptions that are built into the Java language,
// and do not need to be explicitly dealt with.

//Checked exceptions must be handled in our code, either with a try-catch, or by declaring them in the method signature with the throws keyword
// Checked exceptions are enforced by the compiler,
// meaning that if a checked exception is not handled,
// the code will not compile.

 // === RUN TIME EXCEPTION ===
/*
   So There are no garuntees in your file compiliations just like in life,
   when you test your code it may compile in the test like it would on paper
 BUT when you run it, it WILL throw an ERROR   
    RUN TIME EXCEPTIONS are made for these situations and need to be factored into your code
    
 */


