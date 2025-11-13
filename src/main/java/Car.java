/**
 * The Car class represents a vehicle with make, model, year, and price attributes.
 * It provides constructors, getters, and setters for managing car information.
 */
public class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    /**
     * Constructs a new Car with the specified make, model, year, and price.
     *
     * @param make the manufacturer of the car
     * @param model the model of the car
     * @param year the manufacturing year of the car
     * @param price the price of the car in dollars
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * Returns the make of the car.
     *
     * @return the car's manufacturer
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets the make of the car.
     *
     * @param make the new manufacturer for the car
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Returns the model of the car.
     *
     * @return the car's model
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the model of the car.
     *
     * @param model the new model for the car
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Returns the year of the car.
     *
     * @return the car's manufacturing year
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the year of the car.
     *
     * @param year the new manufacturing year for the car
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Returns the price of the car.
     *
     * @return the car's price in dollars
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the car.
     *
     * @param price the new price for the car in dollars
     */
    public void setPrice(double price) {
        this.price = price;
    }
}