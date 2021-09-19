package shapes;

public class Square extends Quadrilateral {

    //define a constructor that accepts one argument, side,
    // and calls the parent's constructor to set both
    // the length and width to the value of side.

    public Square(double side) {
        super(side, side);
        //this.side = side;
    }
    @Override
    public double getArea() {
         double side = length;
        System.out.println(" Area = " + getArea());
       return side * side;
    }
      public double getPerimeter(){
        double side =  length;
              //  (4 * side);

          System.out.println(" Perimeter = " + getPerimeter() );
          return 4 * side;
      }
      public void setWidth(double side){
        this.width = side;
        this.length = side;
      }
      public void setLength(double side){
        setWidth(side);
      }
}
