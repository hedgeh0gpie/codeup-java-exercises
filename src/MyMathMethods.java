//Create a class called MyMathMethods
//Have it take two integer parameters and return the product of the two integers
//Do not create a main method in your MyMathMethods class
//Instead, create a test class, and run your multiply method from a main method in your test class
//If you want a bonus, you can overload the method with a version that takes doubles instead of ints as its parameters
//As another bonus … after you’re done, refactor so the multiply method is static, then refactor your test so as to use the static method

public class MyMathMethods {

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static int quotient(int num1, int num2) {
        return num1 / num2;
    }

    public static double quotient(double num1, double num2) {
        return num1 / num2;
    }

    public static int sum(int[] num1, int[] num2) {
        int accumulator = 0;
        for (int number : num1) {
            accumulator += number;
        }
        for (int number : num2) {
            accumulator += number;
        }
        return accumulator;
    }

    public static double sum(double[] num1, double[] num2) {
        double accumulator = 0.0;
        for (double number : num1) {
            accumulator += number;
        }
        for (double number : num2) {
            accumulator += number;
        }
        return accumulator;
    }


}