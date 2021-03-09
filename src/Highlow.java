import java.util.Scanner;

public class Highlow {

    public static void main(String[] args) {
        playgame(new Scanner(System.in), (int)(Math.random()*100)+ 1);
    }

    public static void playgame(Scanner scanner, int randomNumber){
        System.out.println("Please guess a number btw 1 - 100");


        int userGuess = scanner.nextInt();

        if(userGuess < 1 || userGuess > 100) {
            System.out.println("Your guess is out of bonds. Plz try again");
            playgame(scanner, randomNumber);
        }else{

         String response = checkGuess(userGuess, randomNumber);

            if (response.equals("Good job")) {
                System.out.println(response);
                return;
            }else{
                System.out.println(response);
                playgame(scanner, randomNumber);
            }
        }

    }


    public static String checkGuess(int guess, int targetNum){
        if (guess == targetNum) {
            return "You guessed the correct number";

        }else if (guess > targetNum){
            return "lower plz";

        }else if( guess < targetNum) {
            return "higer plz";
        }
        return "idk broh";
    }
}
