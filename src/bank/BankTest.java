package bank;

public class BankTest {

    public static void main(String[] args) {
//when youre instanciating a class & its abstract- you cannot refer to the Parent class=Bank
        Bank chase = new ChaseBank("Chase Bank", 670089021);
        chase.setBankAccount();
         chase.accountBalance();

    }
}
