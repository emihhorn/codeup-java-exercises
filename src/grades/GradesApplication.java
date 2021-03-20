package grades;
import util.Input;
import java.util.HashMap;
import java.util.Map;


public class GradesApplication {

    private final Map<String, Student>students;
    private final Input input;
//   static HashMap<String, Student> student = new HashMap<>();

    public GradesApplication(Map<String, Student> students, Input input) {
        this.students = students;
        input = new Input();
        this.input = input;
    }

    //Starts app
    public void  init() {
        System.out.println("Welcome!");
        runInteraction();
    }

    private void runInteraction() {
//        System.out.println(getStudentList());
        System.out.println("\nWhich student would you like to see more info on?");
        String response = input.getString();
        if (students.containsKey(response)) {
//            System.out.println(getStudentInfo(response));
        } else {
            System.out.println("\nSorry no student found with that Github username of " + response);
        }
        System.out.println("\n Would you like to enter a new response?");
        boolean willContinue = input.yesNo();
        if (willContinue) {
            runInteraction();
        } else {
            System.out.println("\n Have a nice day!");
        }
    }
//Returns a message containing a list of students
    private String getStudentsList() {
        String output = "Here are the user names of our students:\n\n";
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            output += "|" + entry.getKey() + "|";
        }
        return "\n" + output.trim();
    }

    // Returns a formatted message containing student information
    private String getStudentInfo(String username) {
        return String.format(
                "%nName: %s - GitHub Username: %s%nCurrent Average: %.2f",
                students.get(username).getName(),
                username,
                students.get(username).getGradeAverage());
    }
    // Used to populate the HashMap of students
    private static HashMap<String, Student> createStudents() {

        HashMap<String, Student> students = new HashMap<>();

        Student s1 = new Student("Emily");
        s1.addGrade(100);
        s1.addGrade(80);

        Student s2 = new Student("William");
        s2.addGrade(99);
        s2.addGrade(88);

        Student s3 = new Student("Yasin");
        s3.addGrade(89);
        s3.addGrade(95);

        Student s4 = new Student("Carlos");
        s4.addGrade(87);
        s4.addGrade(97);

        students.put("Emily", s1);
        students.put("William", s2);
        students.put("Yasin", s3);
        students.put("Carlos", s4);

        return students;
    }
        public static void main(String[] args) {
            GradesApplication ga = new GradesApplication(createStudents(), new Input());
            ga.init();
        }


    }


//        System.out.println("Welcome\n");
//        System.out.println("Here are the Github usernames of our Students");

//        viewUserByName();
//        viewStudent();
//        boolean running = true;
//
//        while (running) {
//            System.out.println(returnDisplay());
//        }
//        String userResponse = promptUserForChoice();
//        running = chooseStudent(userResponse);
//
//    }
//    public static boolean chooseStudent(String choice){
//        boolean contRunning = true;
//
//        System.out.println("Welcome\n");
//        System.out.println("Here are the Github usernames of our Students");
//
//    switch (choice) {
//        case "no" -> contRunning = false;
//        case "Emily" -> viewUserByName();
//        case "William" -> viewUserByName();
//        case "Yasin" -> viewUserByName();
//        case "Carlos" -> viewUserByName();
//    }
//
//        System.out.println("Would you like to see another student?");
//        return contRunning;
//
//    }
//
//
//    private static String returnDisplay(){
//        String choices = """
//
//                What student would you like info on?
//
//                yasinmogultay | padillacarlos | baldridgewilliam | emilyhorn
//                """;
//
//        return choices;
//    }
//    private static String promptUserForChoice() {
//
//        Input input = new Input();
//
//        System.out.println("Enter your choice: ");
//
//        return input.getString().toLowerCase();
//
//    }
//
//    public static void viewUserByName() {
//        System.out.println("What student would you like info on?");
//        Input input = new Input();
//        String studentKey = input.getString();
//        if (student.containsKey(studentKey)) {
//            System.out.printf("Name: %s%n Github username: %s%n Average grade: %s%n All grades: %s%n%n", student.get(studentKey)
//                    .getName(), studentKey, student.get(studentKey).getGradeAverage(), student.get(studentKey).getGrades());
//        } else {
//            System.out.printf("Sorry, no student found with the username of %s", studentKey);
//        }
//    }




//        System.out.println("Which student's grades would you like to see?");
//        Scanner scanner = new Scanner(System.in);

//    }


