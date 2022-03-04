//Object-Oriented Programming
//We now enter the portion of our curriculum where we learn how Java is really used, that is, to construct objects that interact with one another.
// A real Java program is not really just a bunch of code running in one file, it's a bunch of separate classes that interact with one another.
//
//We want to start moving away from a concept of a program as a series of procedures, and towards a concept of a program as a set of objects.
// We think to ourselves: what are the things in this program?
// And what do these things do?
// What do these things know about themselves,
// or need to know about themselves in order to do the things they do?
//
//Classes and objects
//Let's go back to the example of the simple RPG I was designing in JavaScript a few weeks ago.
// At a fundamental level, the RPG program needs characters who will engage in conflict with monsters.
// So we know we have to design a fighter.
//
//What we do now is create a class. The class is a blueprint for an object.
// Our class code tells the JVM how to make an object of that particular type.
//
//A class, in turn, has two types of fields -- instance variables, and methods.
//
//public class Fighter {
//    public String name;
//    public int hitPoints;
//    public int maxDamage;
//    public void printStats(){
//        System.out.println(name + " has " + hitPoints + " hit points and can do " + maxDamage + " damage");
//    }
//}
//We could now add a main method to actually run the code. When we run the code, we have to actually create a Fighter.
// This is not an actual fighter object, it's just a blueprint for how to create a fighter object.
// To make an actual fighter that instantiates the object,
// we could make a main method like this:
//
//    public static void main(String[] args) {
//        Fighter arata = new Fighter();
//        arata.name = "Arata";
//        arata.hitPoints = 17;
//        arata.maxDamage = 14;
//        arata.printStats();
//    }
//Output:
//
//Arata has 17 hit points and can do 14 damage
//But really, we want to keep this kind of code out of our class. Instead, we are going to create a test class.
//
//public class FighterTest {
//    public static void main(String[] args) {
//        Fighter arata = new Fighter();
//        arata.name = "Arata";
//        arata.hitPoints = 17;
//        arata.maxDamage = 14;
//        arata.printStats();
//    }
//}
//Now, in this test class, we instantiate our fighter and we use dot notation to access its variables.
//
//"A real Java application is nothing but objects talking to other objects.
// In this case, talking means objects calling methods on one another." --Head First Java
//
//It's important to understand the difference between a class and an object.
// Think of it like this. There's a contacts app. Every time you fire it up, it asks you if you want to create a new contact.
// When you say yes, it gives you a template with blank fields.
// At that point, you fill in the fields and that's when you have an actual contact.
// Until you fill in the fields, all you have is a blank contact template.
// Same here. The Fighter class is just an empty template.
// When I actually create a new fighter and fill in the variables, that's a fighter object.
// That's when the class has been instantiated and an object has come into existence.
//
//Now I can add to the class. I can give all fighters a battle roar.
//
//Fighter.java:
//
//public void battleRoar(){
//        System.out.println("I am " + name + " and I will destroy you!");
//    }
//FighterTest.java
//
// arata.battleRoar();
//output:
//
//I am Arata and I will destroy you!
//But now we can create more fighters, too:
//
//Fighter sozalix = new Fighter();
//        sozalix.name = "Sozalix";
//        sozalix.battleRoar();
//We could create five, ten, twenty fighters, with different names and stats. All of them would have the same instance variables, but different values for them. All of them would have access to the same methods.
//
//mini exercise
//Create a class for your favorite type of animal. The class should be named for your animal - Cat, Dog, Parrot etc. It should have two instance variables - name and sound - and one method - makeNoise(). The output of the makeNoise method should be name + " goes " + sound. Create a test class with a main method to instantiate and test your class code.
//
//static and instance
//So far we have been creating all our methods simply declared with the keyword public,
// the return type, and the name of the method.
// These methods are accessible objects generated from their class definition.
// So, if I create a Fighter called Arata, Arata can do the battleroar.
// A monster cannot do the battleroar, only a Fighter.
//
//But you can have static methods, and you can have static variables,
// and these are available to classes other than the ones they are defined in.
// Let's have a look. Say you want to have access to something from inside every class in your program.
// For example, a dice-roll that every kind of character and monster could have access to.
// We could start a little like this:
//
//public class D20 {
//    public static int rolld20() {
//        return (int) (Math.random() * 20) + 1;
//    }
//}
//In Fighter.java:
//
//public int attackRoll(){
//        return D20.rolld20();
//    }
//In FighterTest.java:
//
//int attackRoll = arata.attackRoll();
//System.out.println("Arata attacks and rolls a " + attackRoll);
//Now we see that when I defined the rollD20 method as static,
// it became available throughout the multi-class program.
// I can write a method in the Fighter class that calls D20 class.
// And notice I don't have to instantiate the D20 class.
// I don't have to do something like D20 d20 = new D20(); d20.rolld20();.
// Instead, I can call the method directly on a class.
//
//We have seen this before, specifically in the Math class.
// All the methods in the Math class are static and we can call them directly from the class itself without instantiating it.
// The Math Class. Notice all the methods in the Math class are static.
//
//public class MathTest {
//    public static void main(String[] args) {
//        int testInt = -23;
//        int absoluteValueOfTestInt = Math.abs(testInt);
//        System.out.println(absoluteValueOfTestInt);
//    }
//}
//You call a static method using a class name.
// You call a non-static method using a reference variable name.
//
//mini-exercise: write a static method.
//Create a Quote class with a RandomQuote method. The method should generate a random number from 1 to 4. Depending on the result, the method should return a different quote. Now edit your animal class from the previous exercise so instead of an appropriate animal noise it makes a random quote. Test your animal class and verify that it now emits a random quote instead of an animal-appropriate noise.
//
//We can also have static variables.
// Now you may have noticed something about your main method, which is of course a static method.
// The main method can never use an instance variable.
//
//Does not compile:
//
//public class MathTest {
//    int testInt = -23;
//    int absoluteValueOfTestInt = Math.abs(testInt);
//    public static void main(String[] args) {
//        System.out.println(absoluteValueOfTestInt);
//    }
//}
//java: non-static variable absoluteValueOfTestInt cannot be referenced from a static context
//The reason for this is that an instance variable by definition is meant to be instantiated, to belong to a specific object
// and to receive a specific value.
// However, a static method is meant to run off a class, not an instance of that class.
// So, static methods cannot use instance variables.
//
//On the other hand, there is such a thing as a static variable.
// The value of a static variable is the same for all instances of the class.
// All instances of the class share a single copy of a static variable.
// And when all instances of the class share a single copy of the static variable,
// that means that we can call it from the class rather than only from instances.
//
//Club.java:
//
//public class Club {
//    public static int maxDamage = 4;
//}
//FighterTest.java:
//
//System.out.println(Club.maxDamage);
//And indeed this is the way we can access variables from inside a main method.
//
//public class MathTest {
//    static int testInt = -23;
//    public static void main(String[] args) {
//        int absoluteValueOfTestInt = Math.abs(testInt);
//        System.out.println(absoluteValueOfTestInt);
//    }
//}
//So this is how we can have access to variables from within the main method,
// and access to some variables throughout a Java program.
//
//mini-exercise: a static variable
//Create an Employee class. The employee class should have a name instance variable, a static company variable set to Veridian Dynamics, and a non-static method displayEmployeeInfo(). displayEmployeeInfo() should generate a string, name + " works at " + company. Create a test class that instantiates three employee objects with different names. Run displayEmployeeInfo on all of them to show that each has access to the employee static variable. Bonus: write a method that has the employee emit a random quote and test it.
//
//Constructors
//Let's circle back and look at how we are instantiating objects. Notice how we've been doing it
//
//Fighter arata = new Fighter();
//Fighter sozalix = new Fighter();
//Employee rick = new Employee();
//What are we actually doing here? Let's break it down. First, we are declaring a new reference variable of a particular class type
// (Fighter arata or Employee rick). Second we are creating a new object.
// (new Fighter() or new Employee()). Finally we are assigning the new object to the reference (=, the assignment operator).
//
//What exactly are these "Fighter()" and "Employee()" terms. They look like methods right?
// Actually they are constructors.
// You invoke a constructor with the keyword new followed by the name of a class.
// This language creates a new instance of that class -- an object. [A class is just code.
// It just sits there being the potential for objects.
// When you do new Object() you create an actual object,
// which is an instance of the class].
//
//At its most basic, a constructor looks like this:
//
//public Fighter(){
//
//}
//Notice what it is missing; no return type.
// That's how you know it's a constructor.
// Aside from that, its name is the name of a class - that's mandatory.
//
//But wait -- it looks method-ish. Can I put code between the curly braces? Yes!
//
//Let's see.
//
//Fighter.java:
//
// public Fighter(){
//        System.out.println("A Fighter has come into being!");
//    }
//FighterTest.java output:
//
//A Fighter has come into being!
//Arata has 17 hit points and can do 14 damage
//I am Arata and I will destroy you!
//A Fighter has come into being!
//I am Sozalix and I will destroy you!
//Arata attacks and rolls a 11
//4
//How can we make this a little more useful?
//
//Consider how difficult it is to populate the object with its variables. You have to create the object, then remember to declare its properties one at a time using dot notation. Wouldn't it be nice if we could set all the properties at the same time we create an object?
//
//We now have to bring back an old friend from our days in JavaScript, the this keyword. Using this in the context of a constructor helps us to differentiate the object property from the parameter.
//
//Fighter.java:
//
//public Fighter(String name, int hitPoints, int maxDamage){
//        System.out.println("A new Fighter has emerged!");
//        this.name = name;
//        this.hitPoints = hitPoints;
//        this.maxDamage = maxDamage;
//        this.printStats();
//    }
//FighterTest.java:
//
//Fighter arata = new Fighter("Arata", 17, 14);
//Output:
//
//A new Fighter has emerged!
//Arata has 17 hit points and can do 14 damage
//mini-exercise
//modify your animal class so that the name and noise are initiated during object construction,
// and the animal makes a noise when it is created.
//
//Visibility
//It is at this stage that we get into one of the most important aspects of Java programming,
// access levels and access modifiers.
// This is also called visibility, because it affects who sees what.
//
//So far, we've been either just declaring an instance variable int myInt = 42
// or declaring it public public int myInt = 42.
// What does this public keyword mean anyway? Or the complete absence of a keyword at all?
//
//Public means any code anywhere can access it.
// If you are writing a program with a bunch of classes, you can access this.
// If you are importing packages, you can access public properties inside the packages,
// and they can access yours.
//
//Default -- which is what happens when you don't declare something
// -- means only code within the same package can access a property / method / variable. usually,
// a package is designed as a coherent group of classes that work together as a set,
// so it does make sense to have classes in the same package access one another's code,
// while only a few of the classes are exposed to code outside the package.
//
//On the other hand, there is the private level of access,
// this level means only code within the same class can access it.
// It is private to the class.
//
//In practice, we use this a lot for getters and setters and encapsulation.
// So, right now we could alter Arata's code in the FighterTest class.
//
//FighterTest.java:
//
//        Fighter arata = new Fighter("Arata", 17, 14);
//        arata.hitPoints = 0;
//        arata.printStats();
//Output:
//
//A new Fighter has emerged!
//Arata has 17 hit points and can do 14 damage
//Arata has 0 hit points and can do 14 damage
//What we actually want to do is to route any changes to instance variables
// through a method so that we can include validation code and make sure
// this is something we really want to happen. We say we encapsulate the data.
// Let's make that happen.
//
//Fighter.java
//
//    private String name;
//    public void setName(String name){
//        this.name = name;
//    }
//    public String getName(){
//        return name;
//    }
//
//    private int hitPoints;
//    public void setHitPoints(int hitPoints){
//        this.hitPoints = hitPoints;
//    }
//    public int getHitPoints(){
//        return hitPoints;
//    }
//FighterTest.java
//
// Fighter arata = new Fighter("Arata", 17, 14);
//Output:
//
//A new Fighter has emerged!
//Arata has 17 hit points and can do 14 damage
//Notice I don't need to modify the constructor to use the setter,
// because the constructor and the private variable are in the same class.
// But now if I try to do arata.hitPoints = 0; in FighterTest, I get java: hitPoints has private access in Fighter.
// I have to do
//
//        Fighter arata = new Fighter("Arata", 17, 14);
//        arata.setHitPoints(0);
//        arata.printStats();
//Let's finish encapsulating our fighter class.
//
// private int maxDamage;
//    public void setMaxDamage(int maxDamage){
//        this.maxDamage = maxDamage;
//    }
//    public int getMaxDamage(){
//        return maxDamage;
//These methods are called getters and setters,
// or more technically mutators,
// but almost everyone calls them getters and setters.
// Proper Java coding technique calls for class instance variables to be private,
// and accessible only through getters and setters.
//
//mini-exercise
//Encapsulate your animal class. Use your test class to verify that your instance
// variables cannot be directly accessed and can only be accessed through your getters and setters.
