/**
 * @author Wonho Lim
 * @version 11.0.12
 * Description: This is a child class of TrickOrTreater.
 * This has unique method meow, which prints whether the cat is familar or not.
 */
public class BlackCat extends TrickOrTreater {
    private String name;
    private boolean familiar;
    /**
     * Constructor that assigns vlaues to fields based on parameter.
     * @param newName the name for witch
     * @param friend how familiar blackcat is
     */
    public BlackCat(String newName, boolean friend) {
        name = newName;
        familiar = friend;
    }
    /**
     *method that prints out if the cat is familiar or not.
     */
    public void meow() {
        if (familiar) {
            System.out.println(name + " is familiar");
        } else {
            System.out.println(name + " is not familiar");
        }
    }
    /**
     * setter of name.
     * @param nameSet the new name for blackcat
     */
    public void setName(String nameSet) {
        name = nameSet;
    }
    /**
     * setter of familiar.
     * @param familiarSet the new familiarity for blackcat
     */
    public void setFamiliar(boolean familiarSet) {
        familiar = familiarSet;
    }
    /**
     * getter of name.
     * @return name a name of blackcat
     */
    public String getName() {
        return name;
    }
    /**
     * getter of familiar.
     * @return familiar how familiar the blackcat is
     */
    public boolean getFamiliar() {
        return familiar;
    }
}