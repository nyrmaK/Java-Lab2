public class Wolf extends Animal {
    private String breed;
    private int Age;
    private boolean Pups;

    // Constructor
    public Wolf(String name, int Age, String breed, boolean Pups) {
        super(name, Age); // Call the superclass constructor
        this.breed = breed;
        this.Pups = Pups;
    }

    // Getter and Setter for breed
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return Age;

    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public boolean getPups() {
        return Pups;
    }

    public void setPups(boolean Pups) {
        this.Pups = Pups;
    }

    // Implementing the abstract method from Animal
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: OoooOHhhh!");
    }

    // Overriding the displayInfo method to include breed
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Breed: " + getBreed());
        System.out.println("Has Pups: " + getPups());
    }
}
