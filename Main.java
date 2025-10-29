public class Main {
    public static void main(String[] args) {
        Wolf myWolf =  new Wolf("W-103",0, "Grey Wolf", false);
        myWolf.displayInfo(); // Displays: Name: Buddy, Age: 3, Breed: Golden Retriever
        myWolf.makeSound(); // Displays: Buddy says: Woof!
    }
}
