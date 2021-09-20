package birds;

public class Duck extends Bird {

    public void makeNoise() {
        System.out.println("Quack Quack");
    }

  public Duck(){
//      super("Duck");

  }
  public void setName(String duckName){
        super.setName(duckName);
//        super.name = duckName;
  }
    public Duck(String name){
 //this is referring to if you wanted to pass through ANY KIND of Duck
     //   this.setName(name);
        super(name);
      System.out.println("group.B.A new Duck is made!");
  }
 // anything outside the class where name genisised from cannot be refrenced
 // if its within the same package you DONT HAVE TO set it to public because it will get that from the super
}
