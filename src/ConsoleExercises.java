import java.util.Scanner;

public class ConsoleExercises {
//    public class ConsoleIOLecture {

        public static void main(String[] args) {
            double pi = 3.14159;
            System.out.printf("\n The value of pi is approximately %.2f. \n", pi);
            // ================================== print() and println()


            int age = 23;
            String name = "Fred";
            String state = "Texas";
            System.out.printf("%s is from %s!", name, state);

// Fred is from Texas and is 23 years old


            // ================================== USER INPUT
   /* TODO: use the scanner to take in the name of the month you were born
                 and print it back out
            - remember to first prompt the user for the input
         */
//        Scanner sc = new Scanner(System.in);
            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter month you were born");
            String month = sc.next();
            System.out.println("You were born in " + month);

//            sc.nextLine();
//            String month = sc.nextLine();


/* TODO: use the scanner to take in your birthday as an integer and then name of the month you were born
    and print it back out.
            - remember to first prompt the user for the birthday day of the month and store as an integer
            - next take in name of the month with .nextLine()
            - print out the result
            - use a fix to prevent the month name input from being skipped
         */
            // .next() captures each input separated by a string:
//            System.out.print("Please enter your first, middle, and last name: ");
//            String firstName = sc.next();
//            String lastName = sc.next();
//            String what = sc.next();
//
//            System.out.println(firstName);
//            System.out.println(lastName);
//            System.out.println(what);

            // .nextInt() captures the first valid int value:
//            System.out.print("Please enter your age: ");
//            int age = sc.nextInt();
//            System.out.println(age);

            // .nextLine():
//            System.out.print("Favorite quote: ");
//            String quote = sc.nextLine();
//            System.out.println(quote);

            // Quirk of using next() then nextLine()...
            // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
            // https://coderanch.com/wiki/676482/Scanner-nextLine-gotcha




        }

    }


