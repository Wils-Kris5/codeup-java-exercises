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

       return side * side;
    }
    @Override
      public double getPerimeter(){
        double side =  length;

          return 4 * side;
      }
      @Override
      public void setWidth(double side){
        this.width = side;
        this.length = side;
      }
      @Override
      public void setLength(double side){

        setWidth(side);
      }
}
