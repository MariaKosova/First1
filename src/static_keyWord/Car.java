package static_keyWord;

public class Car {
    private String name;
    private int year;

    private static int carCounter;

    public Car (String name) {
        this.name = name;
        this.year = year;
        carCounter++;
    }

    public static int getCarCounter() {
        return carCounter;
    }

    public static void setCarCounter ( int numberOfCars){
        carCounter = numberOfCars;
        }
        public String getName(){
        return getName();
        }

        public static String getCarInfo (Car car){
            return car.name + " , production year" + car.year;
        }
        // car - имя переменной
    }


