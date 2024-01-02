package shapes_homework2112;

public class Rectangle implements Shape {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double findArea() {
        double result1 =a*b;
       System.out.println("The rectangle's area is: " + result1);
       return result1;
    }

    @Override
    public void findPerimeter() {
        System.out.println("The rectangle's perimeter is:"  +(a+b));
    }
}

