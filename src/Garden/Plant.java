package Garden;

public abstract class Plant {

    String name;
    String height;
    int age;

    public Plant(String name, String height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public void doSpring() {
        System.out.println(name + "has grown " + (height+10));


    }



    public void doSummer() {
        System.out.println( "");

    }

    public void doAutumn() {

    }

    public abstract void doWinter();


    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", height='" + height + '\'' +
                ", age=" + age +
                '}';
    }
}

