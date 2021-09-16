package shapes;

public class Rectangle {


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

    //protected properties for both length and width.
    protected int length;
    protected int width;

    public Rectangle() {

    }


    public Rectangle(int intLength, int intWidth) {
        int length = intLength;
        int width = intWidth;

    }

    public int getPerimeter() {

        return 2 * intLength + 2 * intWidth;
    }

    public int getArea() {
        int area = (this.length) * (this.width);
        return area;
    }



// Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
//
//Create two methods on the Rectangle class,
// getArea and getPerimeter that return the respective values.
// The formulas for both follow


    }

