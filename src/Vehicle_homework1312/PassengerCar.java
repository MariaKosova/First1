package Vehicle_homework1312;

public class PassengerCar extends Vehicle {

    int passengerNumber;
    int childrenSeats;

    public PassengerCar (String model, String manufacturer, int year, String colour, int maxWeight, int passengerNumber, int childrenSeats){
        super (model, manufacturer, year, colour, maxWeight);
        this.passengerNumber = passengerNumber;
        this.childrenSeats = childrenSeats;
    }

    @Override
    public void move() { System.out.println ("Passenger car moves.");

    }

    @Override
    public void stop() {
        System.out.println("Passenger car stops.");
    }
}
