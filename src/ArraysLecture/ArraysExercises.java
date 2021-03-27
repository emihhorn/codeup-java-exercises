package ArraysLecture;

import oopLecture.Person;

import java.util.Arrays;

public class ArraysExercises {

//


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        Person[] peeps = new Person[3];
        peeps[0] = new Person("Malakai");
        peeps[1] = new Person("Luke");
        peeps[2] = new Person("Madeline");


        peeps = addPerson(peeps, new Person("Landon"));


//            String[] Persons = {"John", "Paul", "Ringo"};
//    for (int i = 0; i < Persons.length; i += 1) {
//        System.out.println(Persons[i]);
//    }


        for (int i = 0; i < peeps.length; i+=1) {
            System.out.println(peeps[i].getName());
        }

    }

    public static Person[] addPerson(Person[] people, Person peeps){

        people = Arrays.copyOf(people, people.length+1);
        people[people.length - 1] = peeps;
        return people;


    }
}
