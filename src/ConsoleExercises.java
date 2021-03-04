import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {


//Explore the Scanner Class.
//Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        String first = sc.next();
        String second = sc.next();
        String third = sc.next();

        System.out.println(first + second + third);
            System.out.print("Please enter an integer: ");
            int userInt = sc.nextInt();
            System.out.println(userInt);

//What happens if you input something that is not an integer?
       // input mismatch exception
//Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//

        System.out.print("Enter 3 words: ");
             String word1 = sc.next();
             String word2 = sc.next();
             String word3 = sc.next();
             System.out.println(word1);
             System.out.println(word2);
             System.out.println(word3);

        //        // What happens if you enter less than 3 words?
////             It won't let you continue with out finishing the inputs
//
//        //  What happens if you enter more than 3 words?
////             It will take only the first three inputs
//
//        // Prompt a user to enter a sentence, then store that sentence in a String variable using the .next method, then display that sentence back to the user.
             System.out.println("Please enter a sentence:");
             String sentence = sc.next();
             System.out.println(sentence);

//        // do you capture all of the words?
//            // no
//
//        // Rewrite the above example using the .nextLine method.
//
//            System.out.println("Please enter a sentence:");
//            String sentence = sc.nextLine();
//            System.out.println(sentence);
//
//        // Calculate the perimeter and area of Codeup's classrooms. Prompt the user to enter values of length and width of the class. Use the .nextLine method to get user input and cast the resulting string to a numeric type.
//
//            System.out.println("Enter the length: ");
//            String lengthInput = sc.nextLine();
//            System.out.println("Enter the width: ");
//            String widthInput = sc.nextLine();

//
//            double length = Double.parseDouble(lengthInput);
//            double width = Double.parseDouble(widthInput);
//            System.out.println("The area is: " + (length * width) + ".");
//            System.out.println("The perimeter is: " + (length * 2 + width * 2) + ".");
//
//
//        // Assume that the rooms are perfect rectangles.
//
//
//
//        // Assume that the user will enter valid numeric data for length and width.
//        // Display the area and perimeter of that classroom.
//
//        // area = length x width
//        // perimeter = 2 x length + 2 x width
//
//        // Bonus
//
//        // Accept decimal entries
//        // Calculate the volume of the rooms


    }

    }


