package AbstractClassesAndInterfaces;

import java.util.Arrays;

public class Waiter extends Employee implements Transferable {
    // waiter needs to either be declared as abstract or implement the doWork method
    public String doWork() {
        return "Serving the guests...";
    }
    @Override
    public void syncUp(){
        System.out.println("talk with manager");
    }
     @Override
    public void escalateQuestion(){
        System.out.println("flag down manager to ask question");
    }
    @Override
    public void transferToNewLocation(String location) {
        System.out.println("Moving to " + location + ". checking with manager of that location");
    }

    @Override
    public String[] getListOfPossibleTransferLocations() {
        return new String[]{"location1", "location2"};
    }

    public static void main(String[] args) {
 //this is the test class

//        Waiter waiter = new Waiter();
//        System.out.println(waiter.doWork());
        // can we create an employee of the type Employee? no

        // can we create an employee of the type Waiter? no
        // can we create a waiter of the type Waiter? Yes!
        // can we create a waiter of the type Employee? Yes!

//    Employee waiter = new Waiter();

//    Employee developer = new Developer();
   
        Transferable waiter = new Waiter();
        GameConsole gameConsole = new GameConsole();
        
        waiter.transferToNewLocation("San Antonio Location 4");
        System.out.println(Arrays.toString(waiter.getListOfPossibleTransferLocations()));

       Transferable[] transferables = {waiter, gameConsole};
       transferableStuff(transferables, "Dallas, TX");
    }

    private static void transferableStuff(Transferable[] transferables, String s) {
    }

    public static void transferStuff(Transferable[] transferables, String location){
        for (Transferable transferable : transferables) {
        }

 }

    public static void employeesDOWork(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e.doWork());

        }

    }
}


