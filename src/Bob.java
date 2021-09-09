import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

      
      Scanner scanner = new Scanner(System.in);
        String bobInput = "";
        System.out.print("Fine, be that way!");
         if (bobInput.endsWith("!")) {
            System.out.println("Woah!, Chill out you cray..");
        } else if(bobInput.endsWith("?")){
             System.out.println("Sure.");
         }

        /*PRACTICE:      String literals:   System.out.println("this is a string literal its a way to set up a sting as a obj on the fly);
  another way: String myString2 = "i love java";
      if(myString == myString2){
       System.out.println("Strings are equal");

        Bob answers 'Sure.'  (the input ends with a question mark)
        chill out!'  (the input ends with an exclamation mark)
 'Fine. Be that way!' (empty input)
 'Whatever.' to anything else.
  */





    }
}
