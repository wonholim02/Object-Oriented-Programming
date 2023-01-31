public class Flight extends Transportation {
    private int connectors;
    /**
     * Constructor that assigns vlaues to fields based on parameter if it is valid.
     * @param company a name of company
     * @param id an id of user
     * @param departDate the date of departing
     * @param departTime the time of departing
     * @param arrivalTime the time of arriving
     * @param connectors the connector that user will use
     */
    public Flight(String company, int id, String departDate, String departTime, String arrivalTime, int connectors) {
        super(company, id, departDate, departTime, arrivalTime);
        if (connectors < 0) {
            throw new IllegalArgumentException("Check your connector");
        } else {
            this.connectors = connectors;
        }
    }
    /**
     * gives string that includes summary of this class.
     * @return the summary of this class.
     */
    public String toString() {
        String part = super.toString();
        return "Flight," + part +  "," + connectors;
    }
    /**
     * compares the input object value and return if it is equals.
     * @param obj the input object that will be compared.
     * @return if the input object is equal to this object.
     */
    public boolean equals(Object obj) {
        super.equals(obj);
        if (obj != null & obj instanceof Flight) {
            Flight plane = (Flight) obj;
            if (this.connectors == plane.getConnectors()) {
                return true;
            }
        }
        return false;
    }
    /**
     * getter of connectors.
     * @return connectors.
     */
    public int getConnectors() {
        return this.connectors;
    }
}