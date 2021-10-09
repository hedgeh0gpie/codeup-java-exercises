//TODO: Create a class named MethodsExercises. Inside of your class, write code to create the specified methods. Test your code by creating a main method and calling each of the methods you've created.

import java.util.Scanner;

public class MethodsExercises {

//    TODO: Basic Arithmetic
//
//    Create four separate methods. Each will perform an arithmetic operation:
//    Addition
//    Subtraction
//    Multiplication
//    Division
//
//    Each function needs to take two parameters/arguments so that the operation can be performed.
//
//    Test your methods and verify the output.
//
//    Add a modulus method that finds the modulus of two numbers.
//
//    Food for thought: What happens if we try to divide by zero? What should happen?
//
//    *Bonus*
//
//    Create your multiplication method without the * operator (Hint: a loop might be helpful).
//    Do the above with recursion.

    public static int Addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int Subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int Multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int Division(int num1, int num2) {
        return num1 / num2;
    }

    public static int Modulus(int num1, int num2) {
        return num1 % num2;
    }

//    TODO: Create a method that validates that user input is in a certain range
//
//    The method signature should look like this:
//
//    public static int getInteger(int min, int max);
//
//    and is used like this:
//
//      System.out.print("Enter a number between 1 and 10: ");
//      int userInput = getInteger(1, 10);
//
//    If the input is invalid, prompt the user again.
//
//    Hint: recursion might be helpful here!


    public static int getInteger(int min, int max) {
        System.out.print("Enter a number between 1 and 10: ");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        if (userInput < min || userInput > max) {
            getInteger(min, max);
        } else {
            System.out.println(userInput + " is indeed between " + min + " and " + max);
        }
        return userInput;
    }


//    TODO: Calculate the factorial of a number.
//
//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//
//    Factorials are denoted by the exclamation point (n!). Ex:
//
//            1! = 1               = 1
//            2! = 1 x 2           = 2
//            3! = 1 x 2 x 3       = 6
//            4! = 1 x 2 x 3 x 4   = 24

    public static long CalculateFactorial() {
        System.out.print("Enter a number between 1 and 10: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 1 || num > 10) CalculateFactorial();

        System.out.println("Would you like to continue? Y or N");

        String userResponse = sc.next();

        if (userResponse.equalsIgnoreCase("Y")) {
            long factorial = 1;
            for (var i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            System.out.println(factorial);
            return factorial;
        } else if (userResponse.equalsIgnoreCase("N")){
            System.out.println("OK! Exiting program");
        }
        return 0;
    }



//    TODO: Create an application that simulates dice rolling.
//
//    Ask the user to enter the number of sides for a pair of dice.
//    Prompt the user to roll the dice.
//    "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//    Use static methods to implement the method(s) that generate the random numbers.
//    Use the .random method of the java.lang.Math class to generate random numbers.


    public static void DiceRoll() {
        System.out.println("Enter the number of sides for a pair of dice.");
        Scanner sc = new Scanner(System.in);
        int diceSides = sc.nextInt();
        int roll1 = 0;
        int roll2 = 0;
        System.out.println("Press enter to roll a dice");
        Scanner sc2 = new Scanner(System.in);
        String readString = sc2.nextLine();
        while(readString != null) {
            if (readString.equals("")) {
                roll1 = (int) (Math.random() * diceSides) + 1;
                roll2 = (int) (Math.random() * diceSides) + 1;

                System.out.println("You rolled a " + (roll1 + roll2) + "!");

                System.out.println("Would you like to roll again?");
                String userResponse = sc.next();

                if (userResponse.equalsIgnoreCase("Y")) {
                    DiceRoll();
                } else if (userResponse.equalsIgnoreCase("N")){
                    System.out.println("OK! Exiting program");
                    break;
                }
            }
            if (sc2.hasNextLine()) {
                readString = sc2.nextLine();
            } else {
                readString = null;
            }
        }
    }

    public static void main(String[] args) {

        System.out.println(Addition(7, 7));
        System.out.println(Subtraction(7, 7));
        System.out.println(Multiplication(7, 7));
        System.out.println(Division(7, 7));
        System.out.println(Modulus(7, 7));

        getInteger(1, 10);

        CalculateFactorial();
        DiceRoll();


    }

}
