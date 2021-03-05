import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    //Create a class named Bob with a main method for the following exercise.

    System.out.println("Ask Bob");
    String input = scanner.nextLine();
    if(input.endsWith("!")){
        System.out.println("Whoa, chill out!");
    }else if(input.endsWith("?")){
        System.out.println("Sure.");
    }else if(input.isEmpty()){
        System.out.println("Fine. Be that way!");
    }else{
        System.out.println("Whatever.");
    }

    //Bob is a lackadaisical teenager. In conversation, his responses are very limited.


    //Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
    //He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
    //He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
    //He answers 'Whatever.' to anything else.
    //Write the Java code necessary so that a user of your command line application can have a conversation with Bob.

}
}