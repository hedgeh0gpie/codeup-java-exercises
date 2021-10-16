import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {


//        TODO: Loop Basics
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }


//        Create a do-while loop that will count by 2's starting with 0 and ending at 100.
//        Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
//        Output should equal:
//
//        2
//        4
//        16
//        256
//        65536

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);


//      Refactor the previous two exercises to use a for loop instead.

//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }
//
//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

//      TODO: Fizzbuzz
//      One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//      Write a program that prints the numbers from 1 to 100.
//      For multiples of three: print “Fizz” instead of the number.
//      For the multiples of five: print “Buzz”.
//      For numbers which are multiples of both three and five: print “FizzBuzz”.

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            }
//        }

//      TODO: Display a table of powers
//      Prompt the user to enter an integer.
//      Display a table of squares and cubes from 1 to the value entered.
//      Ask if the user wants to continue.
//      Assume that the user will enter valid data.
//      Only continue if the user agrees to.
//
//      Example Output
//
//      What number would you like to go up to? 5
//
//      Here is your table!
//
//      number | squared | cubed
//      ------ | ------- | -----
//      1      | 1       | 1
//      2      | 4       | 8
//      3      | 9       | 27
//      4      | 16      | 64
//      5      | 25      | 125

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter an integer");
//        int userInt = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");

//      Got Albert's help with formatting
//        for (int i = 1; i <= userInt; i++) {
//            long s = i * i;
//            long c = i * i * i;
//
//            System.out.printf("%-7d", i);
//            System.out.print(" | ");
//            System.out.printf("%-7d", s);
//            System.out.print(" | ");
//            System.out.printf("%-7d", c);
//            System.out.println("");
//        }

//        Shelby's brother's (Joel) solution
//            for (int i = 1; i <= userInt; i++)    {
//                System.out.printf("%-7d| %-8d| %-5d%n", i, i*i, i*i*i);
//            }


//        TODO: Convert given number grades into letter grades.
//        Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//        Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//
//        Grade Ranges:
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0


//        System.out.println("Please enter a numerical grade from 0 to 100");
//        int userNumberGrade = Integer.parseInt(scanner.nextLine());
//        String userLetterGrade = "";
//
//        if (userNumberGrade >= 88) {
//            userLetterGrade = "A";
//        } else if (userNumberGrade < 88 && userNumberGrade >= 80) {
//            userLetterGrade = "B";
//        } else if (userNumberGrade < 80 && userNumberGrade >= 67) {
//            userLetterGrade = "C";
//        } else if (userNumberGrade < 67 && userNumberGrade >= 60) {
//            userLetterGrade = "D";
//        } else if (userNumberGrade < 60) {
//            userLetterGrade = "F";
//        }
//
//        System.out.println("Would you like to continue? Y or N");
//        String userChoice = scanner.nextLine();
//
//        if (userChoice.equalsIgnoreCase("Y")) {
//            System.out.println("Your grade is: " + userLetterGrade);
//        } else {
//            System.out.println("Don't be scared to find out your grade!");
//        }

//        TODO: Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).

        System.out.println("Please enter a numerical grade from 0 to 100");
        int userNumberGrade = Integer.parseInt(scanner.nextLine());
        String userLetterGrade = "";

        if (userNumberGrade <= 100 && userNumberGrade >= 98) {
            userLetterGrade = "A+";
        } else if (userNumberGrade < 98 && userNumberGrade >= 92) {
            userLetterGrade = "A";
        } else if (userNumberGrade < 92 && userNumberGrade >= 88) {
            userLetterGrade = "A-";
        } else if (userNumberGrade < 88 && userNumberGrade >= 86) {
            userLetterGrade = "B+";
        } else if (userNumberGrade < 86 && userNumberGrade >= 83) {
            userLetterGrade = "B";
        } else if (userNumberGrade < 83 && userNumberGrade >= 80) {
            userLetterGrade = "B-";
        } else if (userNumberGrade < 80 && userNumberGrade >= 75) {
            userLetterGrade = "C";
        } else if (userNumberGrade < 75 && userNumberGrade >= 70) {
            userLetterGrade = "C";
        } else if (userNumberGrade < 70 && userNumberGrade >= 67) {
            userLetterGrade = "C";
        } else if (userNumberGrade < 67 && userNumberGrade >= 65) {
            userLetterGrade = "D+";
        } else if (userNumberGrade < 65 && userNumberGrade >= 62) {
            userLetterGrade = "D";
        } else if (userNumberGrade < 62 && userNumberGrade >= 60) {
            userLetterGrade = "D-";
        } else if (userNumberGrade < 60) {
            userLetterGrade = "F";
        }


        System.out.println("Would you like to continue? Y or N");
        String userChoice = scanner.nextLine();

        if (userChoice.equalsIgnoreCase("Y")) {
            System.out.println("Your grade is: " + userLetterGrade);
        } else {
            System.out.println("Don't be scared to find out your grade!");
        }

    }

}
