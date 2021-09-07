public class ControlStatementsAndLoops {


    private static String theQuestion;

    public static void main(String[] args) {

//        short y = -5;
//        y = 12;
//        y = 32450;
//        // y = 33000; //incompatible types: possible lossy conversion from int to short
//
//        if (y < 0) {
//            System.out.println("The variable y contains a negative number");
//        } else if (y >= 0 && y < 30000) {
//            System.out.println("The variable y contains a positive number");
//        } else {
//            System.out.println("The variable y is dangerously close to the max value for short type variables, which is " + Short.MAX_VALUE);
//        }
//        // && works the same as when it did in javascript
//
//        String customerChoice = "vanilla";
//
//        switch (customerChoice) {
//            case "vanilla":
//                System.out.println("One vanilla coming right up");
//                break;
//            case "chocolate":
//                System.out.println("chocolate coming right up");
//                break;
//            case "strawberry":
//                System.out.println("strawberry coming right up");
//                break;
//            default:
//                System.out.println("We don't have that");
//                break;
//        }


//         write a short Java program that tests if a number is positive or negative.
//        Define a few numeric variables and run them through a decision.
//                If the number is positive, output that it is positive, and if it is negative,
//                    output that it is negative.
//

        //What is the difference between compiled and interpreted languages? Static and dynamic? Which is Java, which is JavaScript?
//compiled programming languages target talking to the program directly from a machine. Interpreted language a different program (a interpreter) reads and executes the code

        //What does a compiler do?
        //  a software that translates source code written in a high level language

        //What is a virtual machine?
        //is a compute resource that uses software instead if a physical  computer harddrive

        //What is the difference between bytecode and source code files?
        // byte
        //Do you need the JDK or the JRE to play minecraft?
        //Why would you use an IDE as opposed to a simple text editor when writing Java code?
        //What is the purpose of the out directory?
        //Why does Java have multiple number data types? Why use one over the other?
        //Is a string a primative type in Java?
        //What is the difference between explicit and implicit casting? What are specific examples?
        //What are some differences between char and String types?
        //What happens if you store a number in a variable greater than the data type’s constraints?

//    Javier Lecture Notes:
        // You can solve any programming problem with just
        // Statements
        // Decisions
        // Loops

        // You can:
        // Do something
        // Do something under a certain condition
        // Do something again and again

        // Key differences about Java statements with respect to JavaScript statements:
        // no Automatic Semicolon Insertion
        // all variables need a type declaration

        // Conditional branching
//        int x = 5;
//        if (x == 5) {
//            System.out.println("If you are reading this, x must be 5 since this is running");
//        }
//        System.out.println("On the other hand, this doesn't mean anything because it runs regardless of what x is");

//        int y = 2;
//        y = 3;
//        if (y == 2) {
//            System.out.println("I've carried out a conditional test and I can confirm that the statement 'y == 2' is true");
//        } else {
//            System.out.println("The result of my conditional test was false");
//        }

//        System.out.println(y==2);

//        short y = -5;
//        y = 12;
//        y = 32450;
////         y = 33000; //incompatible types: possible lossy conversion from int to short
//
//        if (y < 0 ) {
//            System.out.println("The variable y contains a negative number");
//        } else if (y >=0 && y < 30000){
//            System.out.println("The variable y contains a positive number");
//        } else {
//            System.out.println("The variable y is dangerously close to the max value for short type variables, which is " + Short.MAX_VALUE);
//        }

//        String customerChoice = "strawberry";
//
//        switch (customerChoice) {
//            case "vanilla":
//                System.out.println("One vanilla coming right up");
//                break;
//            case "chocolate":
//                System.out.println("chocolate coming right up");
//                break;
//            case "strawberry":
//                System.out.println("strawberry coming right up");
//                break;
//            default:
//                System.out.println("We don't have that");
//                break;
//        }
//    }
//}
        //  Logical Operators
 /* ShortCircut
 the double symbol one is the shortcircut operator and both must be true

 int c = 0, d = 100, e = 50;
   if( c == 0 && e++ < 100 ) this first code block will only operate       nt:  if( c == 0 &|& e++ < 100 ) this first code block will only operate
                                  if the first statement is true                 left side  |  right side
        {
            d = 150;
        }

        System.out.println("e = " + e );   e was able to increment bc both sides were true
     ====
     int c = 0, d = 100, e = 50;
   if( c == 1 && e++ < 100 )      e is not able to increment bc the left hand side is not true

   int c = 0, d = 100, e = 50;
   if( c = 1 && e++ < 100 )  but if we change it to the control & it makes  


 int c = 0, d = 100, e = 50;   right side isnt true but doesnt need to be due to
   if( c == 1 || e++ < 100 )

    int c = 0, d = 100, e = 50;
   if( c == 1 | e++ < 100 )    with a single one it  


 there is no === operator, only ==
 dont confuse the variable assignment operator = with the comparison operator ==
 inequality operator: !=
 there is no strict inequaity operator

// write a Java program that asks the user for their age and then tells them if they are a teenager or not.
        // bonus: if not, tell them whether they are younger or older than a teenager.

  */
//      System.out.println("What is your age?");
//       Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter something: ");
//        String userAge = scanner.next();
//
        // you have to set you iterator outside of your loop
//  int i = 1;
//        System.out.println("The loop hasn't started yet. The value of i is " + i);
//        while (i < 10){
//            System.out.println("Now I'm in the loop. i have not incremented yet and its value is " + i);
//            i = i + 1;
//            System.out.println("I'm still in the loop. i has incremented now and its value is " + i);
//        }
//        System.out.println("This is out the far end of the loop. The conditional has tested false. The value of i is what it last incremented to. See? " + i);

//        int i = 1;
//        System.out.println("The loop hasn't started yet. The value of i is " + i);
//        do {
//            System.out.println("Now I'm in the loop. i has not incremented yet and its value is " + i);
//            i = i + 1;
//            System.out.println("I'm still in the loop. i has incremented now and its value is " + i);
//        } while (i<10);
//        System.out.println("This is out the far end of the loop. The conditional has tested false. The value of i is what it last incremented to. See? " + i);
//
//       int i;
//        for ( i = 0; i < 10; i++) {
//            System.out.println("Now I'm in the loop. i has not incrementede yet and its value is " + i);
//        }
//        System.out.println("This is out the far end of the loop. The conditional has tested false. The value of i is what it last incremented to. See?" + i);


//        int numberOfCansOfBigRedOnTheWall = 99;
//        String word = "cans";
//        while (numberOfCansOfBigRedOnTheWall > 0) {
//        }
//        System.out.println(numberOfCansOfBigRedOnTheWall + " " + word + "Number of cans on of Big Red on the wall");
//        System.out.println(numberOfCansOfBigRedOnTheWall + " " + word + "Number of cans of Oig Red");
//        System.out.println("Take one down pass it around");
//        numberOfCansOfBigRedOnTheWall--;
//        if (numberOfCansOfBigRedOnTheWall == 1) {
//            word = "can";
//        }
//        if (numberOfCansOfBigRedOnTheWall == 0) {
//            System.out.println(numberOfCansOfBigRedOnTheWall + " " + word + "of Big Red on the wall");
//        }

    }



    }