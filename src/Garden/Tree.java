package Garden;

public class Tree extends Plant {

    public Tree (String name, String height, int age) {

        super (name, height,age);

    }

    @Override
    public void doSpring() {
        super.doSpring();
    }

    public void doWinter () {
        System.out.println (name+ "hasn't grown in winter");


    }
}
