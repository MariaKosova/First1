package oop;

public class Rectangle {

    //Создать класс Rectangle (прямоугольник), содержащий переменные длина и ширина,
    // конструктор и методы для подсчета площади и периметра прямоугольника.
    // В классе Main создать несколько обьектов класса Rectangle и вывести на экран площадь и периметр каждого
    double width;
    double lenght;

    public Rectangle() {

    }

    public Rectangle(double rectangleWidth, double rectangleLenght) {
        width = rectangleWidth;
        lenght = rectangleLenght;
    }


    //public Rectangle (double width, double lenght){

    //        this.width = width;
    //        this.lenght = lenght;
    //    }

    public static double perimeter(double width, double length) {
        double perimeter = 2 * width + 2 * length;
        return perimeter;
    }


    public static double areaRectangle(double width, double lenght) {
        double areaRectangle = width * lenght;
        return areaRectangle;
    }
}






