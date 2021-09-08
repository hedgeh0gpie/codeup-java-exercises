//      Create a class called MyTherapist
//      It should ask you how you are doing today?
//      Based on your response, it should give you some sort of advice.


import java.util.Scanner;

public class MyTherapist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How are you doing today?");
        String userResponse = scanner.nextLine();

        switch (userResponse) {
            case "Great" -> System.out.println("That makes me very happy to hear :)");
            case "So-so" -> System.out.println("Don't be too hard on yourself! Things are improving even if you don't perceive it!");
            case "Sad" -> System.out.println("It's okay! Just let it out. Sometimes we all need a good shoulder to cry on. Unfortunately, because I am a chat bot, I cannot provide one.");
            default -> System.out.println("Please insert one quarter or the equivalent in Bitcoin to continue. Therapy ain't cheap!");
        }

    }
}
