package WalletMoneyHomework_1812;

public class Money {
    String usd;
    String euro;
public Money (String usd, String euro) {
    this.usd = usd;
    this.euro = euro;
}


    @Override
    public String toString() {
        return "Money{" +
                "usd='" + usd + '\'' +
                ", euro='" + euro + '\'' +
                '}';
    }
}
