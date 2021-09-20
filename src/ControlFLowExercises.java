import java.util.Scanner;

public class ControlFLowExercises {
    public static void main(String[] args) {

        //Loop Basics
        //
        //While
        //
        //Create an integer variable i with a value of 5.
        //Create a while loop that runs so long as i is less than or equal to 15
        //Each loop iteration, output the current value of i, then increment i by one.
//1
//        int i = 5;
//        while(i <= 15){
//            System.out.printf("%s%s",i, " ");
//            i++;
//        }

        //Your output should look like this:
        //
        //5 6 7 8 9 10 11 12 13 14 15     it does.

        //Do While

        //Create a do-while loop that will count by 2's starting with 0 and ending at 100.
        // Follow each number with a new line.
        //Alter your loop to count backwards by 5's from 100 to -10.
        //Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

//a
//            int i = 0;
//           do {
//               System.out.println(i);
//               i+=2;
//           } while (i < 100);

//b
//           int i = 100;
//           do {
//               System.out.println(i);
//               i-=5;
//           } while (i > -15);

//c
//        long i = 2;
//        do {
//            System.out.println(i);
//                 i = i*i;
//        } while (i < 1_000_000);
//
//
//    }


        // 2
        // 4
        // 16
        // 256
        // 65536

        //For
        // Refactor the previous two exercises to use a for loop instead.
    // for-b
//        int i;
//        for (int i = 100; i >= 0; i -= 5) {
//            System.out.println(i);
//        }

//for-c
//        long i;
//        for(i = 1; i <= 1000; i++){
//            System.out.println(i*i);
//        }



        //Fizzbuzz

        //One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
        //Write a program that prints the numbers from 1 to 100.
        //For multiples of three: print “Fizz” instead of the number.
        //For the multiples of five: print “Buzz”.
        //For numbers which are multiples of both three and five: print “FizzBuzz”.


        int i = 1;
        while(i <= 100){
          if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0){
              System.out.println("Fizz");
          } else if(i % 5 == 0) {
            System.out.println("Buzz");
        }  else {
              System.out.println(i);
          }
          i++;
   }

       
        //Display a table of powers.
        //
        //Prompt the user to enter an integer.
        //Display a table of squares and cubes from 1 to the value entered.
        //Ask if the user wants to continue.
        //Assume that the user will enter valid data.
        //Only continue if the user agrees to.
        //Example Output
        //
      Scanner scanner = new Scanner(System.in);
        System.out.print("What number would you like to go up to? ");
          int userInput = scanner.nextInt();
        System.out.println("");
        System.out.println("Here is your table!");
        

//        What number would you like to go up to? 5
//
//        Here is your table!
//
//                number | squared | cubed
//                ------ | ------- | -----
//                1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125

        //What number would you like to go up to? 5
        //
        //Here is your table!
        //
        //number | squared | cubed
        //------ | ------- | -----
        //1      | 1       | 1
        //2      | 4       | 8
        //3      | 9       | 27
        //4      | 16      | 64
        //5      | 25      | 125
        //Convert given number grades into letter grades.
        //
        //Prompt the user for a numerical grade from 0 to 100.
        //Display the corresponding letter grade.
        //Prompt the user to continue.
        //Assume that the user will enter valid integers for the grades.
        //The application should only continue if the user agrees to.
        //Grade Ranges:
        //
        //group.B.A : 100 - 88
        //group.B : 87 - 80
        //C : 79 - 67
        //D : 66 - 60
        //F : 59 - 0

        //   Real Genius
//}

        }
    }
