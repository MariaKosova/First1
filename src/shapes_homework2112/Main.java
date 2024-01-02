package shapes_homework2112;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        Circle circle1 = new Circle(4.0, 3.14);
        Circle circle2 = new Circle(2.0, 3.14);
        circle1.findArea();
        circle1.findPerimeter();
        circle2.findArea();
        circle2.findPerimeter();
        Rectangle rectangle = new Rectangle(2, 7);
        Rectangle rectangle2 = new Rectangle(6, 9);

        rectangle.findArea();
        rectangle.findPerimeter();
        rectangle2.findArea();
        rectangle2.findPerimeter();

      //  Shape[] shapes = {circle1, circle2, rectangle, rectangle2};

       //     for (Shape sh : shapes) {
         //       System.out.println("The sum of areas is: " +
          //              (circle1.findArea() +
          //             circle2.findArea() + rectangle.findArea() +
          //             rectangle2.findArea()));
          //   }
        }
    }








