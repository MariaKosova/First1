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
    //public String getModel (){
      //  return model;
    //}
    public String getManufacturer(){
     return manufacturer;
    }
    /*public int getYear (){
        return year;
    }
    public String getColor() {
        return color;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    //public void setMaxWeight(int maxWeight) {
     //   if (getMaxWeight() < 20000) {
     //       this.maxWeight = maxWeight;
     //   }
     //   else System.out.println("The weight is too big");
    //}

    public int getMaxFuel() {
        return maxFuel;
    }

    //public int getCurrentFuel() {
    //    if (currentFuel==0 || currentFuel<3){
    //        System.out.println ("Please fill the fuel tank, the truck can't go");
    //    }
    //    return currentFuel;

    //}
    //public String toString (){
       // return  ( "Truck:" + getModel() + "Manufacturer " + getManufacturer() + " Year " + getYear() + "Color" + getColor() + "Max Weight" + getMaxWeight() +
         //       "Max Fuel" + getMaxFuel() + "Owner" + getOwner());
//}
*/

public void load (int weight) {
    if (weight > getRemainingCapacity()) {
        System.out.println("This is too heavy to me! I can't continue");
        printRemainingCapacity();
        return;
        //выйдет из метода
    }
    currentWeight += weight;
    System.out.println("Loading " + weight + " kg...");
    System.out.println(" Loaded" + weight + " kg...");
    printRemainingCapacity();
}


public void unload (int unloadingWeight) {
    if (unloadingWeight > currentWeight) {
        System.out.println(" Not enough cargo!");
        printRemainingCargo();
        return;
    }

    if (unloadingWeight < 0) {
        System.out.println("Can't unload negative weight");
        return;
    }

    currentWeight -= unloadingWeight;
    System.out.println("Unloading" + unloadingWeight + " kg...");
    System.out.println("Unloaded" + unloadingWeight + " kg ...");
    printRemainingCargo();
}
private void printRemainingCargo() {
            System.out.println(" Remaining cargo weight is" + currentWeight + " kg");
        }
        public void move(){
        if(currentFuel ==0) {
            System.out.println ("Please load the truck before driving!");
            return;
        }
        System.out.println ( "Loading..");
        System.out.println (" Loading ..");
        System.out.println (" Loaded..");

}
    public void stop(){
        System.out.println ( "Stopping...");
        System.out.println ( "Stopping...");
        System.out.println ("Yeah!");

    }
    public void setCurrentFuel(int currentFuel){
        if(currentFuel> maxFuel){
            this.currentFuel = maxFuel;
            return;
        }
        this.currentFuel= currentFuel;
    }

    public String getOwner(){
        return "the owner is " + owner;
    }
    private void printRemainingCapacity(){
        System.out.println ("Remaining capacity " + getRemainingCapacity() + "kg");
    } //печатает, сколько можно загрузить груза на борту

    private int getRemainingCapacity() {
        return maxWeight -currentWeight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", maxWeight=" + maxWeight +
                ", maxFuel=" + maxFuel +
                ", owner='" + owner + '\'' +
                '}';
    }

}
