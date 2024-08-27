import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String Reply;
        int RandomInt;
        System.out.println("Wizard101");


        System.out.println("The great bard Saltine has been ambushed by an Orc!");


        Weapons instrument = new Weapons("instrument", 20, 15);
        Weapons club = new Weapons("club", 20, 0);
        Weapons staff = new Weapons("staff", 20, 0);

        Bard Saltine = new Bard(instrument, 10, 100, 100);

        Orc Golgoroth = new Orc(club, 10, 100, 100);

        Wizard Gandal = new Wizard(staff, 10, 100, 100);

        Scanner key = new Scanner(System.in);


        System.out.println("The orc charges at Saltine with immense speed!\n" +
                "To use the evade skill type 1\n" +
                "To use the block skill type 2" );
        Reply = key.nextLine();
        int RandomInt = (int)(Math.random() * 2);
        
        if (Reply.equals("1")) {
            Saltine.evade();
            System.out.println("Saltine evades and is unscathed!");
            if (RandomInt == 0) {
                Saltine.evade();
            }
            else {
                Golgoroth.charge(Saltine);
            }
        }
        System.out.println("Saltine stabilizes and prepares for an attack!");
        if (Reply.equals("2"))
        {
            Saltine.block();
            System.out.println("Saltine blocks the attack!\n *Saltine takes 7 damage*");
        }
        System.out.println("To use the attack spell type 1\n " +
                "To use the healing spell type 2");
        Reply = key.nextLine();

        if (Reply.equals("1")) {
            Saltine.sing1(Golgoroth);
            System.out.println("Saltine sings a song of fervor!\n *Orc takes 35 damage.*");
        }
        if (Reply.equals("2")) {
            Saltine.sing2();
            System.out.println("Saltine sings a song of recovery!\n *Saltine gains 10 hp");
        }


    }
}
