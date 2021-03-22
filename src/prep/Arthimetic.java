package prep;

import java.util.Arrays;

public class Arthimetic {

    //Todo: square - takes in an int argument, returns the square of that number as an int
    // sum - takes in two numeric (your choice of type) arguments, returns the sum of both
    // difference - takes in two numeric (your choice of type) arguments, returns the difference between the two
    // product - takes in two numeric (your choice of type) arguments, returns the product (multiply)
    // average - takes in a numeric array as an argument, returns the average of that array

    public static int square (int number) {
        return number * number;
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int nums1, int nums2) {
       return nums1 - nums2;
    }

    public static int pro(int adds1, int adds2) {
        return adds1 * adds2;
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i : array) sum += i;
        return ((double) sum) / array.length;
    }

}
