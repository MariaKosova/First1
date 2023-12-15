package Figure_homework1412;

public class Main {

    public static void main(String[] args) {
           Figure circle = new Circle(3.0,3.14);
           Figure rectangle = new Rectangle(4,6);
           Figure square = new Square(6,9);

           Figure [] figures = {circle, rectangle, square};



           for (Figure fig: figures) {
               System.out.println ( rectangle.toString() + square.toString() + circle);

           }




    }
}
