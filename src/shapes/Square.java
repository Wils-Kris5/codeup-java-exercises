package shapes;

public class Square extends Rectangle {
    private int side;
    //define a constructor that accepts one argument, side,
    // and calls the parent's constructor to set both
    // the length and width to the value of side.

    public Square(int side) {
        super(side, side);
        this.side = side;
    }
    public int getArea(int side) {
        System.out.println("Square getArea() method");
       return side * side;
    }
      public int getPerimeter(){
          System.out.println("Square getPerimeter() method");
        return 4 * side;
      }
}
