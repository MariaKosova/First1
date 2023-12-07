package dog_homework0712;

public class Dog {

    private String name;
    private String color;
    private int age;
    static int counter;



    public Dog (String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        counter ++;
    }
    public String getName (){
        return name;
    }
    public int getAge (){
        return age;
    }
    public String getColor() {
        return color;
    }

}
