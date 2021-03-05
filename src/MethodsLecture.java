import java.util.Locale;
import java.util.Scanner;

public class MethodsLecture {
    public static void main(String[] args) {
        System.out.println(getNameString("Emily"));



        String name1 = "Casey";
        String name2 = "Emily";
        String name3 = "Yolanda";
//        printName(name1);
//        printName(name1, name2);
//        printName(name1, name2, name3);
//
//        printMultiplication(2, 5 );
//        Scanner scanned = new Scanner(System.in);
//program code
    }
    // ============== Method Definitions ===============
// *** Access Modifiers ***
    public static String getNameString(String name) {
        if ((name == null) || (name.equals(""))) {
            return "no name provided";
//        } else if () {
        } else {
            return getFormattedName(name, "Why, hello ");
        }
    }

    public static String getFormattedName(String name, String greeting){


        return greeting + name.toUpperCase();
    }
// *** Static vs Instance ***
    public static int doTheMath(){
        return 1 + 2;
    }

    public int doTheMathInst(){
        return 1 + 2;
    }
// *** Returning vs Void ***
    public static String getGreeting(){
        return "Hi!";
    }
    public static void printGreeting(){
        System.out.println(getGreeting());
    }

// *** Parameters ***
// ============ Mini Exercise #1 =============

    /* TODO:
     *   -Write a public static method which returns an integer
     *   -The method should take in *two parameters* and *return* the product of multiplying them
     *   -Print the output to the console by calling the method, passing in params, and logging its output
     *   BONUS: Use the Scanner class to get the numbers from the user input
     * */
    public static int doMath(int num1, int num2){
        return num1 * num2;
    }
    public static void printMultiplication(int num1, int num2){
        System.out.println(doMath(num1, num2));
    }

// ============== Method Overloading ===============
// ============ Mini Exercise #2 =============
    /* TODO: Write a set of overloaded public static void methods which can take in 1-3 names and print them to the console
     *   -Call each of the methods, passing in the names for each
     *   -Minus 1000pts if you don't use an oxford comma on the 3 param version
     *   BONUS: Use the Scanner class to get the names from user input
     *  */

public static void printNames(String name){
    System.out.printf("Hello, %s", name);
}
public static void printName(String name1, String name2){
    System.out.printf("Hello, %s, %s and %s\n", name1,name2);
}
// ============== Recursion ===============
// ============== Responsible Method Use ===============

}
