package trucks;

public class Truck {
    private  String model;
    private String manufacturer;

    private int year;
    private String color;
    private int maxWeight;
    private int maxFuel;
    private String owner;

    private int currentWeight =0;

    private int currentFuel = 0;


    public Truck(String model, String manufacturer, int year, String color, int maxWeight, int maxFuel, String owner) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.maxWeight = maxWeight;
        this.maxFuel = maxFuel;
        this.owner = owner;
    }
    public String getModel (){
        return model;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public int getYear (){
        return year;
    }
    public String getColor() {
        return color;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        if (getMaxWeight() < 20000) {
            this.maxWeight = maxWeight;
        }
        else System.out.println("The weight is too big");
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public int getCurrentFuel() {
        if (currentFuel==0 || currentFuel<3){
            System.out.println ("Please fill the fuel tank, the truck can't go");
        }
        return currentFuel;

    }
    //public String toString (){
       // return  ( "Truck:" + getModel() + "Manufacturer " + getManufacturer() + " Year " + getYear() + "Color" + getColor() + "Max Weight" + getMaxWeight() +
         //       "Max Fuel" + getMaxFuel() + "Owner" + getOwner());
//}






    public void unload (int unloadindWeight){
    }
    public void move(){}
    public void stop(){}
    public void fillFuel(int currentFuel){}

    public String getOwner(){
        return "the owner is" + owner;
    }
    private void printRemainingCapacity(){} //печатает, сколько остается груза на борту

    public String toString () {
        return "";

    }

}
