import java.util.Scanner;

public class ConsoleIOLectureMiniExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String userName = scanner.nextLine();
//        System.out.println("Your name is " + userName);
        System.out.printf("Your name is %s", userName);
    }
}

