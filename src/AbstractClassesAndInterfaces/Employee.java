package AbstractClassesAndInterfaces;

abstract public class Employee {

 public abstract String doWork();

  public void onboardWithEmployer() {
   System.out.println("its my first day and I'm onboard");
  }

 public void  quit() {
  System.out.println( "I quit!!!");

 }
}
