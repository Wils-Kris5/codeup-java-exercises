package util;
public class InputTest {
    public static void main(String[] args) {
        Input input = new util.Input();
        input.getString();
        input.yesNo("enter yes or no: ");
        input.getInt("enter an integer");
        input.getInt(1, 10);
        input.getDouble("enter an integer");
//        String userInput = input.getString();
//        System.out.println(userInput);
//        boolean yesNo = input.yesNo(userInput);
//        System.out.println(yesNoResult ? "User said yes" : "User said no");
//

    }
}