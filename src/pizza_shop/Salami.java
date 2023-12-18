package pizza_shop;

public class Salami extends Pizza {

    private String salami;
    private String cheese1;

    private String sugoDiPomodoro;

    public Salami(String dough, String salami, String cheese1, String sugoDiPomodoro) {
        super(dough);
        this.salami = salami;
        this.cheese1 = cheese1;
        this.sugoDiPomodoro = sugoDiPomodoro;

    }

    public String getSalami() {
        return salami;
    }

    public String getCheese1() {
        return cheese1;
    }

    public String getSugoDiPomodoro() {
        return sugoDiPomodoro;
    }

    @Override
    public String toString() {
        return "Salami{" +
                "salami='" + salami + '\'' +
                ", cheese1='" + cheese1 + '\'' +
                ", sugoDiPomodoro='" + sugoDiPomodoro + '\'' +
                '}';
    }

    public String prepare() {
        return super.prepare() + getSalami() + ", " + getCheese1() + ", " + getSugoDiPomodoro();
    }

    public String bake() {
        return super.bake();
    }

    public String pack() {
        return super.pack();
    }
}




