public class Bard extends Characters {
    //1 instance variables
    Weapons instrument;
    int money;
    int mana; //currently has

    //2 constructors
    public Bard(Weapons instrument, int money, int mana, int hp) {
        super(money, mana, hp);
        this.instrument = instrument;
        this.mana = mana;
        this.money = money;

    }

    //3 getters and setters

    public void setInstrument(Weapons instrument) {
        this.instrument = instrument;

    }

    public void setMana(int mana) {
        this.mana = mana;

    }

    public void setMoney(int money) {
        this.money = money;

    }

    public Weapons setInstrument() {
        return instrument;
    }

    public int setMoney() {
        return money;
    }

    public int setMana() {
        return mana;
    }

    //Brain methods
    public void sing1(Characters Enemy) {
        Enemy.hp -= 35;

    }

    public void sing2() {
        hp += 10;

    }

    public void evade() {

    }

    public void block() {
        hp -= 7;
    }

    public void counterMagic(Characters Enemy) {
        Enemy.hp -= 60;
    }

    public void block2() {
        hp -= 50;
    }

    public void block3()
    {
        hp -= 30;
    }
    public void copy(Characters Enemy){
        Enemy.hp -= 99;
    }
    //to String

    public String toString()
    {
        String output = "Instrument" + instrument +
                        "\nMoney" + money +
                        "\nMana" + mana;
        return output;
    }
}
