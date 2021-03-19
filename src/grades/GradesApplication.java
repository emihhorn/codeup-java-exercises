package grades;
import util.Input;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
   static HashMap<String, Student> student = new HashMap<>();
    public static void main(String[] args){


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

//        viewUserByName();
//        viewStudent();
        boolean running = true;

        while (running) {
            System.out.println(returnDisplay());
        }
        String userResponse = promptUserForChoice();
        running = chooseStudent(userResponse);

    }
    public static boolean chooseStudent(String choice){
        boolean contRunning = true;

        System.out.println("Welcome\n");
        System.out.println("Here are the Github usernames of our Students");

    switch (choice) {
        case "no" -> contRunning = false;
        case "Emily" -> viewUserByName();
        case "William" -> viewUserByName();
        case "Yasin" -> viewUserByName();
        case "Carlos" -> viewUserByName();
    }

        System.out.println("Would you like to see another student?");
        return contRunning;

//        prompts();
    }


    private static String returnDisplay(){
        String choices = """
                
                What student would you like info on?
                                
                yasinmogultay | padillacarlos | baldridgewilliam | emilyhorn
                """;

        return choices;
    }
    private static String promptUserForChoice() {

        Input input = new Input();

        System.out.println("Enter your choice: ");

        return input.getString().toLowerCase();

    }

    public static void viewUserByName() {
        System.out.println("What student would you like info on?");
        Input input = new Input();
        String studentKey = input.getString();
        if (student.containsKey(studentKey)) {
            System.out.printf("Name: %s%n Github username: %s%n Average grade: %s%n All grades: %s%n%n", student.get(studentKey)
                    .getName(), studentKey, student.get(studentKey).getGradeAverage(), student.get(studentKey).getGrades());
        } else {
            System.out.printf("Sorry, no student found with the username of %s", studentKey);
        }
    }




//        System.out.println("Which student's grades would you like to see?");
//        Scanner scanner = new Scanner(System.in);

    }


