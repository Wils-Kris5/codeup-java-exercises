package AbstractClassesAndInterfaces;

abstract public class Employee {

 protected abstract String doWork();

  public void onboardWithEmployer() {
   System.out.println("Onboarding");
  }

 public void  quit() {
  System.out.println("I quit!!!");



 }
}
