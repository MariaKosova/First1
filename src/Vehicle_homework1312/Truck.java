package Vehicle_homework1312;

public class Truck extends Vehicle {

    int backVolume;

    public Truck (String model, String manufacturer, int year, String colour, int maxWeight, int backVolume){
        super (model, manufacturer, year, colour, maxWeight);
        this.backVolume = backVolume;

    }

    @Override
    public void move() {System.out.println("Truck moves.");
    }

    @Override
    public void stop() {System.out.println ("Truck stops.");

    }
}
