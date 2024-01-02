package shapes_homework2112;

public class Circle implements Shape {
    double r;
    double P;

    public Circle(double r, double P) {
        this.r = r;
        this.P = 3.14;
    }


    @Override
    public double findArea() {
        double result = r*r*P;
        System.out.println( "The area of circle is: " +result);
        return result;
    }

    @Override
    public void findPerimeter() {
        System.out.println ("The length  of circle is: " + (2*P *r));
    }
}
