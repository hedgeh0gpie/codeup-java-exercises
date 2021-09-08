import java.util.Scanner;


public class MethodsMiniExercises {

    public static String enterString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an input.");
        String stringInput = sc.nextLine();
        return stringInput;
    }


    public static int enterInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer.");
        int intInput = sc.nextInt(); // assume the user will enter a valid integer
        return intInput;
    }


    public static void lengthMatch() {
        String stringInput = enterString();
        int intInput = enterInt();
        if (stringInput.length() == intInput) {
            System.out.println("That matches the length of the input!");
        } else {
            System.out.println("That doesn't match the length of the input!");
        }
    }


    // TODO: break the following code apart into a few methods
    public static void main(String[] args) {
        lengthMatch();
    }

}