public class Bus extends Transportation {
    private int stops;
    /**
     * Constructor that assigns vlaues to fields based on parameter if it is valid.
     * @param company a name of company
     * @param id an id of user
     * @param departDate the date of departing
     * @param departTime the time of departing
     * @param arrivalTime the time of arriving
     * @param stops the stops that user will use
     */
    public Bus(String company, int id, String departDate, String departTime, String arrivalTime, int stops) {
        super(company, id, departDate, departTime, arrivalTime);
        if (stops < 0) {
            throw new IllegalArgumentException("Check your stop");
        } else {
            this.stops = stops;
        }
    }
    /**
     * gives string that includes summary of this class.
     * @return the summary of this class.
     */
    public String toString() {
        String part = super.toString();
        return "Bus," + part + "," + stops;
    }
    /**
     * compares the input object value and return if it is equals.
     * @param obj the input object that will be compared.
     * @return if the input object is equal to this object.
     */
    public boolean equals(Object obj) {
        super.equals(obj);
        if (obj != null & obj instanceof Bus) {
            Bus stinger = (Bus) obj;
            if (this.stops == stinger.getStops()) {
                return true;
            }
        }
        return false;
    }
    /**
     * getter of stops.
     * @return stops.
     */
    public int getStops() {
        return this.stops;
    }
}