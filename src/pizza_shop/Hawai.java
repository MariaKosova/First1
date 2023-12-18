package pizza_shop;

public class Hawai extends Pizza {

    private String ananas;
    private String ham;
    private String cheese;

    public Hawai(String getDough, String ananas, String ham, String cheese) {
        super(getDough);
        this.ananas = ananas;
        this.ham = ham;
        this.cheese = cheese;
    }


    public String getAnanas (){
        return ananas;
    }
    public String getHam() {
        return ham;
    }
    public String getCheese() {
        return cheese;
    }

    @Override
    public String toString() {
        return "Hawai{" +
                "ananas='" + ananas + '\'' +
                ", ham='" + ham + '\'' +
                ", cheese='" + cheese + '\'' +
                '}';
    }
    public String prepare () {
        return super.prepare() +getAnanas() +"," + getHam() + "," + getCheese();
    }
    public String bake() {
        return super.bake();
    }
    public String pack (){
        return super.pack();
    }
}
