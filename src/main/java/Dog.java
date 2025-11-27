/**
 * Represents a Dog with name, breed, and weight attributes.
 * This class provides methods to access and modify dog properties.
 * 
 * @author Parusan
 * @version 1.0
 */
public class Dog {
    private String name;
    private String breed;
    private int weight;

    /**
     * Constructs a new Dog with the specified name, breed, and weight.
     *
     * @param name the name of the dog, cannot be null
     * @param breed the breed of the dog, cannot be null
     * @param weight the weight of the dog in pounds, must be positive
     */
    public Dog(String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    /**
     * Returns the name of this dog.
     *
     * @return the dog's name as a String
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of this dog.
     *
     * @param name the new name for the dog, cannot be null
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the breed of this dog.
     *
     * @return the dog's breed as a String
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Sets the breed of this dog.
     *
     * @param breed the new breed for the dog, cannot be null
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Returns the weight of this dog.
     *
     * @return the dog's weight in pounds as an integer
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Sets the weight of this dog.
     *
     * @param weight the new weight for the dog in pounds, must be positive
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
}