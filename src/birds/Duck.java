package birds;

public class Duck extends Bird {

    public void makeNoise() {
        System.out.println("Quack Quack");
    }

  public Duck(){
      super("Duck");

  }
  public void setName(String duckName){
        super.setName(duckName);
//        super.name = duckName;
  }
    public Duck(String name){
     //   this.setName(name);
        super(name);
      System.out.println("A new Duck is made!");
  }
 // anything outside the class where name genisised from cannot be refrenced

}
