/**
 * @author Wonho Lim
 * @version 11.0.12
 * Description: This is a tester class for trickortreater and its subclasses.
 */
public class HappyHalloween {
    /**
     * main method that operates trickortreater and its subclasses in various ways.
     * @param args sets of arguments in main method
     */
    public static void main(String[] args) {
        Ghost ghost1 = new Ghost("Wonho", "Yongin", 3, 10);
        Ghost ghost2 = new Ghost(2);
        Ghost ghost3 = new Ghost(ghost2);
        ghost1.spook();
        ghost2.spook();
        ghost3.spook();
        BlackCat cat1 = new BlackCat("cat1", true);
        cat1.meow();
        BlackCat cat2 = new BlackCat("cat2", false);
        cat2.meow();
        Witch witch1 = new Witch("terran", "go", cat1);
        Witch witch2 = new Witch(witch1);
        Witch witch3 = new Witch("protoss", "space", 3, "my life", cat1);
        witch1.castSpell();
        witch2.castSpell();
        witch3.castSpell();
        witch3.castSpell();
        ghost1.seekCandy(1);
        ghost2.seekCandy(2);
        witch1.seekCandy(3);
        witch2.seekCandy(4);
        cat1.seekCandy(5);
        cat2.seekCandy(6);
        int total1 = 0;
        int total2 = 0;
        total1 = ghost1.getTotalCandy() + witch1.getTotalCandy() + cat1.getTotalCandy();
        total2 = ghost2.getTotalCandy() + witch2.getTotalCandy() + cat2.getTotalCandy();
        System.out.println(total1 + total2);
    }
}