package Animals;

import Animals.Canine;
import Animals.Dog;
import Animals.Wolf;

//import Animals.Giraffe;
import Animals.Okapis;

import java.util.Locale;
import java.util.Scanner;

public class AnimalTools {

    public static void getCanineDetails(){
        Canine canine;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input dog or wolf");

        String input = scanner.nextLine().toLowerCase();

        if (input.equals("dog")){
            canine = new Dog("Bork! Bork!", "Large", "Canis Lupus Familiaris",
                    "German Shepherd Dog", "Black and Tan");
        }else{
            canine = new Wolf("Hoooowwwwwwlll!", "Medium", "Canis Lupus Occidentalis",
                    "Northwestern Wolf", false, "North America");
            canine.printDetails();

            System.out.println("Would you like more details on a canine? (yes/y)");

            String response = scanner.nextLine().toLowerCase();

            if (response.equals("yes") || response.equals("y")) {
                getCanineDetails();
            }
        }
    }

//    public static void getGiraffidsInfo(){
//        Giraffids giraffids;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Input Giraffe or Okapis");
//
//        String input = scanner.nextLine().toLowerCase();
//
//        if (input.equals("giraffe")){
//            giraffids = new Giraffe("VEry tall", "Like a Deep Humming, very low - mrrrruuuum",
//                    "describes the type of hoof, closer to a pig than a horse and they walk on tip toes. " )
//            {
//            };
//        }
//    }

}
