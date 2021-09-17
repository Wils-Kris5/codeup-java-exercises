package bank;

//bank.Bank(); is your superclass
 public abstract class Bank {
//this is where you state/declare instance properties
    String name;
    private double bankAccount;
//constructor method: based off the classes object, description//shell // you will know its a constructor with Capital
Bank(String name, double bankAccount){
    this.name = name;
    this.bankAccount = bankAccount;
}

//Methods: methods that map out the logic behind the objects functionality

              public double getBankAccount() {
                  return bankAccount;
              }
         //void is used as the SETTING value, you can just return a sout or print of the returning value
              public void setBankAccount() {
                  this.bankAccount = bankAccount;
                  System.out.println("this is my bank account" + bankAccount);
              }

              //Test: this runs the tests for class//directory//package
          public abstract double accountBalance();
//Youre NOT instanciating/ this is the blueprint of the method that test will follow and be used OUTSIDE of the class
    //instanciating = putting a body ABSTRACT METHODS DONT GOT NOBODY
}
