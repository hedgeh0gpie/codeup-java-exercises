import java.util.Scanner;

public class ConsoleExercises {

	public static void main(String[] args) {
//        double pi = 3.14159;
//
//        System.out.format("The value of pi is approximately " + pi);

		Scanner scanner = new Scanner(System.in);


//      Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//        System.out.println("Enter an integer");
//        int userInt = scanner.nextInt();

//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//        System.out.println("Enter three words");
//        String userWord1 = scanner.nextLine();
//        String userWord2 = scanner.nextLine();
//        String userWord3 = scanner.nextLine();
//
//        System.out.println(userWord1);
//        System.out.println(userWord2);
//        System.out.println(userWord3);


//        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//        System.out.println("Enter a sentence");
//        String userSentence = scanner.next();
//        System.out.println(userSentence);


//        Do you capture all the words? Rewrite the above example using the nextLine method.
//		System.out.println("Enter a sentence");
//		String userSentence = scanner.nextLine();
//		System.out.println(userSentence);

//        Calculate the perimeter and area of Codeup's classrooms.
//        Prompt the user to enter values of length and width of a classroom at Codeup.
//        Use the nextLine method to get user input and parse the resulting string to a numeric type.
//        Assume that the rooms are perfect rectangles.
//        Assume that the user will enter valid numeric data for length and width.


		System.out.println("Enter the length of the classroom");
        int length = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter the width of the classroom");
		int width = Integer.parseInt(scanner.nextLine());
		int areaOfClassroom = length * width;
		int perimeterOfClassroom = (2 * length) + (2 * width);
		System.out.println("The area of the classroom is: " + areaOfClassroom);
		System.out.println("The perimeter of the classroom is: " + perimeterOfClassroom);




	}
}
