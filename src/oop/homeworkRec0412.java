package oop;

public class homeworkRec0412 {

    public static void main(String[] args) {

        Rectangle rectangle1 =new Rectangle();
        rectangle1.width = 4;
        rectangle1.lenght =3;

        System.out.println ("The perimeter of rectangle 1 is: " + (rectangle1.perimeter (4,3)));
        System.out.println ("The area of rectangle 1 is: " +(rectangle1.areaRectangle (4, 3)));

        System.out.println ();
        Rectangle rectangle2 = new Rectangle ();
        rectangle2.width = 5;
        rectangle2.lenght = 6;
        System.out.println ("The perimeter of rectangle 2 is: "+ (rectangle2.perimeter (5, 6)) );
        System.out.println ("The area of rectangle 2 is: " + (rectangle2.areaRectangle (5, 6)));

        System.out.println ();
        Rectangle rectangle3 = new Rectangle ();
        rectangle3.width = 7;
        rectangle3.lenght =8;
        System.out.println ("The perimeter of rectangle 3 is: "+ (rectangle3.perimeter (7,8)));
        System.out.println ("The area of rectangle 3 is: " + (rectangle3.areaRectangle (7,8)));





    }
}


