import java.util.ArrayList;
public class Zoo {
    private ArrayList<String> allowedTypes;
    private ArrayList<String> noisyAnimals;
    /**
     * Constructor that assigns vlaues to fields based on parameter.
     * @param allowedTypes array list of types that will be allowed
     * @param noisyAnimals array list of  noisy animals
     */
    public Zoo(ArrayList<String> allowedTypes, ArrayList<String> noisyAnimals) {
        this.allowedTypes = allowedTypes;
        this.noisyAnimals = noisyAnimals;
    }
    /**
     * checks types of animals provided.
     * @param animals the list of animals provided
     */
    public void checkTypesOfAnimals(String[] animals) throws AnimalNotAllowedException {
        String kind = "";
        boolean check = false;
        for (int i = 0; i < animals.length; i++) {
            if (!allowedTypes.contains(animals[i])) {
                throw new AnimalNotAllowedException("A " + animals[i] + " is not allowed at the zoo!");
            }
        }
    }
    /**
     * check if the animals in the array are noisy.
     * @param animals the list of animals provided
     * @return if animals are noisy or not
     */
    public boolean checkIfNoisy(String[] animals) {
        int count = 0;
        for (int i = 0; i < animals.length; i++) {
            for (int j = 0; j < noisyAnimals.size(); j++) {
                if (animals[i].equals(noisyAnimals.get(j))) {
                    count++;
                }
            }
        }
        if (count > 6) {
            return true;
        }
        return false;
    }
    /**
     * creates quiet exhibit based on animals array.
     * @param animals the list of animals provided
     * @return the list of animals for quiet exhibition.
     */
    public ArrayList<String> createQuietExhibit(String[] animals) {
        ArrayList<String> quietExhibit = new ArrayList<String>();
        if  (checkIfNoisy(animals)) {
            throw new NoisyExhibitException();
        }
        for (int i = 0; i < animals.length; i++) {
            if (!noisyAnimals.contains(animals[i])) {
                quietExhibit.add(animals[i]);
            }
        }
        return quietExhibit;
    }
    /**
     * operates zoo.
     * @param args string argument array.
     */
    public static void main(String[] args) {
        ArrayList<String> allow = new ArrayList<String>();
        allow.add("Hippo");
        allow.add("Zebra");
        allow.add("Elephant");
        allow.add("Frog");
        ArrayList<String> noisy = new ArrayList<String>();
        noisy.add("Elephant");
        noisy.add("Frog");
        Zoo park = new Zoo(allow, noisy);
        String[] list = {"Hippo", "Zebra"};
        String[] listx = {"Frog", "Dog"};
        try {
            park.checkTypesOfAnimals(listx);
            System.out.println(park.createQuietExhibit(listx));
        } catch (AnimalNotAllowedException anae) {
            anae = new AnimalNotAllowedException("This animal is not allowed");
            System.out.println(anae.getMessage());
        } catch (NoisyExhibitException nee) {
            nee = new NoisyExhibitException();
            System.out.println(nee.getMessage());
        } finally {
            System.out.println("Checked the zoo animals!");
        }
        ArrayList<String> allow2 = new ArrayList<String>();
        allow2.add("Dog");
        allow2.add("Cat");
        allow2.add("Bat");
        allow2.add("Frog");
        allow2.add("Mouse");
        allow2.add("Elephant");
        allow2.add("Hippo");
        ArrayList<String> noisy2 = new ArrayList<String>();
        noisy2.add("Dog");
        noisy2.add("Cat");
        noisy2.add("Bat");
        noisy2.add("Frog");
        noisy2.add("Mouse");
        noisy2.add("Elephant");
        noisy2.add("Hippo");
        String[] list2 = {"Dog", "Cat", "Bat", "Frog", "Mouse", "Elephant", "Hippo"};
        Zoo park2 = new Zoo(allow2, noisy2);
        try {
            park2.checkTypesOfAnimals(list2);
            System.out.println(park2.createQuietExhibit(list2));
        } catch (AnimalNotAllowedException anae) {
            anae = new AnimalNotAllowedException("This animal is not allowed");
            System.out.println(anae.getMessage());
        } catch (NoisyExhibitException nee) {
            nee = new NoisyExhibitException();
            System.out.println(nee.getMessage());
        } finally {
            System.out.println("Checked the zoo animals!");
        }
    }
}