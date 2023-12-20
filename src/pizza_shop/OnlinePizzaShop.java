package pizza_shop;

import java.util.Scanner;

public class OnlinePizzaShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, choose, what pizza would you like ? ");
        System.out.println(" Number 1 - pizza Margherita, Number 2 - pizza Hawai, Number 3 - pizza Salami");
        int i = scanner.nextInt();
        Pizza Margherita = new Margherita("dough", "mozzarella", "pomodori", "sugo di pomodori");
        Pizza Hawai = new Hawai("dough", "ananas", "ham", "cheese");
        Pizza Salami = new Salami("dough", "salami", "cheese1","sugo di pomodoro");
        Pizza[] pizzas = {Margherita, Hawai, Salami};
        switch (i) {
            case 1:
                System.out.println("Thank you! Your choice is " + Margherita);
                System.out.println(Margherita.prepare());
                System.out.println(Margherita.bake());
                System.out.println(Margherita.pack());
                break;
            case 2:
                System.out.println("Thank you! Your choice is " + Hawai);
                System.out.println(Hawai.prepare());
                System.out.println(Hawai.bake());
                System.out.println(Hawai.pack());
                break;
            case 3: System.out.println ("Thank you! Your choice is " + Salami);
                System.out.println(Salami.prepare());
                System.out.println(Salami.bake());
                System.out.println(Salami.pack());
            break;
            default:
                System.out.println("Please choose the number: 1,2 or 3");

        }

      /*  for (Pizza piz : pizzas) {
            if (scanner.equals(1)) {
                System.out.println(Margherita.prepare());
            }
            if (scanner.equals(2)) {
                System.out.println(Hawai.prepare());
            }
        }
    */
    }
}





