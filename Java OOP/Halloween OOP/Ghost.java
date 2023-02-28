/**
 * @author Wonho Lim
 * @version 11.0.12
 * Description: This is a child class of TrickOrTreater
 * This has unique method spook, which prints how much ghost is spooky.
 */
public class Ghost extends TrickOrTreater {
    private int transparency;
    /**
     * Constructor that assigns vlaues to fields based on parameter.
     * @param newName the name for witch
     * @param newNeighborhood the name of neighborhood that witch is in
     * @param newCandy the amount of candy that witch has
     * @param newTransparency how transparent the ghost is
     */
    public Ghost(String newName, String newNeighborhood, int newCandy, int newTransparency) {
        setName(newName);
        setNeighborhood(newNeighborhood);
        setNumCandy(newCandy);
        setTransparency(newTransparency);
    }
    /**
     * Constructor that assigns vlaues to fields based on parameter and inserts desgined values for others.
     * @param newTransparency how transparent the ghost is
     */
    public Ghost(int newTransparency) {
        this("Agnes", "Halloweentown", 0, newTransparency);
    }
    /**
     * Constructor that assgins fields from other witch object to new object.
     * @param other other ghost that the constructor will copy to assign values for new ghost
     */
    public Ghost(Ghost other) {
        setName(other.getName());
        setNeighborhood(other.getNeighborhood());
        setNumCandy(other.getNumCandy());
        setTransparency(other.getTransparency());
    }
    /**
     * prints out how spooky the ghost is based on transparency.
     */
    public void spook() {
        if (transparency >= 10) {
            System.out.println("Very Spooky");
        } else if (3 <= transparency && transparency <= 9) {
            System.out.println("Boo!");
        } else {
            System.out.println("Not very spooky");
        }
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
     * setter of transparency.
     * @param transparentSet how transparent ghost is
     */
    public void setTransparency(int transparentSet) {
        transparency = transparentSet;
    }
    /**
     * getter of name.
     * @return nameSet a name of ghost
     */
    public String getName() {
        return name;
    }
    /**
     * getter of neighborhood.
     * @return nameSet a neighbor of ghost
     */
    public String getNeighborhood() {
        return neighborhood;
    }
    /**
     * getter of numCnady.
     * @return numCandy a number of candy of ghost
     */
    public int getNumCandy() {
        return numCandy;
    }
    /**
     * getter of transparency.
     * @return transparency how transparent the ghost is
     */
    public int getTransparency() {
        return transparency;
    }
}