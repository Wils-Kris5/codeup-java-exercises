package AbstractClassesAndInterfaces;

public abstract class Employee implements Manageable {

  protected abstract String doWork();

  public void onboardWithEmployer() {
   System.out.println("Onboarding");
  }

  public void quit () {
   System.out.println("I quit!!!");
  }



 }

