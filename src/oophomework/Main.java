package oophomework;

public class Main {
    //Создать класс Rectangle (прямоугольник), содержащий переменные длина и ширина,
    // конструктор и методы для подсчета площади и периметра прямоугольника.
    //В классе Main создать несколько обьектов класса Rectangle и вывести на экран площадь и периметр каждого
    public static void main(String[] args) {

        Rectangle1 a = new Rectangle1 (5,6);
        Rectangle1 b = new Rectangle1 (1,2);
        Rectangle1 rect1 = new Rectangle1 (1,2);
        Rectangle1 rect2 = new Rectangle1 ( 1,2);
        Rectangle1 rect3 = new Rectangle1( 1,2);


        System.out.println ("Rectangle a area is " + a.getArea() + " , perimeter is " + a.getPerimeter());
        System.out.println ( "Rectangle b area is " + b.getArea() + " , perimeter is " + b.getPerimeter());
        System.out.println ( "Rectangle rect1 area is " + rect1.getArea() + " , perimeter is " + rect1.getPerimeter());


    }
}
