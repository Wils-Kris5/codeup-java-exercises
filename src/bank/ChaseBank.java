package bank;

public class ChaseBank extends Bank{
//   public double balance;
         ChaseBank(String name, double account){
             super(name, account);

         }
//you have to create an instance because this was not a void method
// when its a void method you return the data typing-
//  the access modifier(public/private/protected/<<final<scope based> final is an instance that cannot be changed API KEY>>CRUD>>>)
    @Override
    public double accountBalance() {
       double balance = 3500;
        System.out.println("my balance is: " + balance);
        return balance;
    }

//    @Override
//    public double accountBalance(double myBalance) {
//      double balance = myBalance;
//        return 0;
//    }
    //
//    public double accountBalance(double account) {
//          double currentBalance = account;
//          return currentBalance;
    }

