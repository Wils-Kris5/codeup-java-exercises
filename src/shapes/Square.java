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
    @Override
    public int getArea() {
         int squareArea = (side * side);
        System.out.println("Square Area = " + squareArea);
       return squareArea;
    }
      public int getPerimeter(){
        int squarePerimeter = (4 * side);
          System.out.println("Square Perimeter = " + squarePerimeter);
          return squarePerimeter;
      }
}
