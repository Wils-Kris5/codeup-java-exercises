package AbstractClassesAndInterfaces;

public abstract class StringTransformer {
 //- add a protected string variable called ‘str’
    protected String str;

//  - add a constructor to set the variable

StringTransformer(){
    this.str = str;
}

//  - add public add getters and setters for this variable

 public String getStr() {
    return str;
}

 public void setStr(String str) {
        this.str = str;
     System.out.println("Setting the string");
    }
    //  - add an abstract method called ‘transform()’ that returns a string
   public abstract String transform(String myStr);
}
