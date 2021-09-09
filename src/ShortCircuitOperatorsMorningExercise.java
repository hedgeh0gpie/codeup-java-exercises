import java.util.Scanner;

public class ShortCircuitOperatorsMorningExercise {
    public static void main(String[] args) {

//      Write a Java program using that asks the user for their age and then tells them if they are a teenager or not.
//      Bonus: if not, tell them whether they are younger or older than a teenager.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");

        int userAge = Integer.parseInt(scanner.nextLine());

        if (userAge < 20 && userAge > 12) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are not a teenager");
        }

//          Justin's example
//        public static void main(String[] args) {
//
//            int num1 = 1;
//            int num2 = 10;
//
//            if (++num1 == 0 && ++num2 == 0) {
//
//            }
//
//            System.out.println(num1);
//            System.out.println(num2);
//
//        }
//        The output will be different based on using && or &



    }

}
