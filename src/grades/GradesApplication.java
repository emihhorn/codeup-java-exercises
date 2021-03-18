package grades;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {

    public static void main(String[] args){

        Map<String, Integer> store = new HashMap<>();

        Student Emily = new Student("Emily", 95);
        Emily.addGrade(100);
        Emily.addGrade(80);

        Student William  = new Student("William", 89);
        William.addGrade(99);
        William.addGrade(88);

        Student Yasin = new Student("Yasin", 98);
        Yasin.addGrade(89);
        Yasin.addGrade(95);

        Student Carlos = new Student("Carlos", 99);
        Carlos.addGrade(87);
        Carlos.addGrade(97);

        Student.put("Emily");
        Student.put("William");
        Student.put("Yasin");
        Student.put("Carlos");

        viewUserByName();
//        viewStudent();

    }
    public static void viewUserByName(){
        System.out.println("Welcome\n");
}

}