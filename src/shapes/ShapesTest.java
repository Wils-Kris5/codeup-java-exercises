package shapes;

public class ShapesTest {


    public static void main(String[] args) {
        Measurable myShape =  new Rectangle(5, 4);

//     myShape.getPerimeter();
//        myShape.getArea();

        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
//     Rectangle box1 = new Rectangle(5, 4);
//     box1.getArea();
//     box1.getPerimeter();
// System.out.println("Perimeter is " + myShape.getPerimeter() + " area is: " + myShape.getArea());
//
//
        myShape = new Square(5);
//      Rectangle box2 = new Square(5);
//        myShape.getPerimeter();
//        myShape.getArea();
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
//      box2.getArea();
//      box2.getPerimeter();
 //   System.out.println("Square Perimeter is " + box2.getPerimeter() + "Rectangle area is: " + box2.getArea());




    }
}

