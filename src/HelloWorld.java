public class HelloWorld {
    public static void main(String[] args) {
        System.out.println();

//   1.Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
            int myFavoriteNumber = 741;
            System.out.println(myFavoriteNumber);
//    2.Create a String variable named myString and assign a string value to it, then print the variable out to the console.
            String myString = "Hola, buenes dias.";
            System.out.println(myString);
//    3.Change your code to assign a character value to myString. What do you notice?
//            String myString = "Ni Hao"; //incompatible types
//            System.out.println(myString);
//    4.Change your code to assign the value 3.14159 to myString. What happens?
//        String myString = 3.14159; //incompatible types
//        System.out.println(myString);
//    5.Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//            long myNumber;
//            System.out.println(myNumber);// not initialized
//    6.Change your code to assign the value 3.14 to myNumber. What do you notice?
//        myNumber = 3.14// incompatible types
//    7.Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//          myNumber =123L;
//          System.out.println(myNumber);
//    8.Change your code to assign the value 123 to myNumber.
//        myNumber = 123;
//        System.out.println(myNumber);

//    9.Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?

//    10.Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        float myNumber2 = (float) 3.14;
        System.out.println(myNumber2);


//                Copy and paste the following code blocks one at a time and execute them



        int x = 5;
        System.out.println(x++);
        System.out.println(x);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//

//Try to create a variable named class. What happens?
//
//Object is the most generic type in Java. You can assign any value to a variable of type Object.
// What do you think will happen when the following code is run?

 String theNumberThree = "three";
 Object o = theNumberThree;
 int three = (int) o;
//error @ runtime
//Copy and paste the code above and then run it. Does the result match with your
// expectation?
//   How is the above example different from the code block below?

//        int three = (int) "three";


//Rewrite the following expressions using the relevant shorthand assignment operators:

//        int x = 4;
//        x = x + 5;


//        int x = 3;
//        int y = 4;
//        y = y * x;

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;


 //       What happens if you assign a value to a numerical variable that is larger
        //       (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?

  //      Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later)
        //      that holds the maximum value for the int type.
    }
}
