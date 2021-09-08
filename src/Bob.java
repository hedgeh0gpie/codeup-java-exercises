//        TODO: Create a class named Bob with a main method for the following exercise.
//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.
//
//        Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
//


import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How are you doing today?");
        String userResponse = scanner.nextLine().toLowerCase();

        if (userResponse.endsWith("?")) {
            System.out.println("Sure.");
        } else if (userResponse.endsWith("!")) {
            System.out.println("Woah, chill out!");
        } else if (userResponse.equals("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }

    }
}
