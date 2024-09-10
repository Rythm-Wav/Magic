import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String Reply;
        int RandomInt;
        System.out.println("Wizard101");


        System.out.println("On a normal day in Cosmodeus, the great bard Saltine of the renowned house Flaur, was foraging for berries.\n" +
                " Saltine had been out for about 3 days now on a journey through the Woods of the Broken Trees to find a rather peculiar object.\n" +
                "This object had been sought after and searched for since the days when Saltine's great great great great great great...(you get it) Grandpa was the great Bard of Cosomodeus.\n" +
                "No bard had ever been successful in finding it before and it was said to have a mind of its own... The object in question was named the Two-Chord.\n" +
                "Its original owner is unknown, but left a note stating they hid it deep in the forest because of its absolute destructive power. If it fell into the wrong hands, the damage could be catastrophic.\n" +
                "Though it lacks the tonal flexibility of any normal harp, the two chords it plays can be manipulated with the user's own magic power and musical prowess to create effects never fathomed before.\n" +
                "It has also been said that the guards of the Two-Chord, an ancient orc and wizard, were personally hired by its creator and have unimaginable strength...\n" +
                "While foraging, Saltine recaps the tales in her head... everything from how the orc charged at intruders... to what berries it likes...\n" +
                "to how the orc is charging at Saltine with a handful of blueberries right now!!\n\n" +
                "The ancient guard of the Two-Chord, Golgoroth, charges at Saltine with immense speed! ");


        Weapons instrument = new Weapons("instrument", 20, 15);
        Weapons club = new Weapons("club", 20, 0);
        Weapons staff = new Weapons("staff", 20, 0);

        Bard Saltine = new Bard(instrument, 10, 100, 100);

        Orc Golgoroth = new Orc(club, 10, 100, 100);

        Wizard Gandal = new Wizard(staff, 10, 100, 100);

        Scanner key = new Scanner(System.in);

        while (Saltine.hp != 0) {
            System.out.println("To use the evade spell type 1\n" +
                    "To use the block spell type 2");
            Reply = key.nextLine();

            if (Reply.equals("1")) {
                RandomInt = (int) (Math.random() * 2);
                if (RandomInt == 0) {
                    Saltine.evade();
                    System.out.println("Saltine evades and is unscathed!");
                } else {
                    Golgoroth.charge(Saltine);
                    System.out.println("Salitne is blown back by the seemingly unstoppable force!\n She takes 20 damage...");
                }

            }

            System.out.println("Saltine stabilizes and prepares for an attack!");
            System.out.println("To use the attack spell type 1\n " +
                    "To use the healing spell type 2");
            Reply = key.nextLine();

            if (Reply.equals("1")) {
                Saltine.sing1(Golgoroth);
                System.out.println("Saltine sings a song of fervor!\n Orc takes 35 damage.*");
            }
            if (Reply.equals("2")) {
                Saltine.sing2();
                System.out.println("Saltine sings a song of recovery!\n *Saltine gains 10 hp");
            }

            System.out.println("The orc raises its Giant club and prepares for a critical strike!\n To use the block spell press 1\n To use the counter-magic spell press 2");

            Reply = key.nextLine();
            if (Reply.equals("1")) {
                Saltine.block2();
                System.out.println("Saltine attempts to block the Orc's club!\n Saltine takes 50 damage.*");
            } else {
                Saltine.counterMagic(Golgoroth);
                System.out.println("Saltine parries the attack, and strikes back twice as hard!\n The Orc is now weakened...\n To attack, press 1\nTo persuade the Orc, press 2");
            }

            Reply = key.nextLine();
            if (Reply.equals("1")) {
                Saltine.sing1(Golgoroth);
                System.out.println("Saltine deals the fatal blow to the orc with her song of fervor!");
                System.out.println("""
                        After defeating the Orc, Saltine finds a map with the location of the Two-Chord and its other guardian on it.\s
                        She embarks on the journey and eventually reaches the monolithic chambers where the Two-Chord is held.
                        Seemingly from thin air, a wizard appears, waving a wand
                         adorned with charms and talismans, presumably accrued over centuries.""");
                System.out.println("""
                        The wizard conjures an immense boulder and sends it hurling at the Saltine!
                        
                        To use the evade spell, press 1.
                        To use the block spell, press 2\s""");

                Reply = key.nextLine();
                if(Reply.equals("1")) {
                    Saltine.evade();
                    System.out.println("Saltine narrowly evades the boulder and prepares for a counterattack. \n" +
                            "To use the attack spell, press 1.\n" +
                            "To use the countermagic spell, press 2.");
                }else{
                    Saltine.block();
                    System.out.println("Saltine blocks the attack and takes 7 damage. After recovering saltine prepares for a counterattack.");
                }
                Reply = key.nextLine();
                if(Reply.equals("1")) {
                    Saltine.sing1(Gandal);
                    System.out.println("Saltine sings a song of fervor! Gandal takes 35 damage");
                }
                if (Reply.equals("2")) {
                    RandomInt = (int) (Math.random() * 2);
                    if (RandomInt == 0) {
                        Saltine.counterMagic(Gandal);
                        System.out.println("Saltine channels immense amounts of magic and deals a fatal blow to the wizard.\n" +
                                "The Two-Chord is now ripe for the taking. Saltine walks into the hollow chambers and is overwhelmed\n" +
                                "by the almost unbelievable magic power emanating from the lone harp.\n" +
                                "After taking the Two-Chord back to Cosmodeus, Saltine is treated like a ruler, especially as she was\n" +
                                "overthrown... ");

                }
            }

            else{
                System.out.println("Saltine persuades the weakened Orc and he joins her party!");

            }

            System.out.println("""
                    Saltine heals the orc and after they settle their differences in conversation,
                    \s
                    the Orc agrees to assist Saltine in her adventure. He tells her of the second guard, deeper in the forest near where the ancient weapon is held...
                    After a rather treacherous journey, Saltine and Golgoroth reach the monolithic chambers where the Two-Chord is held.
                    Seemingly from thin air, a wizard appears, waving a wand adorned with charms and talismans, presumably\s
                    accrued over centuries.""");
            System.out.println("""
                    The wizard conjures an immense boulder and sends it hurling at the party!
                    
                    To use the evade spell, press 1.
                    To use the block spell, press 2\s""");

                Reply = key.nextLine();
                if (Reply.equals("1")) {
                    RandomInt = (int) (Math.random() * 2);
                    if (RandomInt == 0) {
                        Saltine.evade();
                        System.out.println("""
                                The party narrowly evades the boulder!
                                
                                Golgoroth makes a gesture to Saltine to cover her ears and she does so with magic.
                                The orc then claps his hands with a deafening bang, stunning the wizard.
                                """);
                    }
                }
                        System.out.println("During this downtime, Saltine analyzed the wizards spell and figured out\n" +
                                "how to use it!\n" +
                                "To use the copy spell and weaken Gandal, press 1!");
                        if(Reply.equals("1")){
                            Saltine.copy(Gandal);

                            System.out.println("Saltine and the Orc have weakened Gandal!\n" +
                                    "As Saltine is about to take the final blow, Golgoroth steps in front of her and\n" +
                                    "tells her to stop. He turns around and says...This is not the Miyagido way, Saltine.\n" +
                                    "He tells the wizard about her and he understands her mission. They all go into the chambers\n " +
                                    "Together and blow the Two-Chord up in the woods, deforesting the entire nation. Then they live happily every after...\n" +
                                    "Or did they....?");

                        }




            }
        }}}