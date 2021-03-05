import java.util.Scanner;
import java.util.stream.IntStream;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("\n Hello Worlds");

    //Loop Basics
    //
    //While
    //
    //Create an integer variable i with a value of 5.

    //Create a while loop that runs so long as i is less than or equal to 15

    //Each loop iteration, output the current value of i, then increment i by one.

    //Your output should look like this:
    //
    //5 6 7 8 9 10 11 12 13 14 15

//    int i = 5;
//    while (i < 15) {
//        System.out.println("i is" + i);
//        i++;
//    }

    //Do While
    //
    //Create a do-while loop that will count by 2's starting with 0 and ending at
        // 100. Follow each number with a new line.
//    int i = 0;
//    do {
//        System.out.println(i);
//        i +=2;
//    }while(i<102);
        //Alter your loop to count backwards by 5's from 100 to -10.
//    int i = 100;
//    do {
//        System.out.println(i);
//        i -=5;
//    }while (i>=-10);

        //Create a do-while loop that starts at 2,
        // and displays the number squared on each line while the number
        // is less than 1,000,000. Output should equal:
    //
    // 2
    // 4
    // 16
    // 256
    // 65536
    //For
//
//    double i = 2;
//    do{
//        System.out.printf("%.0f\n", i);
//        i = Math.pow(i, 2);
//    }while(i<1000000);



    //Refactor the previous two exercises to use a for loop instead.

//        for(int i = 100; i>=-10; i -=5){
//            System.out.println(i);
//        }
//        for(double i = 2; i<1000000; i = Math.pow(i, 2)) {
//            System.out.printf("%.0f\n", i);
//        }


    //Fizzbuzz
//        for(int i = 1; i < 100; i++) {
//            System.out.println(i);
//            if (i == 5) {
//                break; // --------------+
//            } //                        |
//        }
//
//        for(double i = 1; i<100; i++) {
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.printf("FizzBuzz %.0f\n", i);
//            } else if(i % 5 == 0){
//                System.out.printf("Buzz %.0f\n", i);
//            } else if(i % 3 == 0) {
//                System.out.printf("Fizz %.0f\n", i);
//            }
//            else{
//                System.out.printf("%.0f\n", i);
//            }
//        }


    //One of the most common interview questions for entry-level programmers is the FizzBuzz test.
        // Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
    //
    //Write a program that prints the numbers from 1 to 100.
    //For multiples of three: print “Fizz” instead of the number.
    //For the multiples of five: print “Buzz”.
    //For numbers which are multiples of both three and five: print “FizzBuzz”.
    //Display a table of powers.
        //System.out.printf("%-6d | %-7d | %d \n", i, i * i, i * i * i); -> that’s what Audi did.


        System.out.println("Here is your table!");
        System.out.println(" ");
        System.out.println("number" + " | " + "squared" + "  | " + "cubed");
        System.out.println("------" + " | " + "-------" + "  | " + "-----");
            final int NMAX = 3;
            final double XMAX = 5;

            for(int n = 1; n <= NMAX; n++) {
                System.out.printf("%7d", n);
            }
        System.out.println();
            for(int n = 1; n <= NMAX; n++){
                System.out.printf("%7s", "");
            }
            System.out.println();

            for (double x = 1; x <=XMAX; x++) {
                for (int n = 1; n <= NMAX; n++) {
                    System.out.printf("%7.0f", Math.pow(x,n));
                }
                System.out.println();
            }

    //Prompt the user to enter an integer.
    //Display a table of squares and cubes from 1 to the value entered.
    //Ask if the user wants to continue.
    //Assume that the user will enter valid data.
    //Only continue if the user agrees to.
    //Example Output
    //
    //
    //What number would you like to go up to? 5
    //
    //Here is your table!
    //
    //number | squared | cubed
    //------ | ------- | -----
    //1      | 1       | 1
    //2      | 4       | 8
    //3      | 9       | 27
    //4      | 16      | 64
    //5      | 25      | 125
    //Convert given number grades into letter grades.
    //
    //Prompt the user for a numerical grade from 0 to 100.
    //Display the corresponding letter grade.
    //Prompt the user to continue.
    //Assume that the user will enter valid integers for the grades.
    //The application should only continue if the user agrees to.
    //Grade Ranges:
    //
    //A : 100 - 88
    //B : 87 - 80
    //C : 79 - 67
    //D : 66 - 60
    //F : 59 - 0
    //Bonus
    //
    //Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).
}

}