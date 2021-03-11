package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.next();
//        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
//            return true;
//        }else{
//            return false;
//        }
        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
    }

    public double getDouble() {
        if(scanner.hasNextDouble()) {
            return scanner.nextDouble();
        }else{
            System.out.println("Invalid, try again");
            scanner.nextLine();
            return getDouble();//recursion
        }
    }

    public double getDouble(double min, double max) {
        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        }else{
            System.out.println("out of range");
            return getDouble(min, max);
        }
    }

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("enter number btw 1-3.6");
        double userDouble = input.getDouble(1, 3.6);
        System.out.println("You entered: " + userDouble);


//        int userInt = input.getDouble();
//        System.out.println("Your int is:" + userDouble);
//

//        boolean willCont = input.yesNo();
//        if (willCont) {
//            System.out.println("Continuing...");
//        } else {
//            System.out.println("Exiting the matrix");
//        }


//        String userInput = input.getString();
//        System.out.println(userInput);
    }
}
