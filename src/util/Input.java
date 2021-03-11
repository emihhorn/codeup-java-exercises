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


    public static void main(String[] args) {
        Input input = new Input();
        String userInput = input.getString();
        System.out.println(userInput);
    }
}
