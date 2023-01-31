public abstract class Transportation {
    protected String company;
    protected int id;
    protected String departDate;
    protected String departTime;
    protected String arrivalTime;
    /**
     * Constructor that assigns vlaues to fields based on parameter if it is valid.
     * @param company a name of company
     * @param id an id of user
     * @param departDate the date of departing
     * @param departTime the time of departing
     * @param arrivalTime the time of arriving
     */
    public Transportation(String company, int id, String departDate, String departTime, String arrivalTime) {
        int check = String.valueOf(id).length();
        if (check != 5 || id < 0) {
            throw new IllegalArgumentException("Check your ID again");
        } else {
            this.id = id;
        }
        if (company == null || company.equals("") || departDate == null || departDate.equals("")) {
            throw new IllegalArgumentException("Invalid department information detected");
        } else {
            this.company = company;
            this.departDate = departDate;
        }
        if (departTime == null || departTime.equals("") || arrivalTime == null || arrivalTime.equals("")) {
            throw new IllegalArgumentException("Invalid time information detected");
        } else {
            this.departTime = departTime;
            this.arrivalTime = arrivalTime;
        }
    }
    /**
     * gives string that includes summary of this class.
     * @return the summary of this class.
     */
    public String toString() {
        String convert = Integer.toString(this.id);
        return this.company + "," + convert + "," + this.departDate + "," + this.departTime + "," + this.arrivalTime;
    }
    /**
     * compares the input object value and return if it is equals.
     * @param obj the input object that will be compared.
     * @return if the input object is equal to this object.
     */
    public boolean equals(Object obj) {
        if (obj != null & obj instanceof Transportation) {
            Transportation marta = (Transportation) obj;
            if (company == marta.getCompany() && id == marta.getId() && departDate == marta.getDepartDate()) {
                if (departTime == marta.getDepartTime() && arrivalTime == getArrivalTime()) {
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * getter of company.
     * @return company.
     */
    public String getCompany() {
        return this.company;
    }
    /**
     * getter of id.
     * @return id.
     */
    public int getId() {
        return this.id;
    }
    /**
     * getter of departDate.
     * @return departDate.
     */
    public String getDepartDate() {
        return this.departDate;
    }
    /**
     * getter of departTime.
     * @return departTime.
     */
    public String getDepartTime() {
        return this.departTime;
    }
    /**
     * getter of arrivalTime.
     * @return arrivalTime.
     */
    public String getArrivalTime() {
        return this.arrivalTime;
    }
}