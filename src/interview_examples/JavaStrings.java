package interview_examples;

public class JavaStrings {
    //Java Strings
    //Java strings are a little different from JavaScript strings. In JavaScript, strings are primitive variables. This means that a bit representation of the string is actually stored in the variable itself. And by "in the variable", I mean, in the area of memory that is set aside when the variable is declared. In that portion of your computer's RAM chip, there are a bunch of capacitors, and when they are full of electrons, that is considered a 1, when they are empty, it's a 0. That's a bit, and 8 bits are a byte, and so forth. For the most part, one byte is enough to represent a character, and so a string is a set of enough bytes to store all the characters that make up the string. A JavaScript interpreter will take the area of memory defined by your variable and fill the capacitors the with electrons in the pattern that matches the ASCII codes for the characters in your string.
    //
    //Java is not like that. In Java, strings are objects. They are not primitives. Therefore, they are not stored in the space defined by the variable. Instead, like other objects, what is stored there is a reference to the object. We don't know or care what that reference is -- usually some combination of digits and characters that varies from system to system.
    //
    //The string object itself is stored in a separate area of memory called the String Pool. Here's where we get to this concept of string immutability in Java. What happens is Java does not delete or modify a string object once it's in the String Pool. It just leaves it there. Then, if you declare another variable with the same string value, a JVM will notice that the string is already in the String Pool, and instead of creating a new string object, it will store a reference to the same object.
    //
    //So, if I have
    //
    //String justin = 'Justin';
    //and then I do
    //
    //String mrJustinReich = 'Justin';
    //A Java Virtual Machine does not create a new string object, and a new reference to that new string object, instead what it does is store the same reference to the same String object, just in a new place.
    //
    //And that is how strings are immutable in Java -- no extant string is ever modified or deleted in memory, while a program is running. Any time you concatenate a string and store the results in a variable ...
    //
    //justin = 'Justin' + ' Reich';
    //A new string object is created, and so the variable justin now contains a new reference, to a new object. But the old object is never deleted. Even if I do
    //
    //mrjustinreich = justin;
    //If this was a normal object, the 'Justin' object would now be orphaned and set for garbage collection, but since it's a String object, that doesn't happen. If I create a new variable set to 'Justin' the JVM brings back the same exact reference as the variables justin and mrjustinreich once used, pointing to the same exact String object.
    //
    //That is how strings are immutable in Java.
    //
    //String comparison with .equals()
    //A consequence of the fact that strings are objects in Java and not primitives, is that I cannot use the comparison operator == to compare their values. I have to use the object comparison method .equals();.
    //
    //This is particularly important when we use the Scanner class.
    //
    //Scanner sc = new Scanner(System.in);
    //        System.out.println("Enter a string");
    //        String userInput = sc.next();
    //        if (userInput == "Justin") {
    //            System.out.println("The user entered the string 'Justin'");
    //        } else {
    //            System.out.println("The user did not enter the string 'Justin'");
    //        }
    //Output:
    //
    //The user did not enter the string 'Justin'
    //When we compare variables set to a value, we do get a "true" result for a comparison:
    //
    //String justin = "Justin";
    //        String mrJustinReich = "Justin";
    //        System.out.println(justin == mrJustinReich);
    //But this is because the JVM is comparing the reference variables, and both variables contain a reference to the same object in the String Pool.
    //
    //You can even do this:
    //
    //System.out.println("Justin" == "Justin");
    //But do not be deceived, again the JVM is generating one object in the String pool, and comparing references to that one object. The instant you try to compare a string input to a pre-stored string, you do not get the result you want.
    //
    //        String justin = "Justin";
    //        Scanner sc = new Scanner(System.in);
    //        System.out.println("Enter a string");
    //        String userInput = sc.next();
    //        if (userInput == justin) {
    //            System.out.println("The user entered the string 'Justin'");
    //        } else {
    //            System.out.println("The user did not enter the string 'Justin'");
    //        }
    //So, what we want to do is use .equals()
    //
    //IntelliJ even tells us that is what we want to do if we try to use == on strings. (hover over the comparison operator when comparing strings in IntelliJ).
    //
    // String justin = "Justin";
    //        Scanner sc = new Scanner(System.in);
    //        System.out.println("Enter a string");
    //        String userInput = sc.next();
    //        // change == to .equals()
    //        if (userInput.equals(justin)) {
    //            System.out.println("The user entered the string 'Justin'");
    //        } else {
    //            System.out.println("The user did not enter the string 'Justin'");
    //        }
    //Output:
    //
    //The user entered the string 'Justin'
    //Notice in the syllabus that there are three other string comparison methods:
    //
    //equalsIgnoreCase()
    //startsWith()
    //endsWith()
    //And as in JavaScript there are a bunch of methods available for you to manipulate strings. Keep these in mind going forward, they are in the syllabus.
    //
    //It's also worth pointing out that if you want to work with mutable strings, you can use the StringBuilder class. Probably not something you will want to do at first, but if you are doing a lot of concatenation and creating a lot of strings that are variations of one another, once you are more familiar with Java, it's worth exploring as it may be more memory-efficient to use StringBuilder than String. There's a link to some StringBuilder docs in the syllabus page on Strings.
}
