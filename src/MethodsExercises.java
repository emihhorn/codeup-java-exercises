import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println(Addition(4,4));
        System.out.println(Subtraction(4,2));
        System.out.println(multiMethod(3,3));
        System.out.println(divMethod(9,3));
        System.out.println(mod(1,2));

    }


    public static double Addition(double one, double two){
        return one + two;
    };

    public static double Subtraction(double one, double two){
        return one - two;
    }

    public static double multiMethod(double one, double two){
        return one * two;
    };

    public static double divMethod(double one, double two){
        return one / two;
    }
    public static double mod(double one, double two){
        return one % two;
    }


//public static void getInt(int min, int max) {
//
//do {
//    Scanner scanner = new Scanner(System.in);
//    System.out.printf("");
////}
//}



}

