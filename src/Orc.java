public class Orc extends Characters {
    Weapons club;
    int money;
    int mana;


    //2 constructors
    public Orc(Weapons club, int money, int mana, int hp)
    {
        super(money, mana, hp);
        this.club = club;
        this. mana = mana;
        this.money =  money;
    }

    //3 getters and setters

    public void setclub(Weapons club)
    {
        this.club = club;

    }
    public void setMana(int mana)
    {
        this.mana = mana;

    }
    public void setMoney(int money)
    {
        this.money = money;

    }
    public Weapons setclub()
    {
        return club;
    }
    public int setMoney()
    {
        return money;
    }
    public int setMana()
    {
        return mana;
    }
    //Brain methods
    public void charge(Characters Enemy)
    {
        Enemy.hp -=20;

    }
    //to String

    public String toString()
    {
        String output = "club" + club +
                "\nMoney" + money +
                "\nMana" + mana;
        return output;
    }
}

