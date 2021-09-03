public class SyntaxLecture {



        public static void main(String[] args) {
            //comments can be converted into text you read on the screen

            // ================== STATEMENTS (s-3)

            // Statements may be...
            // Declarations
//                 int x;

            // Assignment expressions
//                 x = 3;

            // Any use of ++ or --
//                 x++;
//                 --x;

            // Method invocations
//                 Math.random();

            // Object creation expressions
//                 SomeObject = new SomeObject();

            // ================== COMMENTS (s-4)

            // single line comment

        /*

            multi-line comment

         */

            /**
             * Comment block
             */

//        System.out.println("test");


            // ================== DATA TYPES (s-5, 6, 7)


//            int primitiveExample = 3;
//            System.out.println(primitiveExample);


//            Student referenceExample = new Student();


            // use the smallest type needed for the job


            // primitive types...

//            byte age = -32;
//        System.out.println(age);
//            short minimumAnnualSalary = 15080;
//            int distanceToSaturn = 1200000000;
//            long numberOfHumanCells = 3000000000L; // L needed for compiler
//            System.out.println(numberOfHumanCells);
//            float lengthOfBacteriaInInches = 0.00004F; // F needed for compiler
//            System.out.println(lengthOfBacteriaInInches);
//            double widthOfAtomInMeters = .00000000001;
//            char seatingSection = 'M'; // must wrap in single quotes
//            boolean everythingIsAwesome = false;

            // strings (not a primitive type)

//                 String thisIsAString = "Hello";


//              like in JS, strings must escape certain characters like quotes and use it
//              to inject newline characters and other formatting

//        System.out.println("Hello\nWorld");
//        System.out.print("Hello");
//        System.out.print("World");

//        System.out.println("He said \"Hi\"");
//
//        String hello = "Hello";
//        char someLetter = hello.charAt(0);
//        System.out.println(someLetter);


            // ================== VARIABLES (s-8)

            // declaration separate from initialization

//             int seven;
//             seven = 7;
//            System.out.println(seven);

            // declaration and initialization

//             int eight = 8;
//        System.out.println(eight);


            // ================== IDENTIFIERS AND KEYWORDS (s-9)

            // see curriculum


            // ================== CONSTANTS (s-10)

            // see curriculum

//        final int SIDES_OF_A_DICE = 6;


            // ================== EXPRESSIONS (s-11)

            // basically the same as JS


            // ================== OPERATORS (s-12)

            // basically the same as JS


            // ================== ASSIGNMENT STATEMENTS (s-13)

            // basically the same as JS


            // ================== CASTING (s-14)

            // Link on casting... http://www.javainterviewpoint.com/type-casting-java-implicit-explicit-casting/


            // IMPLICIT
//            short x = 4;
//            int y = x;
//        System.out.println(x);
//        System.out.println(y);


            // EXPLICIT
//            int a = 2000001;
//            byte b = (byte) a;
//        System.out.println(a);
//        System.out.println(b);


            // implicit casting - less to more precise (widening)

//                 float num1 = 2.22F;
//                 double num2 = num1;


            // explicit casting - more to less explicit casting (narrowing)

//                 double num3 = 3.1;
//                 float num4 = (float) num3;
//
//                System.out.println(num4);


        };

        
    };
//  Exercises
//          You should complete all of the following inside of your main method from the previous exercise. After each step, compile and run your code.
//
//          Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
//
//          Create a String variable named myString and assign a string value to it, then print the variable out to the console.
//
//          Change your code to assign a character value to myString. What do you notice?
//
//          Change your code to assign the value 3.14159 to myString. What happens?
//
//          Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//
//          Change your code to assign the value 3.14 to myNumber. What do you notice?
//
//          Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//
//          Change your code to assign the value 123 to myNumber.
//
//          Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//
//          Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//
//          Copy and paste the following code blocks one at a time and execute them
//
//
//          int x = 5;
//          System.out.println(x++);
//          System.out.println(x);
//
//          int x = 5;
//          System.out.println(++x);
//          System.out.println(x);
//          What is the difference between the above code blocks? Explain why the code outputs what it does.
//
//          Try to create a variable named class. What happens?
//
//        Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
//
//
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        Copy and paste the code above and then run it. Does the result match with your expectation?
//
//        How is the above example different from the code block below?
//
//
//        int three = (int) "three";
//        What are the two different types of errors we are observing?
//
//        Rewrite the following expressions using the relevant shorthand assignment operators:
//
//
//        int x = 4;
//        x = x + 5;
//
//        int x = 3;
//        int y = 4;
//        y = y * x;
//
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//
//        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.







