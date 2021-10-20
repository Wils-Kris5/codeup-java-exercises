import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ExceptionsLecture {

    public String couldBeAnInteger = "42";
    public String certainlyNotAnInteger = "No integer at all here";

    public void askForAnInteger(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer");
        String userInput = sc.nextLine();
        try {
            int userInputInteger = Integer.parseInt(userInput);
            System.out.println("The integer in your string is " + userInputInteger);
        } catch (NumberFormatException nfx) {
            System.out.println("Uh oh, " + nfx.getMessage() + " there is no integer!");
        } finally {
            System.out.println("Thank you for using this complex and useful app.");
        }
    }

//    public void aMoreComplexAskForInteger(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter an integer");
//        String userInput = scanner.nextLine();
////        userInput = null;
//        try {
//            int userInputAsInteger = Integer.parseInt(userInput, 10, 15, 10);
//        } catch (NullPointerException npx){
//            System.out.println("Oops you didn't enter anything");
//            npx.printStackTrace();
//        } catch (IndexOutOfBoundsException iobx) {
//            System.out.println("Oops your string wasn't long enough");
//            iobx.printStackTrace();
//        } catch (NumberFormatException nfx){
//            System.out.println("No integer between chars 10 and 15");
//            nfx.printStackTrace();
//        } finally {
//            System.out.println("That was useful wasn't it?");
//        }
//    }

    public void aMoreComplexAskForInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        String userInput = scanner.nextLine();
        userInput = null;
        try {
            int userInputAsInteger = Integer.parseInt(userInput, 10, 15, 10);
        }  catch (IndexOutOfBoundsException iobx) {
            System.out.println("Oops your string wasn't long enough");
            iobx.printStackTrace();
        } catch (NumberFormatException nfx){
            System.out.println("No integer between chars 10 and 15");
            nfx.printStackTrace();
        } catch (Exception ex){
            System.out.println("Just a generic error");
            ex.printStackTrace();
        } finally {
            System.out.println("That was useful wasn't it?");
        }
    }

    public void subListMaker(String sentence){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int firstInt = scanner.nextInt();
        System.out.println("Please enter another integer");
        int secondInt = scanner.nextInt();
        System.out.println(sentence);
        ArrayList<String> wordArrayList = new ArrayList<String>();
        try {
            String[] stringArray = sentence.split(" ");
            for (String word : stringArray){
                wordArrayList.add(word);
            }
            List<String> shorterList =  wordArrayList.subList(firstInt, secondInt);
            String newSentence = String.join(" ", shorterList);
            System.out.println(newSentence);
        } catch (IndexOutOfBoundsException iobe) {
            System.out.println("For that sentence, I need integers between 0 and " + wordArrayList.size());
        } catch (NullPointerException npe){
            System.out.println("This method was not provided with a sentence to operate on");
        } catch (IllegalArgumentException iax) {
            System.out.println("I think you just gave me numbers in descending order.");
        } finally {
            System.out.println("Thank you!");
        }
    }

//    public void echoWord() throws IllegalArgumentException {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("I am a parrot. Please say something so I can parrot you.");
//        String userInput = sc.nextLine();
//        if (userInput.equalsIgnoreCase("curses")) {
//            throw new IllegalArgumentException();
//        }
//        System.out.println(userInput);
//    }

    public void echoWord() throws CusswordException {
        Scanner sc = new Scanner(System.in);
        System.out.println("I am a parrot. Please say something so I can parrot you.");
        String userInput = sc.nextLine();
        if (userInput.equalsIgnoreCase("curses")) {
            throw new CusswordException("How dare you? We don't allow that sort of language in here.");
        }
        System.out.println(userInput);
    }

}