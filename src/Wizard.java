public class Wizard extends Characters {
    Weapons staff;
    int money;
    int mana;


    //2 constructors
    public Wizard(Weapons staff, int money, int mana, int hp)
    {
        super( money, mana,hp);
        this.staff = staff;
        this. mana = mana;
        this.money =  money;
    }

    //3 getters and setters

    public void setstaff(Weapons staff)
    {
        this.staff = staff;

    }
    public void setMana(int mana)
    {
        this.mana = mana;

    }
    public void setMoney(int money)
    {
        this.money = money;

    }
    public Weapons setstaff()
    {
        return staff;
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
    public void hugerockspell(Characters Enemy)
    {
        Enemy.hp -=50;

    }
    public void Fireball() {
        hp -= 40;
        //to String
    }
    public String toString()
    {
        String output = "staff" + staff +
                "\nMoney" + money +
                "\nMana" + mana;
        return output;
    }
}

