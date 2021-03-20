package grades;

import java.util.ArrayList;
import java.util.List;


//TODO:Create a class named Student. It should have private properties for the
// student's name, and grades. The grades property should be an ArrayList of integers.
// The student class should have a constructor that sets name property, and
// initializes the grades property as an empty ArrayList.

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.grades = new ArrayList<>();
        this.name = name;
    }



    public static String put(String student) {
        return student;
    }

    // Should have the following methods:
    // returns the student's name
    //   public String getName();
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    //   public void addGrade(int grade);
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    //   public double getGradeAverage();
    public double getGradeAverage() {

            return (double) grades.stream().reduce(Integer::sum).get() / grades.size();
        }

    // public class Grades {
    //on Stackoverflow
//    private Map<String, Integer> store = new HashMap<>();
//
//    public void storeMinimumGrade(Student student) {
//        Integer grade = store.get(student.getName());
//        if (grade == null || student.getGradeAverage() < grade) {
//            grade.toString(Integer.parseInt(name), grade);
//        }



//    }
}