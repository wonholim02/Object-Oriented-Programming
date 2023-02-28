/**
 * @author Wonho Lim
 * @version 11.0.12
 * Description: This is parent class of witch, black, and ghost classes.
 * This contains basic values like name, neighborhood, numCandy, and totalCandy
 */
public class TrickOrTreater {
    protected String name;
    protected String neighborhood;
    protected int numCandy;
    protected static int totalCandy = 0;
    /**
     * Constructor that assigns vlaues to fields based on parameter.
     * @param newName the name for trickortreater
     * @param newNeighborhood the name of neighborhood that trickortreater is in
     * @param newCandy the amount of candy that trickortreater has
     */
    public TrickOrTreater(String newName, String newNeighborhood, int newCandy) {
        setName(newName);
        setNeighborhood(newNeighborhood);
        setNumCandy(newCandy);
    }
    /**
     *Constructor without parameters - set desgined vlaues.
     */
    public TrickOrTreater() {
        this("Agnes", "Halloweentown", 0);
    }
    /**
     * update numCandy and totalCandy based on luck parameter * 3.
     * @param luck the amount of luck that trickortreater has
     */
    public void seekCandy(int luck) {
        numCandy += luck * 3;
        totalCandy += luck * 3;
    }
    /**
     * setter of name.
     * @param nameSet the new name for trickortreater
     */
    public void setName(String nameSet) {
        name = nameSet;
    }
    /**
     * setter of neighborhood.
     * @param neighborSet the new neighbor for trickortreater
     */
    public void setNeighborhood(String neighborSet) {
        neighborhood = neighborSet;
    }
    /**
     * setter of numCandy.
     * @param candySet the new amount of candy for trickortreater
     */
    public void setNumCandy(int candySet) {
        if (candySet > numCandy) {
            numCandy = candySet;
            totalCandy = totalCandy + candySet;
        }
    }
    /**
     * setter of totalCandy.
     * @param totalSet the new amount of total candies
     */
    public static void setTotalCandy(int totalSet) {
        if (totalSet > totalCandy) {
            totalCandy = totalSet;
        }
    }
    /**
     * getter of name.
     * @return nameSet a name of trickortreater
     */
    public String getName() {
        return name;
    }
    /**
     * getter of neighborhood.
     * @return nameSet a neighbor of trickortreater
     */
    public String getNeighborhood() {
        return neighborhood;
    }
    /**
     * getter of numCnady.
     * @return numCandy a number of candy of trickortreater
     */
    public int getNumCandy() {
        return numCandy;
    }
    /**
     * getter of totalCandy.
     * @return totalCandy a total number of candy of trickortreater
     */
    public static int getTotalCandy() {
        return totalCandy;
    }
}