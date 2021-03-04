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
            long myNumber;
            System.out.println(myNumber);// not initialized
//    6.Change your code to assign the value 3.14 to myNumber. What do you notice?
//        myNumber = 3.14// incompatible types
//    7.Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
          myNumber =123L;
          System.out.println(myNumber);
//    8.Change your code to assign the value 123 to myNumber.
        myNumber = 123;
        System.out.println(myNumber);

//    9.Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?

//    10.Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        float myNumber2 = (float) 3.14;
        System.out.println(myNumber2);


//                Copy and paste the following code blocks one at a time and execute them



    }
}
