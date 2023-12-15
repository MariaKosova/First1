package Figure_homework1412;

public class Figure {
    //Геометрические фигуры
    //    Используя свойства наследования написать программу для подсчета площади трех видов фигур -
    //    круга, прямоугольника и квадрата.
    //
    //    Создать классы Circle, Rectangle, Square , содержащие соответствующие методы.
    //    Затем в методе main создать маcсив из нескольких фигур и вывести на печать площади каждой фигуры и название ее
    //    примерно в таком виде :
    //    Circle has area of 100.0
    //    Rectangle has area of 400.0
    //    Square has area of 340.0

    double a;
    double b;
    double r;
    double  p = 3.14;

    public Figure (int a, int b) {
    this.a = a;
    this.b = b;
}
    public Figure ( double r, double p) {
        this.r = r;
}

    public static void toString(Figure[] figures) {
        System.out.println();
    }


    public void area () {
        System.out.println( a*b);

    }

    public void circleArea() {
            double s = (r*r) *p;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

}
