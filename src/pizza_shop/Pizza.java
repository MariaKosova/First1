package pizza_shop;

import java.sql.SQLOutput;

public class Pizza {

    private String dough;

    public Pizza (String dough) {
        this.dough = dough;
    }
    public String getDough () {
        return getDough();
    }

    @Override
    public String toString() {
        return " pizza " + dough;
    }

    public String prepare() {
       return " Preparing pizza with ";
    }

    public String bake () {
        return " Baking your pizza";
        }
    public String pack () {
        return "Your pizza has been packed and  sent to the delivery";
    }

}
