package Animals;
import Animals.Dog;
import Animals.Wolf;

import Animals.Giraffids;
import Animals.Okapis;

import java.util.Scanner;
public class AnimalApp {
    public static void main(String[] args) {
        getDetails();
    }
    public static void getDetails() {
        Dog dog = new Dog("Bork! Bork!", "Large", "Canis Lupus Familiaris",
                "German Shepherd Dog", "Black and Tan");

        Wolf wolf = new Wolf("Hoooowwwwwwlll!", "Medium", "Canis Lupus Occidentalis",
                "Northwestern Wolf", false, "North America");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 'dog' or 'wolf' to know its details: ");

        String input = scanner.nextLine().toLowerCase();

        if (input.equals("dog")) {
            dog.printDetails();
        } else {
            wolf.printDetails();
        }
    }





}
