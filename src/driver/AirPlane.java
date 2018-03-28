package driver;

/**
 * Class for object of Airplane type, where is possible find all variables anf
 * methods about airplane
 *
 * @author Diogo Pessoa
 * @author Luana Andrade
 *
 */
public class AirPlane {

    private final String make; // final because we can't change after the isntance was created
    private final String model;
    private int capacity;
    private String category;
    private Pilot pilot;

    /**
     * Constructor Method
     *
     * @param make String - What brand it is
     * @param model String - Name of the model
     * @param category String - Says what kind of airplane is
     * @param capacity Interger - Number of seats
     */
    public AirPlane(String make, String model, String category, int capacity) {
        this.make = make;
        this.model = model;
        this.category = category;
        this.capacity = capacity;
    }

    /**
     * Method that returns AirPlane's make
     *
     * @return String make
     */
    public String getMake() {
        return make;
    }

    /**
     * Method that returns AirPlane's model
     *
     * @return String model
     */
    public String getModel() {
        return model;
    }

    /**
     * Method that returns AirPlane's seats
     *
     * @return Integer capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Method that returns the Pilot assign to a airplane
     *
     * @return Pilot pilot
     */
    public Pilot getPilot() {
        return pilot;
    }

    /**
     * Method that returns the Category
     *
     * @return String Category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Method that sets capacity
     * Where: category type A = Airplane seats &< 50
     * category type B = Airplane 50 > seats <= 150
     * category type C = Airplane 150 > seats <= 300
     * category type D = Airplane seats > 300 category type E = Cargo Airplane
     *
     *
     * @param capacity integer
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Method that sets category
     *
     * @param category String
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Method that assing a Pilot to a airplane
     *
     * @param pilot Pilot
     */
    public void assingPilot(Pilot pilot) {

        if (pilot.getRating() == 1 && category.equals("E")) {
            this.pilot = pilot;
        } else if (pilot.getRating() == 2 && (category.equals("E") || category.equals("A"))) {
            this.pilot = pilot;
        } else if (pilot.getRating() == 3 && (category.equals("E") || category.equals("A") || category.equals("B"))) {
            this.pilot = pilot;
        } else if (pilot.getRating() == 4 && (category.equals("E") || category.equals("A") || category.equals("B") || category.equals("C"))) {
            this.pilot = pilot;
        } else if (pilot.getRating() == 5 && (category.equals("E") || category.equals("A") || category.equals("B") || category.equals("C") || category.equals("D"))) {
            this.pilot = pilot;
        } else {
            System.out.print("Pilot is not allowed to fly");
        }
    }

    /**
     * Method that returns a Strinf of object
     *
     * @return String output
     */
    @Override // pq é um metodo da super classe objeto
    public String toString() {
        String output;
        output = "\t \n";
        output += "\t\tAircraft: " + this.make;
        output += " Model: " + this.model + "\n";
        output += "\t\tCapacity: " + this.capacity + " seats\n";
        output += "\t\tPilot : " + this.pilot.getName();
        return output;
    }

}
