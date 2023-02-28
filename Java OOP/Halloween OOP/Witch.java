/**
 * @author Wonho Lim
 * @version 11.0.12
 * Description: This is a child class of TrickOrTreater.
 * his has unique method castspell, which prints unique spell based on field.
 */
public class Witch extends TrickOrTreater {
    private String signatureSpell;
    private BlackCat companion;
    /**
     * Constructor that assigns vlaues to fields based on parameter.
     * @param newName the name for witch
     * @param newNeighborhood the name of neighborhood that witch is in
     * @param newCandy the amount of candy that witch has
     * @param newSpell the unique spell that witch has
     * @param newCat the comapnion blackCat that witch has
     */
    public Witch(String newName, String newNeighborhood, int newCandy, String newSpell, BlackCat newCat) {
        setName(newName);
        setNeighborhood(newNeighborhood);
        setNumCandy(newCandy);
        signatureSpell = newSpell;
        companion = newCat;
    }
    /**
     * Constructor that assigns vlaues to fields based on parameter and inserts desgined values for others.
     * @param newName the name for witch
     * @param newSpell the unique spell that witch has
     * @param newCat the comapnion blackCat that witch has
     */
    public Witch(String newName, String newSpell, BlackCat newCat) {
        this(newName, "Godric's Hollow", 13, newSpell, newCat);
    }
    /**
     * //Constructor that assgins fields from other witch object to new object.
     * @param other other witch that the constructor will copy to assign values for new witch
     */
    public Witch(Witch other) {
        setName(other.getName());
        setNeighborhood(other.getNeighborhood());
        setNumCandy(other.getNumCandy());
        setSignatureSpell(other.getSignatureSpell());
        setCompanion(other.getCompanion());
    }
    /**
     * prints signatureSpell and multiplies numCandy by two - totalCandy is also updated.
     */
    public void castSpell() {
        System.out.printf("%s casts %s!\n", name, signatureSpell);
        totalCandy = totalCandy - numCandy;
        numCandy = numCandy * 2;
        totalCandy = totalCandy + numCandy;
    }
    /**
     * setter of name.
     * @param nameSet the new name for witch
     */
    public void setName(String nameSet) {
        name = nameSet;
    }
    /**
     * setter of neighborhood.
     * @param neighborSet the new neighbor for witch
     */
    public void setNeighborhood(String neighborSet) {
        neighborhood = neighborSet;
    }
    /**
     * setter of numCandy.
     * @param candySet the new amount of candy for witch
     */
    public void setNumCandy(int candySet) {
        if (candySet > numCandy) {
            numCandy = candySet;
            totalCandy = totalCandy + candySet;
        }
    }
    /**
     * setter of signatureSpell.
     * @param spellSet the new spell for witch
     */
    public void setSignatureSpell(String spellSet) {
        signatureSpell = spellSet;
    }
    /**
     * setter of companion.
     * @param newPet the new companion black cat for witch
     */
    public void setCompanion(BlackCat newPet) {
        BlackCat pet = new BlackCat(newPet.getName(), newPet.getFamiliar());
        companion = pet;
    }
    /**
     * getter of name.
     * @return name the name of witch
     */
    public String getName() {
        return name;
    }
    /**
     * getter of neighborhood.
     * @return neighborhood the neighborhood that witch is in
     */
    public String getNeighborhood() {
        return neighborhood;
    }
    /**
     * getter of numCnady.
     * @return numCandy a number of candy of witch
     */
    public int getNumCandy() {
        return numCandy;
    }
    /**
     * getter of getSignatureSpell.
     * @return signatureSpell the unique spell that the witch has
     */
    public String getSignatureSpell() {
        return signatureSpell;
    }
    /**
     * getter of companion.
     * @return companion the companion black cat of the witch
     */
    public BlackCat getCompanion() {
        return companion;
    }
}