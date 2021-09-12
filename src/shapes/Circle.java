package shapes;

public class Circle {
    private double radius;

   public double getArea(){
       double area = Math.PI * (this.radius * this.radius);
       System.out.println("The area is: " + area);
       return area;
   }

   public double getCircumference() {
    double circumfrence = 2 * Math.PI * this . radius;
       System.out.println("The Circumference is: " + getCircumference());
    return circumfrence;
   }


    public Circle(double radius) {
        this.radius = radius;

        



    }
}
