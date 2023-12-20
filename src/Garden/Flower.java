package Garden;

public class Flower extends Plant {

    public Flower(String name, String height, int age) {
        super(name, height, age);
    }

    @Override

    public void doSpring() {
        super.doSpring();
    }


    @Override
    public void doWinter() {
        System.out.println(name + "hasn't grown in winter");

    }

    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", height='" + height + '\'' +
                ", age=" + age +
                '}';

    }
}
