import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
      //  double pi = 3.14159;
     //   System.out.format("The value of pi is approximately %.2F", pi);


        Scanner scanner = new Scanner(System.in);
//        System.out.println("\n Please enter an integer ");
//        int usrInput = scanner.nextInt();
//       System.out.println(usrInput);
//
//       System.out.println("Enter three words: ");
//       String word1 = scanner.next();
//       String word2 = scanner.next();
//       String word3 = scanner.next();
//
//       System.out.printf("Your three words were: %n%s%n%s%n%s. ", word1, word2, word3);
//            String length = scanner;

        System.out.println("Please enter the length of your classroom in feet:");
        int lengthInFeet = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter the width of your classroom in feet: ");
        int widthInFeet = Integer.parseInt(scanner.nextLine());
        int areaInSquareFeet = widthInFeet * lengthInFeet;
        int perimeterInFeet = 2 * (widthInFeet + lengthInFeet);
        System.out.printf("The area of your room is %d square feet and the perimeter is %d feet.", areaInSquareFeet, perimeterInFeet);

    }
}
       




        












