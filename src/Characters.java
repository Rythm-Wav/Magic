public class Characters {

    int money;
    int mana;
    int hp;

    public Characters(int money, int mana, int hp)

    {
        this.money = money;
        this.mana = mana;
        this.hp = hp;
    }

    public void setMoney(int money)
    {
        this.money = money;


    }
    public void setMana(int mana)
    {

        this.mana = mana;
    }
    public void sethp(int hp)
    {

        this.hp = hp;
    }
    public int setmoney()
    {

        return money;
    }
    public int setmana()
    {

        return mana;
    }
    public int sethp()
    {

        return hp;
    }
    public String toString()
    {
        String output = "money" + money +
                        "\nmana" + money +
                        "\nhp" + hp;
        return output;
    }
}