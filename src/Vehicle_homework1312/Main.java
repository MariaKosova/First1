package Vehicle_homework1312;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Model", "MAN", 2020, "blue", 20000);
        Vehicle truck = new Truck("Super", "KAMAZ", 2021, "red", 15000, 10);
        Vehicle passengerCar = new PassengerCar("Sprinter", "Mercedez-Benz", 2022, "grey", 3350, 16, 4);

        Vehicle[] vehicles = {vehicle, truck, passengerCar};

        vehicle.move();
        vehicle.stop();
        truck.move();
        truck.stop();
        passengerCar.move();
        passengerCar.stop();
    }
}
