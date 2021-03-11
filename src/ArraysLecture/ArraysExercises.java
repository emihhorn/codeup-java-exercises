package ArraysLecture;

import OopLecture.Person;

import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        Person[] peeps = new Person[3];
        peeps[0] = new Person("Malakai");
        peeps[1] = new Person("Luke");
        peeps[2] = new Person("Madeline");

//            String[] Persons = {"John", "Paul", "Ringo"};
//    for (int i = 0; i < Persons.length; i += 1) {
//        System.out.println(Persons[i]);
//    }

        for (int i = 0; i < peeps.length; i+=1) {
            System.out.println(peeps[i].getName());
        }

    }
}
