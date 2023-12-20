package WalletMoneyHomework_1812;

import agregation.Book;

public class Wallet {
    protected String name;
    Money money;
    public String getName() {
        return name;
    }
    //private Wallet[] Wallet;

    public Wallet ( String name, Money money) {
        this.name = name;
       this.money = money;
    }




    @Override
    public String toString() {
        return "Wallet{" +
                "money=" + money +
                ", name='" + name + '\'' +
                '}';
    }
}
