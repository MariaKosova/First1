package pizza_shop;

public class Margherita extends Pizza {
    private String mozzarella;
    private String pomodori;
    private String sugoDiPomodoro;


    public Margherita(String getDough, String mozzarella, String pomodori, String sugoDiPomodoro) {
        super(getDough);
        this.mozzarella = mozzarella;
        this.pomodori = pomodori;
        this.sugoDiPomodoro =sugoDiPomodoro;
    }
    public String getMozzarella () {
        return mozzarella;
    }
    public String getPomodori(){
        return pomodori;
    }
    public String getSugoDiPomodoro(){
        return sugoDiPomodoro;
    }

    @Override
    public String toString() {
        return "Margherita{" +
                "mozzarella='" + mozzarella + '\'' +
                ", pomodori='" + pomodori + '\'' +
                ", sugoDiPomodoro='" + sugoDiPomodoro + '\'' +
                '}';
    }

    public String prepare(){
        return super.prepare() + getMozzarella() + ", " + getPomodori() + ", " + getSugoDiPomodoro();
    }
    public String bake (){
        return super.bake();
    }
    public String pack () {
       return super.pack();

    }



}

