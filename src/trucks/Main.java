package trucks;

import java.util.Arrays;

public class Main {
    //создать класс Truck, содержащий общие хар-ки грузовиков: модель, производитель, год выпуска, цвет, грузоподьемность, объем топливного бака,
    //и имеющий след поведение:
    //должен уметь загркжаться load,и сообщать , если превышена его грузоподъемность
    //также должен сообщать, сколько еще можно загрузить груза
    //должен уметь разгружаться и при этом сообщать, если пытаются сгрузить больше, чем у него есть..
    //должен сообщать вес остающегося груза
    //в случае отсутсствия груза и топлива сообщать о невозможности ехать
    // должен уметь ездить и останавливаться
    //уметь заправляться топливом
    //уметь сообщать имя владельца
    //создать енесколько гркзовиков. протестировать их работу. сложить в массив и вывести на экран


    public static void main(String[] args) {
       Truck truck = new Truck("Eurocargo","Iveco",2023,"red",10000,800,"Smith");

      // System.out.println ("Model: " + truck.getModel() );
      //  System.out.println ("Manufacturer: " + truck.getManufacturer() );
       // System.out.println ("Year: " + truck.getYear() );
        //System.out.println ("Color"  + truck.getColor() );
      //  System.out.println ("Model: " + truck.getModel() );
      //  System.out.println ("Model: " + truck.getModel() );

        System.out.println(truck);
        truck.load(1500);
        truck.load (15000);
        truck.load (5000);

        truck.move();
        truck.setCurrentFuel(600);
        truck.move();

        truck.stop();

        truck.unload(10000);
        truck.unload(2000);
        truck.unload(-1000);
        truck.unload(3000);


        Truck truck1 = new Truck( "Supertruck1", "MAN", 2018, "black- yellow", 10000, 400, "Jack White");
        int[]x={1,2};
        for (int i=0; i<x.length; i++) {
            System.out.println (x[i]);

        }
      Truck[]trucks = {truck, truck1};
        for( int i=0; i <trucks.length; i ++)
        System.out.println (trucks[i]);

        System.out.println(Arrays.toString(trucks));
        System.out.println();

        for(Truck tr: trucks) {
            System.out.println( "truck " + tr.getManufacturer() + tr.getOwner());
        }



    }




}
