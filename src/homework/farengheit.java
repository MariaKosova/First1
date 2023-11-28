package homework;

public class farengheit {
    public static void main(String[] args) {

        result(48);

    }

    static double result ( double f) {

        double c = 5*(f - 32)/9;
        System.out.println( " The Celsius result is " + c);
        return c;


    }
}
