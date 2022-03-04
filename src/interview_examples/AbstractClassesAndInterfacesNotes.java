package interview_examples;

public class AbstractClassesAndInterfacesNotes {
    //Abstract Classes
    //An abstract class is a class that can serve as a superclass, but cannot be directly instantiated. A class is defined as abstract by using the abstract keyword in the class definition. Abstract classes can define abstract methods, which are methods with no body, they only provide information about the method name, return type, and parameters.
    //
    //Any class that inherits from an abstract class must define all abstract methods, or itself be abstract. Another way to say this is that to instantiate a class, it must not be abstract, and have no abstract methods.
    //
    //We would use an abstract class when we want to force subclasses to provide a unique implementation for a method. Let's look at an example of using an abstract class:
    //
    //
    //abstract class Employee {
    //    public abstract String work();
    //}
    //
    //class Accountant extends Employee {
    //    public String work() {
    //        return "crunching numbers";
    //    }
    //}
    //Above, the Accountant class must define a work method because it inherits from Employee and is not defined as abstract. We would expect to see a compile error if Accountant did not define a work method.
    //
    //
    //// ERROR!
    //Employee tim = new Employee();
    //// okay
    //Employee bob = new Accountant();
    //Here we cannot create an instance of the Employee class because it has been declared as abstract. We would expect to see an error when we tried to compile this code.
    //
    //Working With Abstract Classes
    //An abstract class is used to represent something that needs to be extended.
    //
    //Let's say that we want to model employees and their different job positions in an application. We know that every employee will have a name, and belong to a department, but the work that each employee does is dependent on their position.
    //
    //We might model this scenario by creating an Employee class, and specialized job position classes that extend Employee. We can define the Employee class as abstract, and define an abstract method in it to force subclasses to provide an implementation.
    //
    //
    //abstract class Employee {
    //    protected String name;
    //    protected String department;
    //    public Employee(String name, String department) {
    //        this.name = name;
    //        this.department = department;
    //    }
    //    public String getName() {
    //        return name;
    //    }
    //    public String getDepartment() {
    //        return department;
    //    }
    //
    //    public abstract String work();
    //}
    //
    //class Developer extends Employee {
    //    public String work() {
    //        return "writing code";
    //    }
    //}
    //
    //class Manager extends Employee {
    //    public String work() {
    //        return "holding meetings";
    //    }
    //}
    //We can now create instances of Developer or Manager, and have full access to the constructor, the getName, and the getDepartment methods from Employee. By having both inherit from an abstract class, we ensure each subclass has a unique implementation of work, and prevent duplicating code that deals with handling employee names or departments.
    //
    //Interfaces
    //An interface is a special case of an abstract class. An interface is an abstract class that follows these rules:
    //
    //all methods are public and abstract.
    //all properties are public static and final.
    //no static methods.
    //Interfaces are used to define the behaviour of our objects, and thus are typically only used to define methods, and occasionally class constants (public static properties). Interfaces allow us to define the way that our objects interact with the rest of our application.
    //
    //Let's take a look at an interface.
    //
    //
    //public interface WritesCode {
    //    Bug[] writeCode(int numberOfLines);
    //
    //    boolean debug(Bug bug);
    //
    //    void drinkCoffee();
    //
    //    // could return null!
    //    StackOverflowLink searchForAnswer(Bug bug);
    //
    //    BrokenKeyboard smashKeyboard(Keyboard k);
    //}
    //The name of the interface usually contains information about what an object does, or what it is capable of doing. The methods, along with the types of the parameters and return value, convey what the object is doing, but not how (the implementation).
    //
    //Interfaces are implemented by classes with the implements keyword. Like with abstract classes, a class that implements an interface must provide an implementation for each method defined on the interface.
    //
    //Implemented by classes with the implements keyword.
    //A class that implements an interface must provide an implementation for each method defined by the interface.
    //
    //class Developer implements WritesCode {
    //    /* implementations go here */
    //}
    //The Developer class above must provide implementations for all of the methods in WritesCode because it implements the WritesCode interface. If it does not, the code will not compile.
    //
    //Working With Interfaces
    //While interfaces cannot be directly instantiated, they can be used in most places a class is expected; for example, the type of a variable, or the type of a method parameter. This allows our application to be less tightly coupled; that is, we define the implementation of the code independent of where it is used. This allows us to easily swap out implementations for an interface as the business requirements of our application change.
    //
    //To illustrate this concept, imagine we have a tool with a command line interface that tracks users in a system, and our task is to rewrite the tool so that it has a web interface, so that non-developers at our company can use it.
    //
    //One piece of our application deals with outputting an object of type User. If we design our application with interfaces, we might define an interface for displaying a user's information:
    //
    //
    //interface Formatter {
    //    String display(User user);
    //}
    //And provide an implementation for it:
    //
    //
    //class ConsoleFormatter implements Formatter {
    //    public String display(User user) {
    //        return "--------------------" +
    //            "\n  name:  " + user.getName() +
    //            "\n  email: " + user.getEmail();
    //    }
    //}
    //Somewhere in our application is a main method, and we might have code that looks like the following in it:
    //
    //
    //Formatter fmt = new ConsoleFormatter();
    //// ...
    //fmt.display(loggedInUser);
    //// ...
    //for (User user : searchResults) {
    //    fmt.display(user);
    //}
    //The point being, we might have many uses of the fmt object throughout the code, but only 1 reference to the ConsoleFormatter class. Instead, all of our code is tied to the interface, not the implementation.
    //
    //If we needed to change the application to instead output HTML for a web view, we would write another implementation for Formatter that instead outputs HTML.
    //
    //
    //class HTMLFormatter implements Formatter {
    //    public String display(User user) {
    //        return String.format(
    //            "<div class=\"user\"><h2>%s(%s)</h2></div>",
    //            user.getName(), user.getEmail()
    //        );
    //    }
    //}
    //And then change the single line of code that references ConsoleFormatter to instead reference HTMLFormatter. If we wrote our code to depend on the interface and not the implementation, that should be the only change we need to make, the rest of our application can remain the same.
    //
    //More generally speaking, if we write our code such that it relies on interfaces instead of implementations, it allows us to easily switch out the implementation, and for our code base to be better structured and more flexible.
    //
    //Interfaces vs Abstract Classes
    //In summary:
    //
    //Abstract Classes
    //
    //Can use instance as well as static variables and constants.
    //Can define regular methods that contain code and abstract methods that don’t contain code.
    //Can define static methods.
    //Make use of the abstract and extends keywords.
    //Contain
    //instance and static variables.
    //instance and static constants.
    //instance and static methods.
    //Interfaces
    //
    //A class can directly implement multiple interfaces.
    //Any object created from a class that implements an interface can be used wherever the interface is accepted.
    //Can be used in place of classes to decouple parts of our code from implementation details.
    //Make use of the implements and interface keywords.
    //Contain1
    //abstract methods.
    //static constants.
    //In Java, any class can both extend abstract classes and implement interfaces.
}
