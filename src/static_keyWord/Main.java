package static_keyWord;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {

    public static void main(String[] args) {
        Car car= new Car ("BMW");
        Car car1 = new Car ("BMW1");

        System.out.println(Car.getCarCounter());
        Car.setCarCounter(0);
        System.out.println (Car.getCarCounter());

        System.out.println (Car.getCarInfo(car));
       // Main.m = new Main();
        //m.printSmth ();



    }
}
