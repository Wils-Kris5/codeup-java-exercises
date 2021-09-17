package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
   // protected properties for both length and width.
    protected int length;
    protected int width;



    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }



    public Rectangle(int intLength, int intWidth) {
       this.length = intLength;
        this.width = intWidth;

    }

    public int getPerimeter() {
        int perimeter = ((2 * this.length) + (2 * this.width));
        // you have to sout before returning so this it knows the vaule needs to be printed first to return it for display
        System.out.println("Rectangle Perimeter = " + perimeter);
          return perimeter;
    }

    public int getArea() {
        int area = (this.length) * (this.width);
        System.out.println("Rectangle Area = " + area );
        return area;
    }



// Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
//
//Create two methods on the Rectangle class,
// getArea and getPerimeter that return the respective values.
// The formulas for both follow


 }

