package Vehicle_homework1312;

public class Vehicle {
    String model;
    String manufacturer;
    int year;
    String colour;
    int maxWeight;

    public Vehicle (String model, String manufacturer, int year, String colour, int maxWeight) {
        this.model= model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.colour = colour;
        this.maxWeight =maxWeight;
    }

    public void move () {
        System.out.println("Vehicle moves.");
    }
    public void stop () {
        System.out.println ("Vehicle stops. ");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                ", maxWeight=" + maxWeight +
                '}';
    }
}
