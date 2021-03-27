package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println(returnMenuDisplay());
            int response = promptUserForChoice();
            running = executeUserChoice(response);
        }
    }

    private static boolean executeUserChoice(int choice) {
        boolean continueRunningApp = true;
        switch (choice) {
            case 0:
                System.out.println("exit");
                continueRunningApp = false;
                break;
            case 1:
                for (Movie movie : MoviesArray.findAll()) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
                break;
            case 2:
                viewMoviesByCategory("animated");
                break;
            case 3:
                viewMoviesByCategory("drama");
                break;
            case 4:
                viewMoviesByCategory("horror");
                break;
            case 5:
                viewMoviesByCategory("scifi");
                break;
        }
        return continueRunningApp;
    }

    private static void viewMoviesByCategory(String category) {
        for (Movie movie : MoviesArray.findAll()) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    private static String returnMenuDisplay() {
        System.out.println("What would you like to do?");
        String choices = "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category";
        return choices;
    }

    private static int promptUserForChoice() {
        Input input = new Input();
        System.out.print("Enter your choice: ");
        int response = input.getInt(0, 5);
        return response;
    }

}