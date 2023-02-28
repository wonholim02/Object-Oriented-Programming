public class Neighborhood {
    private int numHouses;
    private House[] houses;
    public Neighborhood(House[] newHouse) {
        this.houses = newHouse;
        for (int i = 0; i < newHouse.length; i++) {
            if (this.houses[i] == null) {
                break;
            }
            this.numHouses++;
        }
    }
    public Neighborhood() {
        this(new House[5]);
    }
    public void displayNewHouses(int year) {
        String has = "";
        for (int i = 0; i < numHouses; i++) {
            if (houses[i] != null && houses[i].getYearBuilt() >= year) {
                if (houses[i].getIsRenovated()) {
                    has = "has";
                } else {
                    has = "has not";
                }
                System.out.print("House located at " + houses[i].getAddress());
                System.out.print(" was built in " + houses[i].getYearBuilt());
                System.out.print(", has " + houses[i].getNumBaths() + " number of bathrooms, and ");
                System.out.println(has + " been renovated ecently.");
            }
        }
    }
    public House addHouse(int location1, House newHouse) {
        if (location1 >= 0 && location1 < houses.length) {
            House added = houses[location1];
            houses[location1] = newHouse;
            if (added == null) {
                this.numHouses++;
            }
            return added;
        } else {
            return null;
        }
    }
    public House removeHouse(int location2) {
        if (location2 >= 0 && location2 < houses.length) {
            House removed = houses[location2];
            houses[location2] = null;
            if (removed == null) {
                this.numHouses--;
            }
            return removed;
        } else {
            return null;
        }
    }
    public boolean isFull() {
        for (int i = 0; i < this.houses.length; i++) {
            if (houses[i] == null) {
                return false;
            }
        }
        return true;
    }
}