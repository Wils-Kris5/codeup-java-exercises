public class SubStingExampleTest {

    public static void main(String[] args) {
//        SubStringExample s = new SubStringExample();
//    an unchecked excception IntelliJ wont redline bc it wont be read by the complier
          //it will compile but it THROW an error at run time/ the green play button is compilingAndRunning in two seperate commands

                try {
                    String justAnExample = "this is just a string";
                    System.out.println(justAnExample.length());
                    System.out.println(justAnExample.substring(-5));

        }     catch (IndexOutOfBoundsException ioobe){
                    System.out.println("Hey Dude! Out of bounds!!");
                }



    }
}
