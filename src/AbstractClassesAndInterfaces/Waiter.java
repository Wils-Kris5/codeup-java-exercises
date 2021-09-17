package AbstractClassesAndInterfaces;

public class Waiter extends Employee {
    // waiter needs to either be declared as abstract or implement the doWork method
    public String doWork() {
        return "Serving the guests...";
    }

//    public static void main(String[] args) {
//        Waiter waiter = new Waiter();
//        System.out.println(waiter.doWork());
        // can we create an employee of the type Employee? no

 // can we create an employee of the type Waiter? no
       // can we create a waiter of the type Waiter? Yes!
 // can we create a waiter of the type Employee? Yes!

    Employee waiter = new Waiter();
        Employee developer = new Developer();



 public static void employeesDOWork(Employee[] employees){
  for (Employee e : employees){
 System.out.println(e.doWork());

 }
    }
}


