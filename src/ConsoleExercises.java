public class ConsoleExercises {
//    public class ConsoleIOLecture {

        public static void main(String[] args) {

            // ================================== print() and println()

            // this:
//            System.out.println("here");
//            System.out.println("there");

            // is equivalent to this:
//            System.out.print("here\n");
//            System.out.print("there\n");

            // without the newline characters, print outputs this:
//            System.out.print("here");
//            System.out.print("there");

            // to concatenate, just like JS:
//            System.out.println("Hello" + " " + "World");

            // ================================== printf() / .format()

            // Print a formatted string using the following... printf(formatString, data)

            // same output as print():
//            System.out.printf("Hello");
//            System.out.printf("World!");

            // creating a string variable:
            String bigBall = "World";
            System.out.printf("Hello %s", bigBall);
            System.out.printf("Hello %S", bigBall); // all caps

            // multiple variables:
//            int three = 3;
//            String typeOfPetGroup = "cats";
//            System.out.printf("I have %d %s.", three, typeOfPetGroup);

            // currency:
//            int currencyPennies = 1431;
//            System.out.printf("I'll sell you swamp land for $%.2f an acre!", currencyPennies / 100.00);


            // ================================== USER INPUT

//        Scanner sc = new Scanner(System.in);

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
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Please enter your favorite number: ");
//            int num = sc.nextInt();
//            System.out.println(num);
//            System.out.print("Please enter your favorite words: ");
//            String words = sc.nextLine();
//            System.out.println(words);

        }

    }


