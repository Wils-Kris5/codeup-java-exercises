package InheritanceAndPolymorphism;

public class InheritanceLecture {
     //classes can be related to one another in packages
    /*
    when we set up an inheritance structure it helps us avoid code repitition closley related classes that are similar to one another we can have them draw from one source
    We can define classes that extend, or inherit from another class with the extends keyword in the class definition. We call these subclasses, and the classes that are being inherited from / extended superclasses.

A subclass inherits all the fields of it's superclass, and can re-use any of it's functionality.


 Create a InheritanceAndPolymorphism.Vehicle class with two properties: a name instance variable and a makeNoise() method.

 The instance variable should be private and have getters and setters (in IntelliJ try cmd-N).

 The makeNoise method should just sout out a typical vehicle noise. Then create a more specific vehicle subclass, such as Motorcycle, Car, InheritanceAndPolymorphism.Truck, Tractor, whatever.

  Make the specific vehicle class extend the InheritanceAndPolymorphism.Vehicle class. Otherwise, keep it empty. Create a test class, perhaps calling it InheritanceAndPolymorphism.VehicleTest Instantiate the specific vehicle, assign a value to the name property and run the methods on the specific vehicle.

  Notice the inherited method works and the inherited name property is assignable on the subclass.
    >> InheritanceAndPolymorphism.Vehicle.java , InheritanceAndPolymorphism.VehicleTest.java , InheritanceAndPolymorphism.Truck.java

     */
}
