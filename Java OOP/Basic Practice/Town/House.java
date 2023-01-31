public class House {
    private String address;
    private int yearBuilt;
    private double numBaths;
    private boolean isRenovated;
    public House(String addressInput, int year, double bathInput, boolean renovation) {
        this.address = addressInput;
        this.yearBuilt = year;
        this.numBaths = bathInput;
        this.isRenovated = renovation;
    }
    public House(String addressInput, double bathInput) {
        this(addressInput, 1984, bathInput, false);
    }
    public House() {
        this("North Ave NW, Atlanta, GA 30332", 1);
    }
    public void setAddress(String addAddress) {
        this.address = addAddress;
    }
    public void setYearBuilt(int addYear) {
        if (addYear >= 0) {
            this.yearBuilt = addYear;
        }
    }
    public void setNumBaths(double addBaths) {
        if (addBaths >= 0 && addBaths % 0.5 == 0) {
            this.numBaths = addBaths;
        }
    }
    public void setIsRenovated(boolean addRenovated) {
        this.isRenovated = addRenovated;
    }
    public String getAddress() {
        return address;
    }
    public int getYearBuilt() {
        return yearBuilt;
    }
    public double getNumBaths() {
        return numBaths;
    }
    public boolean getIsRenovated() {
        return isRenovated;
    }
}