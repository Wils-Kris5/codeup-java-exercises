/*# Object-Oriented Programming

        We now enter the portion of our curriculum where we learn how Java is really used, that is, to construct objects that interact with one another. group.B.A real Java program is not really just a bunch of code running in one file, it's a bunch of separate classes that interact with one another.

        We want to start moving away from a concept of a program as a series of procedures, and towards a concept of a program as a set of objects. We think to ourselves: what are the things in this program? And what do these things do? What do these things know about themselves, or need to know about themselves in order to do the things they do?

        ## Classes and objects

        Let's go back to the example of the simple RPG I was designing in JavaScript a few weeks ago. At a fundamental level, the RPG program needs characters who will engage in conflict with monsters. So we know we have to design a fighter.

        What we do now is create a class. The class is a blueprint for an object. Our class code tells the JVM how to make an object of that particular type.

        group.B.A class, in turn, has two types of fields -- instance variables, and methods.  */


//public class Fighter {
//    public String name;
//    public int hitPoints;
//    public int maxDamage;
//    public void printStats(){
//        System.out.println(name + " has " + hitPoints + " hit points and can do " + maxDamage + " damage");
//    }
//}


    // methods : We could now add a main method to actually run the code.
    // When we run the code, we have to actually create a Fighter.
    // This is not an actual fighter object, it's just a blueprint for how to create a fighter object.
    // To make an actual fighter that instantiates the object,
    // we could make a main method like this:
//    public static void main(String[] args) {
//        Fighter arata = new Fighter();
//        arata.name = "Arata";
//        arata.hitPoints = 17;
//        arata.maxDamage = 14;
//        arata.printStats();
//    }
//```
//        Output:
//        ```
//        Arata has 17 hit points and can do 14 damage
//        ```
//
//        But really, we want to keep this kind of code out of our class. Instead, we are going to create a test class.

    // this was put in fighter test class
//Now I can add to the class. I can give all fighters a battle roar.
//
//        Fighter.java:
//        ```
//public void battleRoar(){
//        System.out.println("I am " + name + " and I will destroy you!");
//        }
//        ```
//        FighterTest.java
//        ```
//        arata.battleRoar();
//        ```
//        output:
//        ```
//        I am Arata and I will destroy you!
//        ```
//
//        But now we can create more fighters, too:
//
//        ```
//        Fighter sozalix = new Fighter();
//        sozalix.name = "Sozalix";
//        sozalix.battleRoar();
//        ```
//        We could create five, ten, twenty fighters, with different names and stats. All of them would have the same instance variables, but different values for them. All of them would have access to the same methods.
//

// you call a static method with a class name (e.g., D20.roll20())
  
//public class D20 {
//    public static int rolld20() {
//        return (int) (Math.random() * 20) + 1;
//    }
//}
//```
//
//        In Fighter.java:
//        ```
//public int attackRoll(){
//        return D20.rolld20();
//        }
//        ```
//        In FighterTest.java:
//        ```
//        int attackRoll = arata.attackRoll();
//        System.out.println("Arata attacks and rolls a " + attackRoll);
//        ```
//
//        Now we see that when I defined the rollD20 method as static, it became available throughout the multi-class program. I can write a method in the Fighter class that calls D20 class. And notice I don't have to instantiate the D20 class. I don't have to do something like ```D20 d20 = new D20(); d20.rolld20();```. Instead, I can call the method directly on a class.
//

//