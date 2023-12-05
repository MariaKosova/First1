package oop;

public class homework0512 {

    public static void main(String[] args) {

        Temperature a = new Temperature(451);
        Temperature b = new Temperature( 50);
        Temperature c = new Temperature( 100);

        System.out.println( "The Farenheit temperature " + (a.farenheit) + " is Celsius temperature:" + a.celsius());
        System.out.println( "The Farenheit temperature " + (b.farenheit) + " is Celsius temperature:" + b.celsius());
        System.out.println( "The Farenheit temperature " + (c.farenheit) + " is Celsius temperature:" + c.celsius());
    }
}
