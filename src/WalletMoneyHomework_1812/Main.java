package WalletMoneyHomework_1812;

import agregation.Book;
import agregation.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Money money = new Money("120", "450");
        Money money1 = new Money("300", "150");
        Money money2 = new Money("600", "1200");

        Wallet wallet = new Wallet("Peter", money);
        Wallet wallet1 = new Wallet("John", money1);
        Wallet wallet2 = new Wallet("Mike", money2);

        Wallet[] Wallet = {wallet, wallet1, wallet2};

        System.out.println(wallet.name + " has in : " + wallet);
        System.out.println(wallet1.name + " has in : " + wallet1);
        System.out.println(wallet2.name + " has in : " + wallet2);


        Money[] Money = {money, money1, money2};
        for (Money m : Money) {
            System.out.println(wallet.name + " has in his wallet: " + money.usd + " usd " + money.euro + " euro");
            System.out.println(wallet1.name + " has in his wallet: " + money1.usd + " usd " + money1.euro + " euro");
            System.out.println(wallet2.name + " has in his wallet: " + money2.usd + " usd " + money1.euro + " euro");
        }
    }
}
