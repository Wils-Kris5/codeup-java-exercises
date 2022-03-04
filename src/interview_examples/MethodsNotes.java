package interview_examples;

public class MethodsNotes {
    //public class MethodLecture {
    //
    //    // ----------- DEFINING AND CALLING METHODS WITH VARIOUS INPUTS (examples)
    //
    //    // no input or returned output
    //    public static void sayGreeting() {
    //        System.out.println("Hello");
    //    }
    //
    //    // no returned output with input
    //    public static void sayInput(String input) {
    //        System.out.println(input);
    //    }
    //
    //    // returned output without input
    //    public static int returnSeven() {
    //        return 7;
    //    }
    //
    //    // return output given an input
    //    public static int returnInt(int someInt) {
    //        return someInt;
    //    }
    //
    //    // return value based on multiple inputs
    //    public static double returnProductOfThreeNums(double num1, double num2, double num3) {
    //        return num1 * num2 * num3;
    //    }
    //
    //    // return type different from input type
    //    public static int returnLengthOfString(String input) {
    //        return input.length();
    //    }
    //
    //    // multiple input types
    //    public static void printCharMultipleTimes(char c, int repetitions) {
    //        System.out.println(String.valueOf(c).repeat(repetitions));
    //    }
    //
    //    // calling other methods from a method
    //    public static void printCharSevenTimes(char c) {
    //        printCharMultipleTimes(c, returnSeven());
    //    }
    //
    //    // public static void main(String[] args) {
    //        // sayGreeting();
    //
    //        // sayInput("Howdy");
    //
    //        // System.out.println(
    //        //         returnSeven()
    //        // );
    //
    //        // System.out.println(
    //        //         returnInt(3)
    //        // );
    //
    //        // System.out.println(
    //        //         returnProductOfThreeNums(2.4, 8.7, 9)
    //        // );
    //
    //        // System.out.println(
    //        //         returnLengthOfString("Bob")
    //        // );
    //
    //        // printCharMultipleTimes('m', 5);
    //
    //        // printCharSevenTimes('|');
    //
    //    // }
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //    // ----------- OVERLOADING
    //
    //    /*
    //        Method overloading is a way to define the same method with different method signatures (parameters).
    //        It is a convenience to prevent the programmer from having to create many more method names
    //        when defining functionality for various data type inputs.
    //        Much of the Java language is defined using overloaded methods (e.g.
    //        public static void main(String[] args) {
    //            int firstValue = Integer.valueOf("0011", 2);
    //            System.out.println(firstValue);
    //            int secondValue = Integer.valueOf("0011");
    //            System.out.println(secondValue);
    //        }
    //     */
    //
    //
    //
    //    //
    //    // public static void print(String input) {
    //    //     System.out.println(input);
    //    // }
    //    //
    //    // public static void print(int input) {
    //    //     System.out.println(input);
    //    // }
    //    //
    //    // public static void print(short input) {
    //    //     System.out.println(input);
    //    // }
    //    //
    //    // public static void print(byte input) {
    //    //     System.out.println(input);
    //    // }
    //    //
    //
    //    // public static void main(String[] args) {
    //    //
    //    //     int firstValue = Integer.valueOf("0011", 2);
    //    //     System.out.println(firstValue);
    //    //
    //    //     int secondValue = Integer.valueOf("0011");
    //    //     System.out.println(secondValue);
    //    //
    //    // }
    //
    //
    //
    //
    //
    //    public static void sayHello() {
    //        sayHello("Hello", "World");
    //    }
    //
    //    public static void sayHello(int times) {
    //        for (int i = 0; i < times; i += 1) {
    //            sayHello();
    //        }
    //    }
    //    public static void sayHello(String name) {
    //        sayHello("Hello", name);
    //    }
    //    public static void sayHello(String greeting, String name) {
    //        System.out.println(greeting + ", " + name + "!");
    //    }
    //
    //    // different return type is not enough alone to overload a method
    //    // must have a unique method signature
    //
    //    // public static double sayHello(int x) {
    //    //    return x;
    //    // }
    //
    //    // with a unique method signature, can return any type
    //    public static double sayHello(double x) {
    //        return x;
    //    }
    //
    //
    //
    //    // public static void main(String[] args) {
    //    //     sayHello();
    //    //     sayHello(2);
    //    //     sayHello("John");
    //    //     sayHello("Salutations", "Kevin");
    //    // }
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //    // ----------- RECURSION
    //
    //    /*
    //        BASICS
    //        Recursion is a process where a method calls itself repeatedly.
    //        A method that calls itself is referred to as a "recursive" method.
    //        A recursive method must have a condition that will end the recursive calls, called a "base case."
    //        Without a base case, a recursive method will run out of memory and throw a StackOverflow exception.
    //        USE CASES
    //        Recursion allows programmers to express certain algorithms in a simpler way. Recursive solutions can
    //        be less efficient and possibly throw an exception if there are too many recursive calls.
    //     */
    //
    //    // public static void ohNo(int num) {
    //    //     if (num < 1000) {
    //    //         ++num;
    //    //         System.out.println("Oh no");
    //    //         ohNo(num);
    //    //     }
    //    // }
    //
    //    // public static void main(String[] args) {
    //    //     ohNo(1);
    //    // }
    //
    //
    //
    //
    //
    //    // public static void eatString(String str) {
    //    //     if (str.length() != 0) {
    //    //         System.out.println("Taking a bite out of " + str);
    //    //         eatString(str.substring(1));
    //    //     }
    //    // }
    //    //
    //    // public static void main(String[] args) {
    //    //     eatString("codeup");
    //    // }
    //
    //
    //    // Change all letter o's in a string to zeros
    //    public static String oToZero(String input) {
    //        input = input.toLowerCase(); // not worry about case
    //        int indexOfNextO = input.indexOf('o');
    //        if (indexOfNextO == -1) return input; // base case
    //        input = input.replace('o', '0');
    //        return oToZero(input);
    //    }
    //
    //
    //
    //    // public static void main(String[] args) {
    //    //     System.out.println(oToZero("hello"));
    //    //     System.out.println(oToZero("loops"));
    //    //     System.out.println(oToZero("wowowowowow"));
    //    // }
    //
    //    public static long powersOfTen(int n) {
    //        if (n == 0) return 1; // base case
    //        if (n == 1) return 10; // base case
    //        return powersOfTen(n-1) * 10;
    //    }
    //
    //
    //    public static void countTo100Loop(int num) {
    //        for (int i = num; i <= 100; i += 1) {
    //            System.out.println(i);
    //        }
    //    }
    //
    //    // public static void main(String[] args) {
    //    //     countTo100(88);
    //    // }
    //
    //    // TODO: use recursion to print out a given number up through 100
    //    public static void countTo100(int num) {
    //        System.out.println(num);
    //        if (num == 100) {
    //            return;
    //        }
    //        ++num;
    //        countTo100(num);
    //    }
    //
    //    // TODO: use recursion to add all numbers up, from 1 to the given number input
    //    /*
    //        addNums(5) would trigger a calculation of...
    //            5 + 4 + 3 + 3 + 1, evaluating to 15
    //     */
    //    public static int addNums(int num) {
    //        if (num == 1) return 1; // base case
    //        return addNums(num - 1) + num;
    //    }
    //
    //    /*
    //        addNums(5)
    //            breaks down to...
    //            return addNums(4) + 5;
    //                breaks down to...
    //                return addNums(3) + 4 + 5;
    //                    breaks down to...
    //                    return addNums(2) + 3 + 4 + 5;
    //                        breaks down to...
    //                        return addNums(1) + 2 + 3 + 4 + 5;
    //                            breaks down to...
    //                            return 1 + 2 + 3 + 4 + 5;
    //     */
    //
    //    // public static void main(String[] args) {
    //    //     System.out.println(addNums(5));
    //    // }
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //    // TODO: use recursion to ensure only the user input of "hello" is returned from the function
    //    public static String getHello() {
    //        Scanner sc = new Scanner(System.in);
    //        System.out.println("Please enter the word 'hello'");
    //        String userResponse = sc.nextLine();
    //        if (userResponse.equalsIgnoreCase("hello")) {
    //            return userResponse;
    //        } else {
    //            return getHello();
    //        }
    //    }
    //
    //    public static void main(String[] args) {
    //        String greeting = getHello();
    //        System.out.println("You say " + greeting + "; I say howdy!");
    //    }
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //    public static boolean isPalindrome(String str) {
    //        if (str.length() == 0 || str.length() == 1) {
    //            return true;
    //        }
    //        if (str.charAt(0) == str.charAt(str.length() - 1)) {
    //            return isPalindrome(str.substring(1, str.length() - 1));
    //        } else {
    //            return false;
    //        }
    //    }
    //
    //
    //}
}
