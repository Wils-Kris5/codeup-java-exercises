package interview_examples;

public class ControlStatementsAndLoops {
    //Control statments and loops in Java
    //There are basically only three things you can do in any computer language.
    //
    //Statements
    //Decisions
    //Loops
    //Put a little more plainly,
    //
    //Do something
    //Do something under a certain condition
    //Do something again and again
    //All programming problems can be solved by putting together sequences of these three components
    //
    //Statements, loops, decisions (or branching)
    //
    //Statements
    //We have already seen statements being made. Examples include declaring a variable or issuing a command to output some information.
    //
    //Key facts about Java statements include:
    //
    //unlike JavaScript, there is no automatic semicolon insertion (ASI) engine. If you do not terminate your statement with a semicolon, your program will not compile.
    //variables cannot be declared with a generic keyword like var, let, or const, they must always be declared with a type declaration.
    //Conditional Branching
    //Conditional branching in Java is much like in JavaScript
    //
    //You have to conduct a boolean test, and if the test returns true, some code is executed.
    //
    //public class ControlFlow {
    //    public static void main (String[] args){
    //        int x = 5;
    //        if (x == 5) {
    //            System.out.println("If you are reading this, x must be 5 since this is running");
    //        }
    //        System.out.println("On the other hand, this doesn't mean anything because it runs regardless of what x is");
    //    }
    //}
    //We can also, of course, do if - else statements, and if - else if- else statements
    //
    //        int y = 2;
    //        y = 3;
    //        if (y == 2) {
    //            System.out.println("I've carried out a conditional test and I can confirm that the statement 'y == 2' is true");
    //        } else {
    //            System.out.println("The result of my conditional test was false");
    //        }
    //We can also make longer sequences of decisions.
    //
    //short y = -5;
    //        y = 12;
    //        y = 32450;
    //        // y = 33000; //incompatible types: possible lossy conversion from int to short
    //
    //        if (y < 0 ) {
    //            System.out.println("The variable y contains a negative number");
    //        } else if (y >=0 && y < 30000){
    //            System.out.println("The variable y contains a positive number");
    //        } else {
    //            System.out.println("The variable y is dangerously close to the max value for short type variables, which is " + Short.MAX_VALUE);
    //        }
    //Mini exercises
    //write a short Java program that tests if a number is positive or negative. Define a few numeric variables and run them through a decision. If the number is positive, output that it is positive, and if it is negative, output that it is negative.
    //if you finish early and want a greater challenge, write another Java program that takes a hard-coded number, multiplies it by 2, and determines if the result is less than -100, more than 100, or in between, and tells the user
    //back to the lecture
    //There are also switch statements. I find switch statements to be almost useless because you can make conditional decisions or boolean tests in their condition lists.
    //
    //String customerChoice;
    //
    //switch (customerChoice) {
    //case "vanilla":
    //System.out.println("One vanilla coming right up");
    //break;
    //case "chocolate":
    //System.out.println("chocolate coming right up");
    //break;
    //case "strawberry":
    //System.out.println("strawberry coming right up");
    //break;
    //default:
    //System.out.println("We don't have that");
    //break;
    //}
    //You cannot do this, which limits the utility of switch statements:
    //
    //int customerMaxBudget = 0;
    //
    //        switch (customerMaxBudget) {
    //            case (>0 && <1000):
    //                // do something
    //                    break;
    //        }
    //Another thing that doesn't happen is that boolean conditional tests don't return true on the mere existence of a variable. There is no truthy or falsey, things have to return literally true or false.
    //
    //String existence = "I exist";
    //        if (existence) {
    //            System.out.println("the variable 'existence' exists");
    //        }
    //error message:
    //
    //error: incompatible types: String cannot be converted to boolean
    //Only if the variable is a boolean can you do that
    //
    //   boolean existence = true;
    //        if (existence) {
    //            System.out.println("solipsism is a false perspective");
    //        }
    //
    //Logical Operators
    //There are two types of logical operators (and / or operators) in Java, the short circuit operators and the non-short circuit operators. The difference rarely comes into play, but when it does, it's important to understand it.
    //
    //Basically, in Java you can do && as well as || operators But in addition, there are & as well as | operators
    //
    //Let's look at some examples of short-circuit.
    //
    //Let's define three variables. Now let's do this
    //
    //   int c = 0, d = 100, e = 50;
    //   if( c == 0 && e++ < 100 )
    //        {
    //            d = 150;
    //        }
    //        System.out.println("e = " + e );
    //Output:
    //
    //e = 51
    //Notice e is defined as 50. However, since the left hand side of the logical AND operator evaluates to true, the JVM moves on to evaluating the right hand side. Since there is an increment operator, it runs, the value of e is incremented to 51, and that is the output we get.
    //
    //On the other hand
    //
    //if( c == 1 && e++ < 100 )
    //        {
    //            d = 150;
    //        }
    //        System.out.println("e = " + e );
    //Now the left expression evaluates to false. So the whole expression short circuits, meaning, at that point, it stops evaluating, it never bothers to evaluate the right hand, so the increment operator never runs, which means e remains 50.
    //
    //However, we have a non-short circuit version in Java, and we can force the JVM to evaluate both sides of the expression regardless:
    //
    //  if( c == 1 & e++ < 100 )
    //        {
    //            d = 150;
    //        }
    //        System.out.println("e = " + e );
    //Likewise, with the or operator, you can use a short circuit operator or a non-short circuit operator.
    //
    //Given these:
    //
    //        int number = 42;
    //        boolean existence = true;
    //The following does not increment 42, because the left side evaluates to true, therefore the expression short circuits.
    //
    //        if (existence || number++ == 42) {
    //
    //        }
    //        System.out.println(number);
    //But the following does increment, because it is non-short circuit and so both sides of the expression are evaluated, which means the increment operator runs.
    //
    //    if (existence | number++ == 42) {
    //
    //    }
    //    System.out.println(number);
    //Now you'll notice that I've been doing comparison operations with the == operator, called the equality operator. There is also an inequality operator, !=. There is no strict equality operator because in Java, two things of different types will never be considered equal, so there is no need for it.
    //
    //That said, there is even a strange thing when we try to compare strings, we will see this in the strings lesson.
    //
    //mini-exercise: logical operators and decisions
    //Write a program that takes a hard-coded age and outputs whether it is the age of a teenager or not.
    //
    //Loops
    //So much for statements and decisions. The only other type of structure in modern programming logic is the loop. I cannot emphasize enough that all programming problems can be solved using combinations of statements, decisions, and loops, organized in sequences.
    //
    //While Loop
    //The most basic type of loop is the while loop. To carry out a while loop, you first set a loop control variable. You then write the key word "while" and set it a conditional decisions based on the value of the loop control variable. You then give it a block of code to carry out every time the boolean test returns true. It carries out the instructions in the block of code, over and over again. At the end of every time it runs the block, it carries out the test. Any time the test returns false, the JVM skips the block of code and runs straight to the next bit of code in the sequence, whatever that may be.
    //
    //int i = 1;
    //        System.out.println("The loop hasn't started yet. The value of i is " + i);
    //        while (i < 10){
    //            System.out.println("Now I'm in the loop. i has not incremented yet and its value is " + i);
    //            i = i + 1;
    //            System.out.println("I'm still in the loop. i has incremented now and its value is " + i);
    //        }
    //        System.out.println("This is out the far end of the loop. The conditional has tested false. The value of i is what it last incremented to. See? " + i);
    //Put the boolean test in parentheses, and the block of code in squiggly braces.
    //
    //By the way braces, brackets, parentheses
    //
    //Do-while loop
    //Next is the do-while loop. In this case, the JVM carries out the code block before it carries out the conditional test
    //
    //I'm not really sure when this will be necessary but keep in mind that you can carry out the conditional either before or after executing the code block. Generally a while loop is fine.
    //
    //        int i = 1;
    //        System.out.println("The loop hasn't started yet. The value of i is " + i);
    //        do {
    //            System.out.println("Now I'm in the loop. i has not incremented yet and its value is " + i);
    //            i = i + 1;
    //            System.out.println("I'm still in the loop. i has incremented now and its value is " + i);
    //        } while (i<10);
    //        System.out.println("This is out the far end of the loop. The conditional has tested false. The value of i is what it last incremented to. See? " + i);
    //For loop
    //Finally, after doing while loops for a while you may get familiar enough with looping to use the shorthand for loop. The for loop is really just a shorthand in which you set the loop control variable, the conditional test, and the lcv increment all at once, before defining the code block.
    //
    //You lose a little bit of specific control, in the sense that in a while loop you can determine where exactly the increment goes, but in a for loop the increment always goes at the very end of the code block.
    //
    //for (i = 0; i < 10; i ++) {
    //            System.out.println("Now I'm in the loop. i has not incremented yet and its value is " + i);
    //        }
    //       // System.out.println("This is out the far end of the loop. The conditional has tested false. The value of i is what it last incremented to. See? " + i);
    //Notice two things, I can't output anything that happens after the lcv increments. And I can't access the variable i outside the code block. It's out of scope. (I think it's still in scope in JavaScript)
    //
    //Game--or go straight to exercises
    //Let's group-code a 99 cans of Big Red song.
    //
    //Bonus exercise -- the PIN code (requires a break; statement)
    //
    //You have to design the code such that the user has only three tries to guess the correct pin of the account. You set the pin as a constant with a final attribute. When correct display “Correct, welcome back.” When incorrect display “Incorrect, try again.”. When ran out of tries display “Sorry but you have been locked out.” program Starts:
    //
    //Please enter pin:
    //22132
    //Output:
    //Incorrect, try again.
    //Please enter pin:
    //23412
    //Output:
    //Incorrect, try again.
    //Please enter pin:
    //12345
    //Output:
    //Correct, welcome back.
    //More bonuses:-
    //
    //Write a program called ComputePI to compute the value of π, using the following series expansion. You have to decide on the termination criterion used in the computation (such as the number of terms used or the magnitude of an additional term). ∏ = 4x(1-1/3+1/5-1/7+1/9-1/11+1/13-1/15+...) 2. Write a program called Product1ToN to compute the product of integers 1 to 10 (i.e., 1×2×3×...×10). 3. Exercise Fibonacci (Loop): Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average. The output shall look like:
    //
    //The first 20 Fibonacci numbers are: 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 The average is 885.5
    //
    //Given a number n Calculate the factorial of the number
    //
    //let n2 = 4; // 4 * 3 * 2 * 1 = 24 // Example output: // 24 1:58 5. Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.
    //
    //let num1 = 2; let num2 = 8; // Example output: // 1 + 2 = 3 // 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
    //
    //Hangman Game prompt a player 1 to enter a word for player 2 to guess track the number of guesses by player 2 display to the user the partially completed word string methods from the strings lesson will be helpful for this bonus
    //
    //Simple Chat Bot
    //
    //Be creative in communicating with your user different options and for given scenarios. Create at three phases of the chat, for example...
    //
    //		                 "How are you?" (AI says)
    //		           |                              |
    //		         good                        bad (user types)
    //
    //   "Awesome! Are you super happy?" 	    "Will cake make you better?"
    //
    //          yes          no                     yes             no
    //Keep the chat options relatively simple and plan it out clearly before coding it.
    //
    //For a given N, prints the sum of even and odd integers of the first N natural numbers. Input: N = 6 Output: 12 9
    //Explanation: Natural numbers less than 6 are 1 2 3 4 5 6 So the sum of even number = 2 + 4 + 6 = 12. and the sum of odd number = 1 + 3 + 5 = 9.
    //
    //Write a program that asks the user for an integer input until the user enters the number 0, then show the user the sum of the numbers they entered.
    //
    //Use a nested for loop to generate the following output:
    //
    //*
    //**
    //***
    //****
    //*****
    //Create nested for loops to produce the following output.
    //
    //....1
    //...22
    //..333
    //.4444
    //55555
}
