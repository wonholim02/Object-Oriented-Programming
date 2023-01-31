public abstract class Tournament {
    private String name;
    private int numTeams;
    private boolean knockout;
    private String finalReferee;
    protected int maxCapacity;
    private static final int FINAL_CAPACITY = 30000;
    /**
     * Constructor that assigns vlaues to fields based on parameter and designed values.
     * @param naming the name of the tournament
     * @param teamCount the number of teams in the tournament.
     * @param ko show if it has knock-out round or not
     * @param finalRef the final referee of the match.
     * @param maxCap the maximum capacity of the match.
     */
    public Tournament(String naming, int teamCount, boolean ko, String finalRef, int maxCap) {
        name = naming;
        if (teamCount % 2 != 0) {
            numTeams = 16;
        } else {
            numTeams = teamCount;
        }
        knockout = ko;
        if (this.numTeams > 64 && !ko) {
            this.knockout = true;
        } else {
            knockout = ko;
        }
        finalReferee = finalRef;
        maxCapacity = maxCap;
    }
    /**
     * givves string that includes summary of this class.
     * @return total the summary of this class.
     */
    public String toString() {
        String is;
        String comment1;
        String comment2;
        String total;
        if (knockout) {
            is = "is";
        } else {
            is = "isn't";
        }
        comment1 = "Name: " + name + ", Number of Teams: " + numTeams + ", KO: this " + is + " a KO ";
        comment2 = "tournament, Final Referee: " + finalReferee + ", Maximum Capacity: " + maxCapacity;
        total = comment1 + comment2;
        return total;
    }
    /**
     * returns if the object given as parameter is equal to this class.
     * @param obj object that will be examined
     * @return whether two objects are equal
     */
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Tournament) {
            Tournament tn = (Tournament) obj;
            if (getName() == tn.getName() && this.getKnockout() == tn.getKnockout()) {
                if (this.getNumTeams() == tn.getNumTeams()) {
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * abstract method of refreeHire that assigns new refree to match.
     * @param ref the name of new refree
     */
    public abstract void refereeHire(String ref);
    /**
     * getter of name.
     * @return name the name of tournament
     */
    public String getName() {
        return name;
    }
    /**
     * getter of numTeams.
     * @return numTeams the number of teams
     */
    public int getNumTeams() {
        return numTeams;
    }
    /**
     * getter of knockout.
     * @return knockout whether the tournament is in knockout stage
     */
    public boolean getKnockout() {
        return knockout;
    }
    /**
     * getter of getFinalReferee.
     * @return finalReferee the referee of the final
     */
    public String getFinalReferee() {
        return finalReferee;
    }
    /**
     * getter of maxCapacity.
     * @return maxCapacity the maximum capcity of the stadium
     */
    public int getMaxCapacity() {
        return maxCapacity;
    }
    /**
     * getter of final capacity.
     * @return FINAL_CAPACITY the final capacity of the stadium
     */
    public int getFinalCapacity() {
        return FINAL_CAPACITY;
    }
    /**
     * setter of numTeams.
     * @param newNum the new number of teams
     */
    public void setNumTeams(int newNum) {
        numTeams = newNum;
    }
    /**
     * setter of maxCapacity.
     * @param newMax the new maximum capacity
     */
    public void setMaxCapacity(int newMax) {
        maxCapacity = newMax;
    }
    /**
     * setter of finalReferee.
     * @param newRef the new final Referee
     */
    public void setFinalReferee(String newRef) {
        finalReferee = newRef;
    }
}