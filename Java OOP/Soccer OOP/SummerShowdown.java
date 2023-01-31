public class SummerShowdown extends Tournament {
    private String backupReferee;
    /**
     * Constructor that assigns vlaues to fields based on parameter and designed values.
     * @param teamCount the number of teams in the tournament.
     * @param ko show if it has knock-out round or not
     * @param finalRef the final referee of the match.
     * @param maxCap the maximum capacity of the match.
     * @param backupRef the name of back-up refree.
     */
    public SummerShowdown(int teamCount, boolean ko, String finalRef, int maxCap, String backupRef) {
        super("Summer Showdown", teamCount, ko, finalRef, maxCap);
        backupReferee = backupRef;
    }
    /**
     * Constructor that assigns vlaues to fields based on parameter and designed values.
     * @param finalRef the final referee of the match.
     * @param backupRef the name of back-up refree.
     */
    public SummerShowdown(String finalRef, String backupRef) {
        this(64, false, finalRef, 20000, backupRef);
    }
    /**
     * givves string that includes summary of this class.
     * @return total the summary of this class.
     */
    public String toString() {
        String comment1;
        String comment2;
        String comment3;
        String total;
        comment1 = "Name: " + this.getName() + ", Number of Teams: " + this.getNumTeams();
        comment2 = ", Final Referee: " + this.getFinalReferee();
        comment3 = ", Backup Referee: " + this.getBackUpReferee() + ", Maximum Capacity: " + this.getMaxCapacity();
        total = comment1 + comment2 + comment3;
        return total;
    }
    /**
     * returns if the object given as parameter is equal to this class.
     * @param obj object that will be examined
     * @return whether two objects are equal
     */
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof SummerShowdown) {
            SummerShowdown ss = (SummerShowdown) obj;
            return this.getFinalReferee() == ss.getFinalReferee() && this.getMaxCapacity() == ss.getMaxCapacity();
        }
        return false;
    }
    /**
     * assigns new refree to match if it is needed.
     * @param ref the name of new refree
     */
    public void refereeHire(String ref) {
        if (this.getFinalReferee().equals(ref)) {
            System.out.println("We need a new referee! " + this.backupReferee + " is already refereeing the final!");
            this.backupReferee = "Undecided";
        } else if (this.getBackUpReferee().equals(ref)) {
            System.out.println("Be ready for some conflicts!");
            this.setMaxCapacity(this.getMaxCapacity() / 2);
        } else {
            System.out.println("Ready to play!");
        }
    }
    /**
     * setter of backupReferee.
     * @param newBr new backup referee of the match
     */
    public void setBackUpReferee(String newBr) {
        this.backupReferee = newBr;
    }
    /**
     * getter of backupReferee.
     * @return backupReferee the backup referee of the game
     */
    public String getBackUpReferee() {
        return backupReferee;
    }
}