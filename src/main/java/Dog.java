/**
 * Represents a Dog with name, breed, and weight
 */
public class Dog {
    private String name;
    private String breed;
    private int weight;  // CHANGED FROM double TO int

    /**
     * Constructor for Dog class
     * @param name name of dog
     * @param breed breed of dog
     * @param weight weight of dog
     */
    public Dog(String name, String breed, int weight) {  // CHANGED TO int
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {  // CHANGED RETURN TYPE TO int
        return weight;
    }

    public void setWeight(int weight) {  // CHANGED PARAMETER TO int
        this.weight = weight;
    }
}