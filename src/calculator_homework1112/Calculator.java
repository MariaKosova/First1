package calculator_homework1112;

public class Calculator {
    /* Создать класс Calculator, способный выполнять два арифметических действия
    - сложение двух чисел, вычитание двух чисел а также сложение трех чисел
    и вычитание трех чисел.
    Калькулятор должен работать как для целых чисел, так и для
    чисел с запятой. (т.е. в классе надо создать соответствующие методы
    и затем вызывать их в методе main)
     */
    double x;
    double y;
    double z;


    public Calculator (double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Calculator (double x, double y, double z) {
        this(x, y);
        this.z =z;
    }

    public static void findSum( double x, double y) {
        System.out.println("the sum of " + x + " and " + y + " is " + (x + y));
    }

    public static void findSum2( double x, double y, double z) {
        System.out.println ("the sum of " + x + " ," +  y + " and " + z + " is " + (x+y+z));

    }
    public static  void findDifference (double x, double y) {

        System.out.println ("the difference between " + x  + " and " + y + " is  " + (x-y));
    }

    public static void findDifference2(double x, double y, double z) {
       System.out.println( "the difference between " + x + ", " + y + " and " + z + " is: " +(x-y-z));

    }


}
