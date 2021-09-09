//      TODO: create a class, MethodWarmup, and add an empty main method.
//      TODO: create a method, getDifference, that takes in two integers and returns the difference between the higher integer and the lower integer (subtract).
//        - If both integers are equal, the order of operands doesn’t matter in the calculation.
//        - If only one integer is passed, treat the calculation as if zero was passed as the second argument.
//        *** BONUS *** allow the method to accept two doubles and return a double output

// STILL NOT FINISHED
import java.util.Scanner;

public class MethodWarmup {


    public static int getDifference(int num1, int num2) {
        return Math.max(num1, num2) - Math.min(num1, num2);
    }

    public static int getDifference(int num1) {
            return num1;
        }

// JUSTIN'S SOLUTION
//    public static int getDifference(int num) {
//        return getDifference(num, 0);
//    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter another number");
        int num2 = Integer.parseInt(sc.nextLine());

        System.out.println(getDifference(num1, num2));

    }
}
