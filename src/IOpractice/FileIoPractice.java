package IOpractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIoPractice {
    public static void main(String[] args) {
        Path path = Paths.get("src/IOpractice/people.txt");
        List<String> names = new ArrayList<>();
        List<String> bNames = new ArrayList<>(Arrays.asList());

        try {
            names = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(names);

        for (String name : names) {
            System.out.println(name + " works at Codeup!");
        }
    }

    //MINI-EXERCISE
    //- create a class called `FileIoPractice` with a main method
    //- add a `fileIo` folder to the root of your codeup-java-exercises project.
    //- within this folder, add a text file, `people.txt`.
    //- add the following contents to the file:
    //Justin
    //Casey
    //Ry
    //David
    //- write code in the main method that prints the following messages:
    //“Justin works at Codeup.”
    //“Casey works at Codeup.”
    //“Ry works at Codeup.”
    //“David works at Codeup.”
    //- create an array list of new names for the people in your breakout room
    //- add code to your main method that replaces the contents of `people.txt` with the people in your breakout room
    //- set the contents of the text file back to Codeup staff
    //- create a static method, `deleteEntry`, that takes in the name of someone (a string) and when invoked, rewrites a new list to the `people.txt` file
    //  with all entries except the passed in name (bonus: make the name to delete case insensitive)

}
