package dog_homework0712;

public class Main {
   // Создать класс Dog c полями name , counter и конструктором. Cоздать несколько обьектов этого класса и вывести на печать количество созданных обьектов.

    public static void main(String[] args) {

        Dog dog = new Dog( "Sherlock", 2, "black");
        Dog dog1 = new Dog("Nick", 3, "white");
        Dog dog2= new Dog( "Lira", 4, "grey");

        System.out.println( "Dogs: " + dog.getName() + ", " + dog1.getName() + ", "+  dog2.getName() + "." + " In total there are " +  Dog.counter + " dogs. ");

    }
}
