public class ConferenceLeague extends Tournament {
    private int teamsPerLeague;
    private String currentHolder;
    /**
     * Constructor that assigns vlaues to fields based on parameter and designed values.
     * @param finalRef the final refree of the match.
     * @param leagueTeam the number of teams in the league
     * @param holder the current holder of the trophy
     */
    public ConferenceLeague(String finalRef, int leagueTeam, String holder) {
        super("Conference League", 32, true, finalRef, 15000);
        teamsPerLeague = leagueTeam;
        currentHolder = holder;
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
        comment3 = ", Teams per League: " + this.getTeamsPerLeague() + ", Current Holder: " + this.getCurrentHolder();
        total = comment1 + comment2 + comment3;
        return total;
    }
    /**
     * returns if the object given as parameter is equal to this class.
     * @param obj object that will be examined
     * @return whether two objects are equal
     */
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof ConferenceLeague) {
            ConferenceLeague cl = (ConferenceLeague) obj;
            return this.getFinalReferee() == cl.getFinalReferee() && this.getCurrentHolder() == cl.getCurrentHolder();
        }
        return false;
    }
    /**
     * checks the number of team and proceed the league or set the final.
     */
    public void nextRound() {
        if (this.getKnockout()) {
            if (this.getNumTeams() > 2) {
                this.setNumTeams(this.getNumTeams() / 2);
            } else {
                System.out.println("We have reached the final!");
                if (this.getMaxCapacity() > this.getFinalCapacity()) {
                    this.setMaxCapacity(this.getFinalCapacity());
                }
            }
        }
    }
    /**
     * assigns new refree to match if it is needed.
     * @param ref the name of new refree
     */
    public void refereeHire(String ref) {
        if (this.getFinalReferee() == ref) {
            System.out.println("We need a new referee!");
            this.setFinalReferee("Undecided");
        } else {
            System.out.println("We're ready to go!");
            this.setMaxCapacity(this.getMaxCapacity() * 2);
        }
    }
    /**
     * getter of teamsPerLeague.
     * @return teamsPerLeague the number of teams in each league.
     */
    public int getTeamsPerLeague() {
        return teamsPerLeague;
    }
    /**
     * getter of currentHolder.
     * @return currentHolder the current title holder of the conference league.
     */
    public String getCurrentHolder() {
        return currentHolder;
    }
}