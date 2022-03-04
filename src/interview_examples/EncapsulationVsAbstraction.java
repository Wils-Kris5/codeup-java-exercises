package interview_examples;

public class EncapsulationVsAbstraction {
    //Difference between Abstraction and Encapsulation in Java
    //
    //Parameter	:
    // Abstraction	  Encapsulation
    //Use for:
    // Abstraction solves the problem and issues that arise at the design stage.
    // Encapsulation solves the problem and issue that arise at the implementation stage.

    //Focus:
    // Abstraction allows you to focus on what the object does instead of how it does it	Encapsulation enables you to hide the code and data into a single unit to secure the data from the outside world.
    //Implementation:
    // You can use abstraction using Interface and Abstract Class.	You can implement encapsulation using Access Modifiers (Public, Protected & Private.)
    //Focuses:
    // Focus mainly on what should be done.	Focus primarily on how it should be done.
    //Application:
    // During design level.	During the Implementation level.

    //Overview
    //Encapsulation is one of the fundamentals of OOP (object-oriented programming). It refers to the bundling of data with the methods that operate on that data. Encapsulation is used to hide the values or state of a structured data object inside a class, preventing unauthorized parties’ direct access to them. Publicly accessible methods are generally provided in the class (so-called getters and setters) to access the values, and other client classes call these methods to retrieve and modify the values within the object.[1]
    //
    //Discussion
    //The most important principle of object orientation is encapsulation: the idea that data inside the object should only be accessed through a public interface – that is, the object’s methods.
    //
    //If we want to use the data stored in an object to perform an action or calculate a derived value, we define a method associated with the object which does this. Then whenever we want to perform this action we call the method on the object. We consider it bad practice to retrieve the information from inside the object and write separate code to perform the action outside of the object.
    //
    //Encapsulation is a good idea for several reasons:
    //
    //the functionality is defined in one place and not in multiple places.
    //it is defined in a logical place – the place where the data is kept.
    //data inside our object is not modified unexpectedly by external code in a completely different part of our program.
    //when we use a method, we only need to know what result the method will produce – we don’t need to know details about the object’s internals in order to use it. We could switch to using another object which is completely different on the inside, and not have to change any code because both objects have the same interface.
    //We can say that the object “knows how” to do things with its own data, and it’s a bad idea for us to access its internals and do things with the data ourselves. If an object doesn’t have an interface method which does what we want to do, we should add a new method or update an existing one.
    //
    //Some languages have features which allow us to enforce encapsulation strictly. In Java or C++, we can define access permissions on object attributes, and make it illegal for them to be accessed from outside the object’s methods. In Java it is also considered good practice to write setters and getters for all attributes, even if the getter simply retrieves the attribute and the setter just assigns it the value of the parameter which you pass in.
    //
    //In Python, encapsulation is not enforced by the language, but there is a convention that we can use to indicate that a property is intended to be private and is not part of the object’s public interface: we begin its name with an underscore. Python also supports the use of a property decorator to replace a simple attribute with a method without changing the object’s interface.
    //
    //Key Terms
    //abstraction
    //A technique for arranging complexity of computer systems so that functionality may be separated from specific implementation details.[2][3]
    //accessor
    //A method used to return the value of a private member variable, also known as a getter method.[4]
    //encapsulation
    //A language mechanism for restricting direct access to some of an object’s components.[5]
    //information hiding
    //The principle of segregation of the design decisions in a computer program from other parts of the program. See encapsulation.[6]
    //mutator
    //A method used to control changes to a private member variable, also known as a setter method.[7]
    //private
    //An access modifier that restricts visibility of a property or method to the class in which it is defined.[8]
    //public
    //An access modifier that opens visibility of a property or method to all other classes.[9]
}
